package problang.elems;

import java.util.Objects;

/**
 * Created by lorynf on 07/01/17.
 */
public class Configuration {
    private Program program;
    private State state;

    public Configuration(Program p, State s) {
        program = p;
        state = s;
    }

    public Program getProgram() {
        return program;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "<" + program + ", " + state + ">";
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Configuration configuration = (Configuration) o;
        // field comparison
        return Objects.equals(program, configuration.program)
                && Objects.equals(state, configuration.state);
    }
}
