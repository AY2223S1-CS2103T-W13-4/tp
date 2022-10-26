package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import picocli.CommandLine;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.team.Team;

/**
 * Deletes a team from the addressbook.
 */
@CommandLine.Command(name = "team")
public class DeleteTeamCommand extends Command {
    public static final String COMMAND_WORD = "delete team";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Delete an existing team \n"
            + "Parameters: TEAM_NAME\n"
            + "Example: " + COMMAND_WORD + " project";

    public static final String MESSAGE_DELETE_TEAM_SUCCESS = "Deleted team: %1$s";
    public static final String MESSAGE_AT_LEAST_ONE_TEAM = "You must have at least one team!";
    public static final String MESSAGE_TEAM_NOT_EXISTS = "This team you are trying to delete does not exist!";
    private Team targetTeam;

    @CommandLine.Parameters(arity = "1")
    private String targetTeamName;

    public DeleteTeamCommand() {
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Team> teamList = model.getTeamList();
        Team currentTeam = model.getTeam();
        Team targetTeam = new Team(targetTeamName);

        int teamIndex = teamList.indexOf(targetTeam);
        if (teamIndex == -1) {
            throw new CommandException(MESSAGE_TEAM_NOT_EXISTS);
        }

        if (teamList.size() == 1) {
            throw new CommandException(MESSAGE_AT_LEAST_ONE_TEAM);
        }

        Team deletedTeam = teamList.get(teamIndex);

        model.deleteTeam(deletedTeam);
        if (currentTeam.equals(targetTeam)) {
            model.setTeam(model.getTeamList().get(0));
        }
        return new CommandResult(String.format(MESSAGE_DELETE_TEAM_SUCCESS, deletedTeam));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof DeleteTeamCommand // instanceof handles nulls
                && targetTeam.equals(((DeleteTeamCommand) other).targetTeam)); // state check
    }

}
