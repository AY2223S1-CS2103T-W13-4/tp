package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.SetTeamCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.team.Team;

/**
 * Parses input arguments and creates a new SetTeamCommand object.
 */
public class SetTeamCommandParser implements Parser<SetTeamCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the SetTeamCommand
     * and returns a SetTeamCommand object for execution.
     *
     * @throws ParseException if user input does not conform to the expected format
     */
    @Override
    public SetTeamCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, SetTeamCommand.MESSAGE_USAGE));
        }
        Team dummyTargetTeam = new Team(trimmedArgs);

        return new SetTeamCommand(dummyTargetTeam);
    }
}
