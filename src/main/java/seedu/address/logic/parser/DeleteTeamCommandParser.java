package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.DeleteTeamCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.team.Team;

/**
 * Parses input arguments and creates a new DeleteTeamCommand object.
 */
public class DeleteTeamCommandParser implements Parser<DeleteTeamCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the DeleteTeamCommand
     * and returns a DeleteTeamCommand object for execution.
     *
     * @throws ParseException if user input does not conform to the expected format
     */
    @Override
    public DeleteTeamCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, DeleteTeamCommand.MESSAGE_USAGE));
        }
        Team dummyTargetTeam = new Team(trimmedArgs);

        return new DeleteTeamCommand(dummyTargetTeam);
    }
}
