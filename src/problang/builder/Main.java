package problang.builder;

import problang.exceptions.InfiniteProgramException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lorynf on 10/01/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            File tdFiles = new File("out/production/Projet1/TDs");
            for (File subFile : getAllSubFiles(tdFiles)) {
                System.out.println("Distribution pour le fichier "+subFile.getPath());
                DistributionTransformer.getFinalDistribution(subFile.getPath());
                System.out.println("\n\n");
            }
            //System.out.println("Distributions pour CPA-EG");
            //DistributionTransformer.getFinalDistribution("out/production/Projet1/FichiersTest/CPA-EG");
            /*System.out.println();
            System.out.println();
            System.out.println("Distributions pour le fichier test");
            DistributionTransformer.getFinalDistribution("out/production/Projet1/FichiersTest/affectation");
        */
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InfiniteProgramException e) {
            System.err.println(e.getMessage());
        }
    }

    private static List<File> getAllSubFiles (File f) {
        List<File> fileList = new ArrayList<>();
        for (File subFile : f.listFiles()) {
            if (subFile.isDirectory()) {
                fileList.addAll(getAllSubFiles(subFile));
            } else {
                fileList.add(subFile);
            }
        }
        return fileList;
    }
}

/*
Petit point pour Loryn:
    - Tenter l'appel de fonctions et voir avec la prof si ça passe (et si ça fait un inline)
    - Gérer le code de l'adversaire, qui est le seul à pouvoir modifier une variable a, distribution RANDOM -> OK
    - Est-ce qu'on doit faire les transformations de code nous-même pour ElGamal ?
    - Implémentation de la fonction d'équivalence entre deux progammes pour une liste de variables ?
        equiv(p1,p2,varList)
    - ...
 */