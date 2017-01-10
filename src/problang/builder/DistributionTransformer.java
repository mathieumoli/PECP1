package problang.builder;

import problang.elems.*;

/**
 * Created by lorynf on 09/01/17.
 */
public final class DistributionTransformer {

    public static Distribution transformation(Distribution d) {
        // La distribution finale à remplir
        Distribution d1 = new Distribution();

        // On boucle sur les configurations de la distribution
        for (Configuration c : d.getElements().keySet()) {
            // On récupère le programme
            Program p = c.getProgram();

            // Si la première commande est une affectation
            if (p.getCommand(0).affectation() != null) {
                d1 = applyAffectationRule(c, d1);
            }
            // TODO les autres regles
        }
        return d1;
    }

    private static Distribution applyAffectationRule(Configuration c, Distribution d1) {
        Program p = c.getProgram();
        State s = c.getState();

        // On crée le programme qu'on aura après l'affectation (le reste du programme)
        Program p1 = new Program(p.getCommands().subList(1, p.getCommands().size()));

        String var = p.getCommand(0).affectation().var().IDENT().getText();

        // Premier cas : on affecte une expression
        if (p.getCommand(0).affectation().expr() != null) {
            int value;
            // Si c'est un nombre, on récupère la valeur
            if (p.getCommand(0).affectation().expr().NUMBER() != null) {
                value = Integer.parseInt(p.getCommand(0).affectation().expr().NUMBER().getText());
            }
            // Si c'est une variable, il faut récupérer la valeur dans la mémoire
            else {
                assert p.getCommand(0).affectation().expr().var() != null;
                //TODO
                value = 0;
            }
            // Si il y a une opération...
            if (p.getCommand(0).affectation().expr().op() != null) {
                //TODO
                value = 0;
            }
            // TODO verifier que var n'est pas déjà dedans
            s.getMemory().put(var, value);

            // TODO si on a déjà cette configuration additionner la probabilité
            d1.getElements().put(new Configuration(p1, s), 1.0 * d1.getElements().get(c));
        }
        // Deuxième cas : on affecte une fonction probabiliste
        else {
            assert p.getCommand(0).affectation().probFunc() != null;
            //TODO
        }
        return d1;
    }
}
