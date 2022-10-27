package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.time.LocalDateTime;
import java.util.List;

import picocli.CommandLine;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.LocalDateTimeConverter;
import seedu.address.model.Model;
import seedu.address.model.team.Task;

/**
 * Sets a deadline for a specified task.
 */
@CommandLine.Command(name = "deadline")
public class SetDeadlineCommand extends Command {
    public static final String COMMAND_WORD = "set deadline";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sets a deadline to the specified existing task.\n"
            + "Parameters: TASK_INDEX (must be a positive integer) \n"
            + "Parameters: DEADLINE (format: YYYY-MM-DD HH:mm) \n"
            + "Example: " + COMMAND_WORD + " 1" + " 2023-02-25 23:59";

    public static final String MESSAGE_SET_DEADLINE_SUCCESS = "Set Deadline: %1$s %2$s";
    public static final String MESSAGE_TASK_INDEX_OUT_OF_BOUNDS = "This task does not exist. "
            + "There are less than %1$s tasks in your list.";

    @CommandLine.Parameters(arity = "1")
    private Index taskIndex;

    @CommandLine.Parameters(arity = "1..2", parameterConsumer = LocalDateTimeConverter.class)
    private LocalDateTime deadline;

    public SetDeadlineCommand() {
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Task> taskList = model.getFilteredTaskList();
        if (taskIndex.getZeroBased() >= taskList.size()) {
            throw new CommandException(String.format(MESSAGE_TASK_INDEX_OUT_OF_BOUNDS, taskIndex.getOneBased()));
        }

        Task originalTask = taskList.get(taskIndex.getZeroBased());
        Task newTask = originalTask.setDeadline(deadline);

        model.getTeam().setTask(originalTask, newTask);

        return new CommandResult(String.format(MESSAGE_SET_DEADLINE_SUCCESS,
                taskList.get(taskIndex.getZeroBased()).getName(),
                taskList.get(taskIndex.getZeroBased()).getDeadlineAsString()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof SetDeadlineCommand // instanceof handles nulls
                && taskIndex.equals(((SetDeadlineCommand) other).taskIndex))
                && deadline.equals(((SetDeadlineCommand) other).deadline); // state check
    }
}
