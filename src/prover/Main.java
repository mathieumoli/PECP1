package prover;

import problang.exceptions.InfiniteProgramException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static prover.Equivalence.isEquivalent;

/**
 * Created by lorynf on 04/02/17.
 */
public class Main {
    public static void main(String[] args) {
        /*Distribution d = new Distribution();

        State s00 = new State();
        s00.addElement("x",0);
        s00.addElement("y",0);

        State s01 = new State();
        s01.addElement("x",0);
        s01.addElement("y",1);

        State s10 = new State();
        s10.addElement("x",1);
        s10.addElement("y",0);

        State s11 = new State();
        s11.addElement("x",1);
        s11.addElement("y",1);

        d.addElement(new Configuration(new Program(),s00),0.25);
        d.addElement(new Configuration(new Program(),s01),0.25);
        d.addElement(new Configuration(new Program(),s10),0.25);
        d.addElement(new Configuration(new Program(),s11),0.25);

        Map<String,Long> values = new HashMap<>();
        values.put("x",(long)0);
        //values.put("y",(long)0);

        System.out.println(getProbability(d,values));

        Map<String,List<Long>> varValues = new HashMap<>();
        List<Long> longs = new ArrayList<>();
        longs.add((long)0); longs.add((long)1);
        varValues.put("x",longs); varValues.put("y",longs);

        System.out.println(getProbabilities(d,varValues,new HashMap<>()));*/

        String generalPath = "out/production/Projet1/TDs/TD3/Exercice2/";
        String p1 = generalPath + "P1";
        String p2 = generalPath + "P2";
        String p3 = generalPath + "P3";
        String p4 = generalPath + "P4";
        String p5 = generalPath + "P5";

        List<String> varX = new ArrayList<>(); varX.add("x");
        List<String> varY = new ArrayList<>(); varY.add("y");
        List<String> varXY = new ArrayList<>(); varXY.add("x"); varXY.add("y");

        String CPA_EG = "out/production/Projet1/ElGamal/CPA-EG";
        String DDH0 = "out/production/Projet1/ElGamal/DDH0";

        List<String> vars = new ArrayList<>();
        vars.add("a");
        vars.add("b");

        try {
            System.out.println("Equivalence entre P1 et P2 pour la variable x: "+((isEquivalent(p1,p2,varX)) ? "oui" : "non"));
            System.out.println("\n");
            System.out.println("Equivalence entre P1 et P2 pour les variables x et y: "+((isEquivalent(p1,p2,varXY)) ? "oui" : "non"));
            System.out.println("\n");
            System.out.println("Equivalence entre P3 et P4 pour la variable x: "+((isEquivalent(p3,p4,varX)) ? "oui" : "non"));
            System.out.println("\n");
            System.out.println("Equivalence entre P4 et P5 pour la variable z: "+((isEquivalent(p4,p5,varY)) ? "oui" : "non"));

            System.out.println("\n");
            System.out.println("Equivalence entre CPA-EG et DDH0: "+ ((isEquivalent(CPA_EG,DDH0,vars)) ? "oui" : "non"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InfiniteProgramException e) {
            System.err.println(e.getMessage());
        }
    }
}
