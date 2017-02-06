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
        File tdFiles = new File("out/production/Projet1/TDs");
        for (File subFile : getAllSubFiles(tdFiles)) {
            try {
                System.out.println("Distribution pour le fichier " + subFile.getPath());
                try {
                    DistributionTransformer.getFinalDistribution(subFile.getPath());
                } catch (InfiniteProgramException e) {
                    System.err.println(e.getMessage());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("\n\n");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private static List<File> getAllSubFiles (File f) {
        List<File> fileList = new ArrayList<>();
        if (f.isDirectory()) {
            for (File subFile : f.listFiles()) {
                if (subFile.isDirectory()) {
                    fileList.addAll(getAllSubFiles(subFile));
                } else {
                    fileList.add(subFile);
                }
            }
        }
        return fileList;
    }
}