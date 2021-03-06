package problang.elems;


import antlr.ProbabilisticLanguageParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by lorynf on 07/01/17.
 */
public class Program {
    private List<ProbabilisticLanguageParser.CommandContext> commands;

    public Program() {
        commands = new ArrayList<>();
    }

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

        String commandsString;
        if (commands.isEmpty())  {
            commandsString = "tick";
        }
        else {
            commandsString = commands.get(0).getText();
            for (int i = 1; i < commands.size(); i++) {
                commandsString += "; " + commands.get(i).getText();
            }
        }
        return commandsString;
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
