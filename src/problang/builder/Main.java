package problang.builder;

import java.io.IOException;

/**
 * Created by lorynf on 10/01/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Distributions pour CPA-EG");
            DistributionTransformer.getFinalDistribution("out/production/Projet1/FichiersTest/CPA-EG");
            System.out.println();
            System.out.println();
            System.out.println("Distributions pour le fichier test");
            DistributionTransformer.getFinalDistribution("out/production/Projet1/FichiersTest/affectation");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Petit point pour Loryn:
    - Tenter l'appel de fonctions et voir avec la prof si ça passe (et si ça fait un inline)
    - Gérer le code de l'adversaire, qui est le seul à pouvoir modifier une variable a, distribution RANDOM
    - Est-ce qu'on doit faire les transformations de code nous-même pour ElGamal ?
    - Implémentation de la fonction d'équivalence entre deux progammes pour une liste de variables ?
        equiv(p1,p2,varList)
    - ...
 */