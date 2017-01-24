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
