package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR_LONG;
import static seedu.address.logic.parser.CliSyntax.FLAG_TASK_INDEX_DESCRIPTION;

import java.util.List;

import picocli.CommandLine;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.team.Task;

/**
 * Marks a specified task as complete.
 */
@CommandLine.Command(name = MarkCommand.COMMAND_WORD, aliases = {MarkCommand.ALIAS}, mixinStandardHelpOptions = true)
public class MarkCommand extends Command {
    public static final String COMMAND_WORD = "mark";
    public static final String ALIAS = "m";
    public static final String FULL_COMMAND = COMMAND_WORD;

    public static final String MESSAGE_USAGE = FULL_COMMAND
            + ": Marks the specified existing task as complete.\n"
            + "Parameters: TASK_INDEX (must be a valid positive integer) \n"
            + "Example: " + FULL_COMMAND + " 1";

    public static final String MESSAGE_MARK_SUCCESS = "Marked as complete: [x] %1$s";
    public static final String MESSAGE_TASK_INDEX_OUT_OF_BOUNDS = "This task does not exist. "
            + "There are less than %1$s tasks in your list.";
    public static final String MESSAGE_ALREADY_MARKED = "This task has already been marked as complete.";

    @CommandLine.Parameters(arity = "1", description = FLAG_TASK_INDEX_DESCRIPTION)
    private Index index;

    @CommandLine.Spec
    private CommandLine.Model.CommandSpec commandSpec;

    @CommandLine.Option(names = {FLAG_HELP_STR, FLAG_HELP_STR_LONG}, usageHelp = true,
            description = FLAG_HELP_DESCRIPTION)
    private boolean help;

    public MarkCommand() {
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        if (commandSpec.commandLine().isUsageHelpRequested()) {
            return new CommandResult(commandSpec.commandLine().getUsageMessage());
        }
        requireNonNull(model);
        List<Task> taskList = model.getFilteredTaskList();
        if (index.getZeroBased() >= taskList.size()) {
            throw new CommandException(String.format(MESSAGE_TASK_INDEX_OUT_OF_BOUNDS, index.getOneBased()));
        }
        if (taskList.get(index.getZeroBased()).isComplete()) {
            throw new CommandException(MESSAGE_ALREADY_MARKED);
        }

        Task originalTask = taskList.get(index.getZeroBased());
        Task markedTask = originalTask.mark(true);

        model.getTeam().setTask(originalTask, markedTask);

        return new CommandResult(String.format(MESSAGE_MARK_SUCCESS,
                markedTask.getName()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof MarkCommand // instanceof handles nulls
                && index.equals(((MarkCommand) other).index)); // state check
    }
}
