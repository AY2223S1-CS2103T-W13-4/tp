package seedu.address.logic.commands;

import picocli.CommandLine;
import seedu.address.model.Model;

/**
 * Switches the theme of the program.
 */
@CommandLine.Command(name = "theme")
public class ThemeCommand extends Command {

    public static final String COMMAND_WORD = "theme";

    public static final String MESSAGE_EXIT_ACKNOWLEDGEMENT = "Switched themes!";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false, false, true);
    }

}
