package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.TypicalPersons.getTypicalTruthTable;

import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

class AddTaskCommandTest {

    private static final String PLACEHOLDER_TASK_NAME = "Test Task";
    private Model model = new ModelManager(getTypicalTruthTable(), new UserPrefs());

    @Test
    public void equals() {
        AddTaskCommand addTaskFirstCommand = new AddTaskCommand(PLACEHOLDER_TASK_NAME);
        AddTaskCommand addTaskSecondCommand = new AddTaskCommand(PLACEHOLDER_TASK_NAME);

        // Same Add Task Commands should be equal.
        assertTrue(addTaskFirstCommand.equals(addTaskFirstCommand));

        // Add Task commands with same task should be considered equal.
        assertTrue(addTaskFirstCommand.equals(addTaskSecondCommand));

        // Add Task commands with wrong type should return false
        assertFalse(addTaskFirstCommand.equals(2));

        // Add Task command and null are not considered equal.
        assertFalse(addTaskFirstCommand.equals(null));
    }
}
