package problang.elems;


import antlr.ProbabilisticLanguageParser;

import java.util.List;
import java.util.Objects;

/**
 * Created by lorynf on 07/01/17.
 */
public class Program {
    private List<ProbabilisticLanguageParser.CommandContext> commands;

    public Program(List<ProbabilisticLanguageParser.CommandContext> commandsList) {
        commands = commandsList;
    }

    public List<ProbabilisticLanguageParser.CommandContext> getCommands() {
        return commands;
    }

    public ProbabilisticLanguageParser.CommandContext getCommand(int i) {
        return commands.get(i);
    }

    @Override
    public String toString() {
        String ret = "";
        for (ProbabilisticLanguageParser.CommandContext command : commands) {
            ret += command.getText() + "; ";
        }
        if (ret.isEmpty()) {
            ret = "tic";
        }
        return ret;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Program program = (Program) o;
        // field comparison
        return Objects.equals(commands, program.commands);
    }
}
