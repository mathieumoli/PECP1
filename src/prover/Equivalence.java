package prover;

import problang.builder.DistributionTransformer;
import problang.elems.Configuration;
import problang.elems.Distribution;
import problang.exceptions.InfiniteProgramException;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by lorynf on 28/01/17.
 */
public class Equivalence {
    public static boolean isEquivalent(String filePath1, String filePath2, List<String> vars) throws IOException, InfiniteProgramException {
        // Récupération des distributions finales:
        Distribution d1 = DistributionTransformer.getFinalDistribution(filePath1);
        System.out.println();
        Distribution d2 = DistributionTransformer.getFinalDistribution(filePath2);
        System.out.println();

        // Récupération de toutes les valeurs possibles pour les variables dans vars:
        Map<String, List<Long>> allPossibleValues = new HashMap<>();
        for (String var : vars) {
            List<Long> varValues = getAllValues(d1.getElements().keySet(), var);
            List<Long> varValues2 = getAllValues(d2.getElements().keySet(), var);
            if (varValues == null || varValues2 == null) {
                return false;
            }
            if (varValues.size() != varValues2.size()) {
                return false;
            } else {
                if (!varValues.containsAll(varValues2)) {
                    return false;
                }
            }
            allPossibleValues.put(var, varValues);
        }

        // Calcul des probabilités
        Map<Map<String,Long>,BigDecimal> probabilities1 = getProbabilities(d1,allPossibleValues, new HashMap<>());
        Map<Map<String,Long>,BigDecimal> probabilities2 = getProbabilities(d2,allPossibleValues, new HashMap<>());
        System.out.println(probabilities1);
        System.out.println(probabilities2);
        return isProbabilitiesEquals(probabilities1, probabilities2);
    }

    private static boolean isProbabilitiesEquals(Map<Map<String, Long>, BigDecimal> probabilities1, Map<Map<String, Long>, BigDecimal> probabilities2) {
        for (Map<String,Long> varValues : probabilities1.keySet()) {
            if (probabilities1.get(varValues).compareTo(probabilities2.get(varValues)) != 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Long> getAllValues(Set<Configuration> configurations, String var) {
        List<Long> ret = new ArrayList<>();
        for (Configuration configuration : configurations) {
            if (!configuration.getState().getMemory().containsKey(var))
                return null;
            long value = configuration.getState().getMemory().get(var);
            if (!ret.contains(value)) {
                ret.add(value);
            }
        }
        return ret;
    }

    private static Map<Map<String,Long>,BigDecimal> getProbabilities(Distribution d, Map<String, List<Long>> possibleValues, Map<String,Long> values) {
        Map<Map<String,Long>,BigDecimal> probs = new HashMap<>();
        if (possibleValues.isEmpty()) {
            probs.put(values,getProbability(d, values));
        } else {
            List<String> vars = new ArrayList<>(possibleValues.keySet());
            List<Long> v = possibleValues.get(vars.get(0));
            for (long l : v) {
                Map<String,List<Long>> possibleValues2 = new HashMap<>(possibleValues);
                possibleValues2.remove(vars.get(0));
                Map<String,Long> values2 = new HashMap<>(values);
                values2.put(vars.get(0), l);
                probs.putAll(getProbabilities(d,possibleValues2,values2));
            }
        }
        return probs;
    }

    private static BigDecimal getProbability(Distribution d, Map<String,Long> values) {
        BigDecimal prob = BigDecimal.ZERO;
        for (Configuration configuration : d.getElements().keySet()) {
            boolean goodConfig = true;
            for (String var : values.keySet()) {
                if (!values.get(var).equals(configuration.getState().getMemory().get(var))) {
                    goodConfig = false;
                    break;
                }
            }
            if (goodConfig)
                prob = prob.add(d.getElements().get(configuration));
        }
        return prob;
    }
}
