package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.Model;
import seedu.address.model.TruthTable;

/**
 * Clears the list of contacts.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Contacts list has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setTruthTable(TruthTable.createNewTruthTable());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
