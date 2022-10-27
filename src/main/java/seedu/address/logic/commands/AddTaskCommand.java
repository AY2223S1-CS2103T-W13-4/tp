package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.FLAG_ASSIGNEE_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_ASSIGNEE_STR_LONG;
import static seedu.address.logic.parser.CliSyntax.FLAG_DEADLINE_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_DEADLINE_STR_LONG;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR_LONG;
import static seedu.address.logic.parser.CliSyntax.FLAG_TASK_ASSIGNEES_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.FLAG_TASK_DEADLINE_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.FLAG_TASK_NAME_DESCRIPTION;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import picocli.CommandLine;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;
import seedu.address.model.team.Task;

/**
 * Adds a task to the current team.
 */
@CommandLine.Command(name = "task", aliases = {"ta"}, mixinStandardHelpOptions = true)
public class AddTaskCommand extends Command {
    public static final String COMMAND_WORD = "add task";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Adds a task to the current team.\n"
            + "Parameters:"
            + " NAME "
            + FLAG_DEADLINE_STR + " DEADLINE "
            + FLAG_ASSIGNEE_STR + " ASSIGNEE "
            + "Example: " + COMMAND_WORD + " "
            + " \"Review PR\" "
            + FLAG_DEADLINE_STR + " \"02-Dec-2022 23:59\" "
            + FLAG_ASSIGNEE_STR + " 1 "
            + FLAG_ASSIGNEE_STR + " 2 ";

    public static final String MESSAGE_ADD_TASK_SUCCESS = "Added Task: %1$s";
    public static final String MESSAGE_DUPLICATE_TASK = "This task already exists in the team";
    public static final String MESSAGE_TASK_NAME_FORMAT_ERROR = "Task name cannot be empty";
    public static final String MESSAGE_MEMBER_INDEX_OUT_OF_BOUNDS = "Invalid member index provided";


    @CommandLine.Parameters(arity = "1", description = FLAG_TASK_NAME_DESCRIPTION)
    private String taskName;

    @CommandLine.Option(names = {FLAG_ASSIGNEE_STR, FLAG_ASSIGNEE_STR_LONG}, defaultValue = "",
            description = FLAG_TASK_ASSIGNEES_DESCRIPTION, arity = "*")
    private String[] assignees;

    @CommandLine.Option(names = {FLAG_DEADLINE_STR, FLAG_DEADLINE_STR_LONG}, defaultValue = "",
            description = FLAG_TASK_DEADLINE_DESCRIPTION)
    private String deadline;

    @CommandLine.Option(names = {FLAG_HELP_STR, FLAG_HELP_STR_LONG}, usageHelp = true,
            description = FLAG_HELP_DESCRIPTION)
    private boolean help;

    @CommandLine.Spec
    private CommandLine.Model.CommandSpec commandSpec;

    /**
     * Creates an AddTaskCommand to add a {@code Task} to the current {@code Team}.
     */
    public AddTaskCommand() {
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        if (commandSpec.commandLine().isUsageHelpRequested()) {
            return new CommandResult(commandSpec.commandLine().getUsageMessage());
        }
        requireNonNull(model);
        List<String> assigneesList;
        if (assignees.length == 1 && Arrays.asList(assignees).contains("")) {
            assigneesList = List.of();
        } else {
            assigneesList = Arrays.asList(assignees);
        }
        LocalDateTime date;
        if (deadline.equals("")) {
            date = null;
        } else {
            date = LocalDateTime.parse(deadline, DateTimeFormatter.ofPattern(Task.DATE_FORMAT));
        }
        Task task = new Task(taskName, List.of(), false, date);
        if (model.getTeam().hasTask(task)) {
            throw new CommandException(MESSAGE_DUPLICATE_TASK);
        }
        List<Person> memberList = model.getTeam().getTeamMembers();
        for (int i = 0; i < assigneesList.size(); i++) {
            if (Integer.parseInt(assigneesList.get(i)) < 1
                    || Integer.parseInt(assigneesList.get(i)) > memberList.size()) {
                throw new CommandException(MESSAGE_MEMBER_INDEX_OUT_OF_BOUNDS);
            }
        }
        List<Person> assigneePersonList = new java.util.ArrayList<>(List.of());
        for (String index : assigneesList) {
            int assigneeIndex = Integer.parseInt(index);
            assigneePersonList.add(memberList.get(assigneeIndex - 1));
        }
        for (Person assignee : assigneePersonList) {
            task.assignTo(assignee);
        }
        model.getTeam().addTask(task);
        return new CommandResult(String.format(MESSAGE_ADD_TASK_SUCCESS, task));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AddTaskCommand // instanceof handles nulls
                && taskName.equals(((AddTaskCommand) other).taskName)); // state check
    }
}
