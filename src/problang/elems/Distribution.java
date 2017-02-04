package problang.elems;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lorynf on 07/01/17.
 */
public class Distribution {
    private Map<Configuration,BigDecimal> elements;

    public Distribution() {
        elements = new HashMap<>();
    }

    public Map<Configuration, BigDecimal> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public void addElement(Configuration configuration, BigDecimal probability) {
        for (Configuration c : elements.keySet()) {
            if (c.equals(configuration)) {
                elements.put(c, elements.get(c).add(probability));
                return;
            }
        }
        elements.put(configuration, probability);
    }
}
