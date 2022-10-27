package seedu.address.logic.commands;

import static seedu.address.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;

import picocli.CommandLine;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Command that contains all subcommands starting with {@code add}.
 */
@CommandLine.Command(name = "add", aliases = {"a", "ad"}, subcommands = {
    AddPersonCommand.class,
    AddMemberCommand.class,
    AddTaskCommand.class,
    AddTeamCommand.class,
    AddLinkCommand.class
})
public class AddCommand extends Command {
    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException(MESSAGE_UNKNOWN_COMMAND);
    }

}
