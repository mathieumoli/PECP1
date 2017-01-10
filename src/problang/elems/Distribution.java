package problang.elems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lorynf on 07/01/17.
 */
public class Distribution {
    private Map<Configuration,Double> elements;

    public Distribution() {
        elements = new HashMap<>();
    }

    public Map<Configuration, Double> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
