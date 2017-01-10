package problang.builder;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import problang.elems.Configuration;
import problang.elems.Distribution;
import problang.elems.Program;
import problang.elems.State;
import problang.grammar.ProbabilisticLanguageLexer;
import problang.grammar.ProbabilisticLanguageParser;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by lorynf on 10/01/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // initialiser le lexer et le parser
            ANTLRInputStream in = new ANTLRInputStream(new FileReader("out/production/Projet1/affectation"));
            ProbabilisticLanguageLexer lexer = new ProbabilisticLanguageLexer(in);
            BufferedTokenStream tokens = new CommonTokenStream(lexer);
            ProbabilisticLanguageParser parser = new ProbabilisticLanguageParser(tokens);

            Program initialProgram = new Program(parser.program());
            State initialState = new State(); //TODO Il va falloir le faire mieux que ça haha
            Configuration initialConfiguration = new Configuration(initialProgram, initialState);
            Distribution initialDistribution = new Distribution();
            initialDistribution.getElements().put(initialConfiguration,1.0);

            System.out.println(initialDistribution);

            Distribution finalDistribution = DistributionTransformer.transformation(initialDistribution);
            System.out.println(finalDistribution);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
