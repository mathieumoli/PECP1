package problang.elems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by lorynf on 07/01/17.
 */
public class State {
    private Map<String, Long> memory;
    //TODO gérer les grands entiers
    // Je pense qu'on va se limiter au Long
    // Pour les booléens, on convient que 0=true et le reste est false
    // Gérer l'écriture {0,1}^3 ? Pas envie

    public State() {
        memory = new HashMap<>();
    }

    public State(State s) {
        memory = new HashMap<>(s.getMemory());
    }

    public Map<String, Long> getMemory() {
        return memory;
    }

    public void addElement(String name, long value) {
        memory.put(name,value);
    }

    @Override
    public String toString() {
        return memory.toString();
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        State state = (State) o;
        // field comparison
        return Objects.equals(memory, state.memory);
    }

}
