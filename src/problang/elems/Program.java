package problang.elems;


import antlr.ProbabilisticLanguageParser;

import java.util.List;
import java.util.Objects;

/**
 * Created by lorynf on 07/01/17.
 */
public class Program {
    private List<ProbabilisticLanguageParser.CodeContext> commands;

    public Program(ProbabilisticLanguageParser.ProgramContext programContext) {
        commands = programContext.code();
    }

    public Program(List<ProbabilisticLanguageParser.CodeContext> commandsList) {
        commands = commandsList;
    }

    public List<ProbabilisticLanguageParser.CodeContext> getCommands() {
        return commands;
    }

    public ProbabilisticLanguageParser.CodeContext getCommand(int i) {
        return commands.get(i);
    }

    @Override
    public String toString() {
        //encore des petits problemes
        String ret = "";
        for (ProbabilisticLanguageParser.CodeContext command : commands) {
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
