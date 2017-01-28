package prover;

import problang.builder.DistributionTransformer;
import problang.elems.Configuration;
import problang.elems.Distribution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lorynf on 28/01/17.
 */
public class Equivalence {
    public static boolean isEquivalent(String filePath1, String filePath2, List<String> vars) throws IOException {
        // Récupération des distributions finales:
        Distribution d1 = DistributionTransformer.getFinalDistribution(filePath1);
        Distribution d2 = DistributionTransformer.getFinalDistribution(filePath2);

        // Récupération de toutes les valeurs possibles pour les variables dans vars:
        Map<String, List<Long>> values = new HashMap<>();
        for (String var : vars) {
            List<Long> varValues = new ArrayList<>();
            for (Configuration configuration : d1.getElements().keySet()) {
                long value = configuration.getState().getMemory().get(var);
                if (!varValues.contains(value)) {
                    varValues.add(value);
                }
            }
            List<Long> varValues2 = new ArrayList<>();
            for (Configuration configuration : d2.getElements().keySet()) {
                long value = configuration.getState().getMemory().get(var);
                if (!varValues2.contains(value)) {
                    varValues2.add(value);
                }
            }
            if (varValues.size() != varValues2.size()) {
                return false;
            } else {
                if (!varValues.containsAll(varValues2)) {
                    return false;
                }
            }
            values.put(var, varValues);
        }

        // Calcul des probabilités
        return getProbabilities(d1,values, new HashMap<>()).equals(getProbabilities(d2,values, new HashMap<>()));
    }

    private static Map<Map<String,Long>,Double> getProbabilities(Distribution d, Map<String, List<Long>> varValues, Map<String,Long> values) {
        Map<Map<String,Long>,Double> probs = new HashMap<>();
        if (varValues.isEmpty()) {
            probs.put(values,getProbability(d, values));
        } else {
            List<String> vars = new ArrayList<>(varValues.keySet());
            List<Long> v = varValues.get(vars.get(0));
            for (long l : v) {
                Map<String,List<Long>> varValues2 = new HashMap<>(varValues);
                varValues2.remove(vars.get(0));
                Map<String,Long> values2 = new HashMap<>(values);
                values2.put(vars.get(0), l);
                probs.putAll(getProbabilities(d,varValues2,values2));
            }
        }
        return probs;
    }

    private static double getProbability(Distribution d, Map<String,Long> values) {
        double prob = 0.0;
        for (Configuration configuration : d.getElements().keySet()) {
            boolean goodConfig = true;
            for (String var : values.keySet()) {
                if (!values.get(var).equals(configuration.getState().getMemory().get(var))) {
                    goodConfig = false;
                    break;
                }
            }
            if (goodConfig)
                prob += d.getElements().get(configuration);
        }
        return prob;
    }

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

        String filePath1 = "out/production/Projet1/FichiersTest/equiv1.txt";
        String filePath2 = "out/production/Projet1/FichiersTest/equiv2.txt";
        List<String> vars = new ArrayList<>();
        vars.add("x");
        vars.add("y");
        try {
            System.out.println("Equivalent: "+ ((isEquivalent(filePath1,filePath2,vars)) ? "oui" : "non"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
