package problang.builder;

import problang.elems.Configuration;
import problang.elems.Distribution;
import problang.elems.Program;
import problang.elems.State;

/**
 * Created by lorynf on 09/01/17.
 */
public final class DistributionTransformer {
    public static Distribution distributeAffectation(Configuration c) {
        Distribution d = new Distribution();
        Program p = c.getProgram();
        Program p1 = new Program(p.getCommands().subList(1,p.getCommands().size()));
        State s = c.getState();
        assert p.getCommand(0).affectation() != null;
        if (p.getCommand(0).affectation().expr() != null) {
            String var = p.getCommand(0).affectation().var().IDENT().getText();
            int value;
            if (p.getCommand(0).affectation().expr().NUMBER() != null) {
                value = Integer.parseInt(p.getCommand(0).affectation().expr().NUMBER().getText());
                s.getMemory().put(var,value);
            }
            d.getElements().put(new Configuration(p1,s),1.0);
        } else {
            assert p.getCommand(0).affectation().probFunc() != null;
            //TODO
        }
        return d;
    }
}
