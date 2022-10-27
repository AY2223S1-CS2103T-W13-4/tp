package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR_LONG;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PERSONS;

import picocli.CommandLine;
import seedu.address.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
@CommandLine.Command(name = "persons", mixinStandardHelpOptions = true)
public class ListPersonsCommand extends Command {

    public static final String COMMAND_WORD = "list persons";

    public static final String MESSAGE_SUCCESS = "Listed all persons";

    @CommandLine.Option(names = {FLAG_HELP_STR, FLAG_HELP_STR_LONG}, usageHelp = true,
            description = FLAG_HELP_DESCRIPTION)
    private boolean help;

    @CommandLine.Spec
    private CommandLine.Model.CommandSpec commandSpec;

    public ListPersonsCommand() {
    }

    @Override
    public CommandResult execute(Model model) {
        if (commandSpec.commandLine().isUsageHelpRequested()) {
            return new CommandResult(commandSpec.commandLine().getUsageMessage());
        }
        requireNonNull(model);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof ListPersonsCommand); // instanceof handles nulls
    }
}
