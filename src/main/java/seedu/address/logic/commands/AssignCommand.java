package seedu.address.logic.commands;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_WITH_HELP_FORMAT;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR_LONG;

import picocli.CommandLine;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Command that contains all subcommands starting with {@code assign}.
 */
@CommandLine.Command(name = AssignCommand.COMMAND_WORD,
        aliases = {AssignCommand.ALIAS}, mixinStandardHelpOptions = true, subcommands = {
            AssignTaskCommand.class,
            AssignTaskRandomlyCommand.class,
        })
public class AssignCommand extends Command {
    public static final String COMMAND_WORD = "assign";
    public static final String ALIAS = "as";
    public static final String FULL_COMMAND = COMMAND_WORD;
    public static final String HELP_MESSAGE =
            "The '" + FULL_COMMAND + "' command is used to assign a task.\n";

    @CommandLine.Spec
    private CommandLine.Model.CommandSpec commandSpec;

    @CommandLine.Option(names = {FLAG_HELP_STR, FLAG_HELP_STR_LONG}, usageHelp = true,
            description = FLAG_HELP_DESCRIPTION)
    private boolean help;

    @Override
    public CommandResult execute(Model model) throws CommandException {
        if (commandSpec.commandLine().isUsageHelpRequested()) {
            return new CommandResult(HELP_MESSAGE + commandSpec.commandLine().getUsageMessage());
        }
        throw new CommandException(String.format(MESSAGE_INVALID_COMMAND_WITH_HELP_FORMAT,
                commandSpec.qualifiedName().trim()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AssignCommand); // instanceof handles nulls
    }
}
