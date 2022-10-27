package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.FLAG_DESCRIPTION_LONG;
import static seedu.address.logic.parser.CliSyntax.FLAG_DESCRIPTION_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_NAME_STR;

import java.util.List;

import picocli.CommandLine;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.team.Team;

/**
 * Adds a new team to the address book.
 */
@CommandLine.Command(name = "team", aliases = {"te"})
public class AddTeamCommand extends Command {
    public static final String COMMAND_WORD = "add team";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Adds a new team \n"
            + "Parameters: "
            + " TEAM_NAME "
            + "[" + FLAG_DESCRIPTION_STR + " TEAM_DESCRIPTION] \n"
            + "Example:\n"
            + "1. " + COMMAND_WORD + " "
            + FLAG_NAME_STR + " CS2103T "
            + FLAG_DESCRIPTION_STR + " \"A team to manage CS2103T\"\n"
            + "2. " + COMMAND_WORD + " "
            + FLAG_NAME_STR + " CS2102 ";

    public static final String MESSAGE_ADD_TEAM_SUCCESS = "Added team: %1$s";

    public static final String MESSAGE_TEAM_EXISTS = "There is already an existing team with the same name!";

    @CommandLine.Parameters(arity = "1")
    private String teamName;

    @CommandLine.Option(names = {FLAG_DESCRIPTION_STR, FLAG_DESCRIPTION_LONG}, defaultValue = Team.DEFAULT_DESCRIPTION)
    private String description;

    public AddTeamCommand() {
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        Team team = new Team(teamName, description);
        List<Team> teamList = model.getTeamList();
        if (teamList.contains(team)) {
            throw new CommandException(MESSAGE_TEAM_EXISTS);
        }

        model.addTeam(team);
        return new CommandResult(String.format(MESSAGE_ADD_TEAM_SUCCESS, team));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AddTeamCommand // instanceof handles nulls
                && teamName.equals(((AddTeamCommand) other).teamName)); // state check
    }

}
