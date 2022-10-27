package seedu.address.logic.commands;

import static seedu.address.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;

import picocli.CommandLine;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Command that contains all subcommands starting with {@code delete}.
 */
@CommandLine.Command(name = "delete", aliases = {"d"}, subcommands = {
    DeleteLinkCommand.class,
    DeleteMemberCommand.class,
    DeletePersonCommand.class,
    DeleteTaskCommand.class,
    DeleteTeamCommand.class,
})
public class DeleteCommand extends Command {
    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException(MESSAGE_UNKNOWN_COMMAND);
    }

}
