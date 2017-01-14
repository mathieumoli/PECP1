package problang.elems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by lorynf on 07/01/17.
 */
public class State {
    private Map<String, Integer> memory;

    public State() {
        memory = new HashMap<>();
    }

    public State(State s) {
        memory = new HashMap<>(s.getMemory());
    }

    public Map<String, Integer> getMemory() {
        return memory;
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
