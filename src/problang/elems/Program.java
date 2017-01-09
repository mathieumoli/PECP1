package problang.elems;

import problang.grammar.ProbabilisticLanguageParser;

import java.util.List;

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
 }
