package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR_LONG;

import java.util.Comparator;

import picocli.CommandLine;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.Order;
import seedu.address.model.Model;
import seedu.address.model.person.Person;

/**
 * Command that sorts the current member list.
 */
@CommandLine.Command(name = "member", aliases = {"m"}, mixinStandardHelpOptions = true)
public class SortMemberCommand extends Command {

    public static final String COMMAND_WORD = "sort member";

    public static final String MESSAGE_SUCCESS = "Sorted members successfully";

    @CommandLine.Parameters(arity = "1")
    private Order order;

    @CommandLine.Option(names = {FLAG_HELP_STR, FLAG_HELP_STR_LONG}, usageHelp = true,
            description = FLAG_HELP_DESCRIPTION)
    private boolean help;
    @CommandLine.Spec
    private CommandLine.Model.CommandSpec commandSpec;

    public SortMemberCommand() {
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        if (commandSpec.commandLine().isUsageHelpRequested()) {
            return new CommandResult(commandSpec.commandLine().getUsageMessage());
        }
        requireNonNull(model);
        Comparator<Person> comparator;
        switch (order) {
        case ASCENDING:
            comparator = (t1, t2) -> t1.getName().toString().compareTo(t2.getName().toString());
            break;
        case DESCENDING:
            comparator = (t1, t2) -> t2.getName().toString().compareTo(t1.getName().toString());
            break;
        case RESET:
            comparator = null;
            break;
        default:
            throw new CommandException("Should not reach here");
        }

        model.getTeam().sortMembers(comparator);
        return new CommandResult(String.format(MESSAGE_SUCCESS));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof SortMemberCommand // instanceof handles nulls
                && order.equals(((SortMemberCommand) other).order));
    }
}
