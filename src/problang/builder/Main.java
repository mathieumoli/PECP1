package problang.builder;

import antlr.ProbabilisticLanguageLexer;
import antlr.ProbabilisticLanguageParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import problang.elems.Configuration;
import problang.elems.Distribution;
import problang.elems.Program;
import problang.elems.State;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by lorynf on 10/01/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // initialiser le lexer et le parser
            ANTLRInputStream in = new ANTLRInputStream(new FileReader("out/production/Projet1/FichiersTest/affectation"));
            ProbabilisticLanguageLexer lexer = new ProbabilisticLanguageLexer(in);
            BufferedTokenStream tokens = new CommonTokenStream(lexer);
            ProbabilisticLanguageParser parser = new ProbabilisticLanguageParser(tokens);

            Program initialProgram = new Program(parser.program());
            State initialState = new State(); //TODO Il va falloir le faire mieux que ça haha
            Configuration initialConfiguration = new Configuration(initialProgram, initialState);
            Distribution initialDistribution = new Distribution();
            initialDistribution.getElements().put(initialConfiguration,1.0);

            System.out.println(initialDistribution);

            boolean goForward;
            Distribution distribution = initialDistribution;
            do {
                distribution = DistributionTransformer.transformation(distribution);
                System.out.println(distribution);
                goForward = false;
                for (Configuration c : distribution.getElements().keySet()) {
                    if (!c.getProgram().getCommands().isEmpty()) {
                        goForward = true;
                    }
                }
            } while (goForward);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
