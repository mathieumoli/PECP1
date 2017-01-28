package problang.elems;

import antlr.ProbabilisticLanguageParser;

import java.util.List;

/**
 * Created by lorynf on 28/01/17.
 */
public class Function {
    private String name;
    private List<String> vars;
    private List<ProbabilisticLanguageParser.CommandContext> commands;


    public Function(String name, List<String> vars, List<ProbabilisticLanguageParser.CommandContext> commands) {
        this.name = name;
        this.vars = vars;
        this.commands = commands;
    }

    @Override
    public String toString() {
        String varsString = "";
        if (!vars.isEmpty())
            varsString = vars.get(0);
        for (int i = 1; i < vars.size(); i++) {
            varsString += ',' + vars.get(i);
        }
        String commandsString = commands.get(0).getText();
        for (int i = 1; i < commands.size(); i++) {
            commandsString += "; " + commands.get(i).getText();
        }

        return name + '(' + varsString + ") {" + commandsString + '}' ;
    }

    public List<ProbabilisticLanguageParser.CommandContext> getCommands() {
        return commands;
    }
}
