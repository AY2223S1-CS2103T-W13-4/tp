package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PERSONS;

import picocli.CommandLine;
import seedu.address.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
@CommandLine.Command(name = "persons", aliases = {"p"})
public class ListPersonsCommand extends Command {

    public static final String COMMAND_WORD = "list persons";

    public static final String MESSAGE_SUCCESS = "Listed all persons";

    public ListPersonsCommand() {
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof ListPersonsCommand); // instanceof handles nulls
    }
}
