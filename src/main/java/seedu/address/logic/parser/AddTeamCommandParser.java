package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.AddTeamCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.team.Team;

/**
 * Parses input arguments and creates a new AddTeamCommand object.
 */
public class AddTeamCommandParser implements Parser<AddTeamCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the AddTeamCommand
     * and returns a AddTeamCommand object for execution.
     *
     * @throws ParseException if user input does not conform to the expected format
     */
    @Override
    public AddTeamCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddTeamCommand.MESSAGE_USAGE));
        }
        Team dummyTargetTeam = new Team(trimmedArgs);

        return new AddTeamCommand(dummyTargetTeam);
    }
}
