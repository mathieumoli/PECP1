package problang.elems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lorynf on 07/01/17.
 */
public class Distribution {
    private Map<Configuration,Float> elements;

    public Distribution() {
        elements = new HashMap<>();
    }

    public Map<Configuration, Float> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public void addElement(Configuration configuration, float probability) {
        for (Configuration c : elements.keySet()) {
            if (c.equals(configuration)) {
                elements.put(c, elements.get(c) + probability);
                return;
            }
        }
        elements.put(configuration, probability);
    }
}
