package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.*;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_LINKS;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import picocli.CommandLine;
import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.CollectionUtil;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;
import seedu.address.model.team.Task;

/**
 * Edits the details of an existing task in TruthTable.
 */
@CommandLine.Command(name = "task")
public class EditTaskCommand extends Command {
    public static final String COMMAND_WORD = "edit task";

    public static final String MESSAGE_USAGE =
            COMMAND_WORD + ": Edits a current task identified by the index number used in the displayed task list. \n"
                    + "Existing values will be overwritten by the input values. \n"
                    + "Parameters: INDEX (must be a positive integer) " + "-" + FLAG_NAME_STR + " NAME " + "-"
                    + FLAG_DEADLINE_STR + " DEADLINE \n" + "-" + FLAG_ASSIGNEE_STR + "ASSIGNEE \n"
                    + "Example: " + COMMAND_WORD + " 1 " + "-" + FLAG_NAME_STR
                    + " \"Review PR\" " + "-" + FLAG_DEADLINE_STR + " \"2023-12-12 23:59\" ";
    public static final String MESSAGE_EDIT_TASK_SUCCESS = "Edited task: %1$s";
    public static final String MESSAGE_NOT_EDITED = "At least one field to edit must be provided.";
    public static final String MESSAGE_DUPLICATE_TASK = "A task with the same name already exists. ";

    private final EditTaskDescriptor editTaskDescriptor;

    @CommandLine.Parameters(arity = "1")
    private Index index;

    @CommandLine.ArgGroup(exclusive = false, multiplicity = "1")
    private Arguments arguments;

    private static class Arguments {
        @CommandLine.Option(names = {FLAG_NAME_STR, FLAG_NAME_STR_LONG})
        private String name;

        @CommandLine.Option(names = {FLAG_DEADLINE_STR, FLAG_DEADLINE_STR_LONG})
        private String deadline;

        @CommandLine.Option(names = {FLAG_ASSIGNEE_STR, FLAG_ASSIGNEE_STR_LONG}, defaultValue = "")
        private String[] assignees;

    }
    /**
     * Creates an EditTaskCommand to edit a {@code Task}.
     */
    public EditTaskCommand() {
        this.editTaskDescriptor = new EditTaskDescriptor();
    }

    /**
     * Creates and returns a {@code Task} with the details of {@code taskToEdit}
     * edited with {@code editTaskDescriptor}.
     */
    private static Task createEditedTask(Task taskToEdit, EditTaskCommand.EditTaskDescriptor editTaskDescriptor) {
        assert editTaskDescriptor != null;

        String updatedName = editTaskDescriptor.getName().orElse(taskToEdit.getName());
        LocalDateTime updatedDeadline;
        if (editTaskDescriptor.getDeadline().isEmpty()) {
            updatedDeadline = taskToEdit.getDeadline().orElse(null);
        } else {
            updatedDeadline = editTaskDescriptor.getDeadline().get();
        }
        boolean updatedIsComplete = taskToEdit.isComplete();
        List<Person> assignees;
        if (editTaskDescriptor.getAssignees().isEmpty()) {
            assignees = taskToEdit.getAssigneesList();
        } else {
            assignees = List.of();
        }
        return new Task(updatedName, assignees, updatedIsComplete, updatedDeadline);
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        if (arguments.assignees.length != 1 || !Arrays.asList(arguments.assignees).contains("")) {
            editTaskDescriptor.setAssignees(Arrays.asList(arguments.assignees));
        }
        if (arguments.deadline != null) {
            editTaskDescriptor.setDeadline(LocalDateTime.parse(arguments.deadline,
                    DateTimeFormatter.ofPattern(Task.DATE_FORMAT)));
        }
        if (arguments.name != null) {
            editTaskDescriptor.setName(arguments.name);
        }
        List<Task> taskList = model.getTeam().getTaskList();

        if (index.getZeroBased() >= taskList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_LINK_DISPLAYED_INDEX);
        }

        Task taskToEdit = taskList.get(index.getZeroBased());
        Task editedTask = createEditedTask(taskToEdit, editTaskDescriptor);
        List<Person> memberList = model.getTeam().getTeamMembers();
        if (editTaskDescriptor.getAssignees().isPresent()) {
            List<Person> assigneePersonList = memberList.stream()
                    .filter(member -> editTaskDescriptor.getAssignees().get()
                            .contains(member.getName().fullName))
                    .collect(Collectors.toList());
            for (Person assignee : assigneePersonList) {
                editedTask.assignTo(assignee);
            }
        }
        if (!taskToEdit.equals(editedTask) && model.getTeam().hasTask(editedTask)) {
            throw new CommandException(MESSAGE_DUPLICATE_TASK);
        }

        model.setTask(taskToEdit, editedTask);
        model.updateFilteredLinkList(PREDICATE_SHOW_ALL_LINKS);
        return new CommandResult(String.format(MESSAGE_EDIT_TASK_SUCCESS, editedTask));

    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof EditTaskCommand)) {
            return false;
        }

        // state check
        EditTaskCommand e = (EditTaskCommand) other;
        return index.equals(e.index) && editTaskDescriptor.equals(e.editTaskDescriptor);
    }

    /**
     * Stores the details to edit the task with. Each non-empty field value will replace the
     * corresponding field value of the task.
     */
    public static class EditTaskDescriptor {
        private String name;

        private LocalDateTime deadline;

        private List<String> assignees;

        public EditTaskDescriptor() {
        }

        /**
         * Copy constructor.
         */
        public EditTaskDescriptor(EditTaskDescriptor toCopy) {
            setName(toCopy.name);
            setDeadline(toCopy.deadline);
            setAssignees(toCopy.assignees);
        }

        /**
         * Returns true if at least one field is edited.
         */
        public boolean isAnyFieldEdited() {
            return CollectionUtil.isAnyNonNull(name, deadline);
        }

        public Optional<String> getName() {
            return Optional.ofNullable(name);
        }

        public void setName(String name) {
            this.name = name;
        }

        public Optional<LocalDateTime> getDeadline() {
            return Optional.ofNullable(deadline);
        }

        public void setDeadline(LocalDateTime date) {
            this.deadline = date;
        }

        public Optional<List<String>> getAssignees() {
            return Optional.ofNullable(assignees);
        }

        public void setAssignees(List<String> assignees) {
            this.assignees = assignees;
        }

        @Override
        public boolean equals(Object other) {
            // short circuit if same object
            if (other == this) {
                return true;
            }

            // instanceof handles nulls
            if (!(other instanceof EditTaskCommand.EditTaskDescriptor)) {
                return false;
            }

            // state check
            EditTaskCommand.EditTaskDescriptor e = (EditTaskCommand.EditTaskDescriptor) other;

            return getName().equals(e.getName())
                    && getDeadline().equals(e.getDeadline())
                    && getAssignees().equals(e.getAssignees());
        }

    }
}
