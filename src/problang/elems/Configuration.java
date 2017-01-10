package problang.elems;

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
}
