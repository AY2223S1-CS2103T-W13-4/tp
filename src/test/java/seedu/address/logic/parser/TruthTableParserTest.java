package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_WITH_HELP_COMMAND;
import static seedu.address.logic.parser.CliSyntax.FLAG_ASSIGNEE_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_COMPLETE_TASKS_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_EMAIL_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_INCOMPLETE_TASKS_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_NAME_STR;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;
import static seedu.address.testutil.TypicalIndexes.INDEX_ONE;
import static seedu.address.testutil.TypicalIndexes.INDEX_SECOND_PERSON;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.AddCommand;
import seedu.address.logic.commands.AddLinkCommand;
import seedu.address.logic.commands.AddMemberCommand;
import seedu.address.logic.commands.AddPersonCommand;
import seedu.address.logic.commands.AddTaskCommand;
import seedu.address.logic.commands.AddTeamCommand;
import seedu.address.logic.commands.AssignCommand;
import seedu.address.logic.commands.AssignTaskCommand;
import seedu.address.logic.commands.AssignTaskRandomlyCommand;
import seedu.address.logic.commands.ClearCommand;
import seedu.address.logic.commands.DeleteCommand;
import seedu.address.logic.commands.DeleteLinkCommand;
import seedu.address.logic.commands.DeleteMemberCommand;
import seedu.address.logic.commands.DeletePersonCommand;
import seedu.address.logic.commands.DeleteTaskCommand;
import seedu.address.logic.commands.DeleteTeamCommand;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.EditLinkCommand;
import seedu.address.logic.commands.EditPersonCommand;
import seedu.address.logic.commands.EditTaskCommand;
import seedu.address.logic.commands.EditTeamCommand;
import seedu.address.logic.commands.ExitCommand;
import seedu.address.logic.commands.FindCommand;
import seedu.address.logic.commands.FindMemberCommand;
import seedu.address.logic.commands.FindPersonCommand;
import seedu.address.logic.commands.FindTaskCommand;
import seedu.address.logic.commands.HelpCommand;
import seedu.address.logic.commands.ListCommand;
import seedu.address.logic.commands.ListMembersCommand;
import seedu.address.logic.commands.ListPersonsCommand;
import seedu.address.logic.commands.ListTasksCommand;
import seedu.address.logic.commands.MarkCommand;
import seedu.address.logic.commands.SetCommand;
import seedu.address.logic.commands.SetDeadlineCommand;
import seedu.address.logic.commands.SetTeamCommand;
import seedu.address.logic.commands.SortCommand;
import seedu.address.logic.commands.SortMemberCommand;
import seedu.address.logic.commands.SortTaskCommand;
import seedu.address.logic.commands.TasksOfCommand;
import seedu.address.logic.commands.TasksSummaryCommand;
import seedu.address.logic.commands.ThemeCommand;
import seedu.address.logic.commands.UnmarkCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.NameContainsKeywordsPredicate;
import seedu.address.model.person.Person;
import seedu.address.model.team.Link;
import seedu.address.model.team.Task;
import seedu.address.model.team.Team;
import seedu.address.testutil.LinkBuilder;
import seedu.address.testutil.LinkUtil;
import seedu.address.testutil.ParserHelper;
import seedu.address.testutil.PersonBuilder;
import seedu.address.testutil.PersonUtil;
import seedu.address.testutil.TaskBuilder;
import seedu.address.testutil.TaskUtil;
import seedu.address.testutil.TeamBuilder;
import seedu.address.testutil.TeamUtil;

public class TruthTableParserTest {

    private final TruthTableParser parser = new TruthTableParser();

    @Test
    public void parseCommand_add() throws Exception {
        AddCommand command = (AddCommand) parser.parseCommand(AddCommand.COMMAND_WORD);
        assertEquals(new AddCommand(), command);
    }

    @Test
    public void parseCommand_addLink() throws Exception {
        Link link = new LinkBuilder().build();
        AddLinkCommand command = (AddLinkCommand) parser.parseCommand(LinkUtil.getAddLinkCommand(link));
        assertEquals(link.getDisplayedName(), ParserHelper.getLinkName(command));
        assertEquals(link.getUrl(), ParserHelper.getUrl(command));
    }
    @Test
    public void parseCommand_addMember() throws Exception {
        AddMemberCommand command = (AddMemberCommand) parser.parseCommand(
                        AddMemberCommand.FULL_COMMAND + " " + INDEX_FIRST_PERSON.getOneBased());
        assertEquals(INDEX_FIRST_PERSON, ParserHelper.getIndex(command));
    }
    @Test
    public void parseCommand_addPerson() throws Exception {
        Person person = new PersonBuilder().build();
        AddPersonCommand command =
                (AddPersonCommand) parser.parseCommand(PersonUtil.getAddPersonCommand(person));
        assertEquals(person.getName(), ParserHelper.getName(command));
        assertEquals(person.getPhone(), ParserHelper.getPhone(command));
        assertEquals(person.getEmail(), ParserHelper.getEmail(command));
        assertEquals(person.getAddress(), ParserHelper.getAddress(command));
    }
    @Test
    public void parseCommand_addTask() throws Exception {
        Task task = new TaskBuilder().build();
        AddTaskCommand command = (AddTaskCommand) parser.parseCommand(TaskUtil.getAddTaskCommand(task));
        assertEquals(task.getName(), ParserHelper.getTaskName(command));
        assertTrue(Arrays.equals(new String[] {"1", "2"}, ParserHelper.getAssignees(command)));
        assertEquals(task.getDeadline().get(), ParserHelper.getDeadline(command));
    }

    @Test
    public void parseCommand_addTeam() throws Exception {
        Team team = new TeamBuilder().build();
        AddTeamCommand command =
                (AddTeamCommand) parser.parseCommand(TeamUtil.getAddTeamCommand(team));
        assertEquals(team.getTeamName(), ParserHelper.getTeamName(command));
        assertEquals(team.getDescription(), ParserHelper.getDescription(command));
    }

    @Test
    public void parseCommand_assign() throws Exception {
        AssignCommand command = (AssignCommand) parser.parseCommand(AssignCommand.COMMAND_WORD);
        assertEquals(new AssignCommand(), command);
    }
    @Test
    public void parseCommand_assignTask() throws Exception {
        String commandString = AssignTaskCommand.FULL_COMMAND + " "
                + INDEX_ONE.getOneBased() + " "
                + FLAG_ASSIGNEE_STR + " "
                + INDEX_FIRST_PERSON.getOneBased() + " "
                + INDEX_SECOND_PERSON.getOneBased();
        AssignTaskCommand command = (AssignTaskCommand) parser.parseCommand(commandString);
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
        assertTrue(Arrays.equals(new String[] {"1", "2"}, ParserHelper.getAssignees(command)));
    }
    @Test
    public void parseCommand_assignRandom() throws Exception {
        String commandString = AssignTaskRandomlyCommand.FULL_COMMAND + " "
                + INDEX_ONE.getOneBased();
        AssignTaskRandomlyCommand command = (AssignTaskRandomlyCommand) parser.parseCommand(commandString);
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
    }

    @Test
    public void parseCommand_clear() throws Exception {
        ClearCommand command = (ClearCommand) parser.parseCommand(ClearCommand.COMMAND_WORD);
        assertEquals(new ClearCommand(), command);
    }

    @Test
    public void parseCommand_delete() throws Exception {
        DeleteCommand command = (DeleteCommand) parser.parseCommand(DeleteCommand.COMMAND_WORD);
        assertEquals(new DeleteCommand(), command);
    }

    @Test
    public void parseCommand_deleteLink() throws Exception {
        DeleteLinkCommand command = (DeleteLinkCommand) parser.parseCommand(
                        DeleteLinkCommand.FULL_COMMAND + " " + INDEX_ONE.getOneBased());
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
    }
    @Test
    public void parseCommand_deleteMember() throws Exception {
        DeleteMemberCommand command = (DeleteMemberCommand) parser.parseCommand(
                DeleteMemberCommand.FULL_COMMAND + " " + INDEX_ONE.getOneBased());
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
    }
    @Test
    public void parseCommand_deletePerson() throws Exception {
        DeletePersonCommand command = (DeletePersonCommand) parser.parseCommand(
                DeletePersonCommand.FULL_COMMAND + " " + INDEX_ONE.getOneBased());
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
    }
    @Test
    public void parseCommand_deleteTask() throws Exception {
        DeleteTaskCommand command = (DeleteTaskCommand) parser.parseCommand(
                DeleteTaskCommand.FULL_COMMAND + " " + INDEX_ONE.getOneBased());
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
    }
    @Test
    public void parseCommand_deleteTeam() throws Exception {
        Team team = new TeamBuilder().build();
        String commandString = DeleteTeamCommand.FULL_COMMAND + " "
                + team.getTeamName().toString();
        DeleteTeamCommand command = (DeleteTeamCommand) parser.parseCommand(commandString);
        assertEquals(team.getTeamName(), ParserHelper.getTeamName(command));
    }

    @Test
    public void parseCommand_edit() throws Exception {
        EditCommand command = (EditCommand) parser.parseCommand(EditCommand.COMMAND_WORD);
        assertEquals(new EditCommand(), command);
    }

    @Test
    public void parseCommand_editLink() throws Exception {
        Link link = new LinkBuilder().build();
        String commandString = EditLinkCommand.FULL_COMMAND + " "
                + INDEX_ONE.getOneBased() + " "
                + LinkUtil.getLinkDetails(link);
        EditLinkCommand command = (EditLinkCommand) parser.parseCommand(commandString);
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
        assertEquals(link.getDisplayedName(), ParserHelper.getLinkName(command));
        assertEquals(link.getUrl(), ParserHelper.getUrl(command));
    }

    @Test
    public void parseCommand_editPerson() throws Exception {
        Person person = new PersonBuilder().build();
        String commandString = EditPersonCommand.FULL_COMMAND + " "
                + INDEX_ONE.getOneBased() + " "
                + PersonUtil.getPersonDetails(person);
        EditPersonCommand command = (EditPersonCommand) parser.parseCommand(commandString);
        assertEquals(person.getName(), ParserHelper.getName(command));
        assertEquals(person.getPhone(), ParserHelper.getPhone(command));
        assertEquals(person.getEmail(), ParserHelper.getEmail(command));
        assertEquals(person.getAddress(), ParserHelper.getAddress(command));
    }

    @Test
    public void parseCommand_editTask() throws Exception {
        Task task = new TaskBuilder().build();
        String commandString = EditTaskCommand.FULL_COMMAND + " "
                + INDEX_ONE.getOneBased() + " "
                + TaskUtil.getTaskDetailsWithNameFlag(task);
        EditTaskCommand command = (EditTaskCommand) parser.parseCommand(commandString);
        assertEquals(task.getName(), ParserHelper.getTaskName(command));
        assertTrue(Arrays.equals(new String[] {"1", "2"}, ParserHelper.getAssignees(command)));
        assertEquals(task.getDeadline().get(), ParserHelper.getDeadline(command));
    }
    @Test
    public void parseCommand_editTeam() throws Exception {
        Team team = new TeamBuilder().build();
        String commandString = EditTeamCommand.FULL_COMMAND + " "
                + TeamUtil.getTeamDetailsWithNameFlag(team);
        EditTeamCommand command = (EditTeamCommand) parser.parseCommand(commandString);
        assertEquals(team.getTeamName(), ParserHelper.getTeamName(command));
        assertEquals(team.getDescription(), ParserHelper.getDescription(command));

    }

    @Test
    public void parseCommand_exit() throws Exception {
        ExitCommand command = (ExitCommand) parser.parseCommand(ExitCommand.COMMAND_WORD);
        assertEquals(new ExitCommand(), command);
    }

    @Test
    public void parseCommand_find() throws Exception {
        FindCommand command = (FindCommand) parser.parseCommand(FindCommand.COMMAND_WORD);
        assertEquals(new FindCommand(), command);
    }

    @Test
    public void parseCommand_findMember() throws Exception {
        List<String> keywords = Arrays.asList("foo", "bar", "baz");
        String nameCommandString = FindMemberCommand.FULL_COMMAND + " "
                + FLAG_NAME_STR + " "
                + keywords.stream().collect(Collectors.joining(" "));
        FindMemberCommand nameFindCommand = (FindMemberCommand) parser.parseCommand(nameCommandString);
        assertTrue(Arrays.equals(keywords.toArray(), ParserHelper.getNameKeyWords(nameFindCommand)));

        String emailCommandString = FindMemberCommand.FULL_COMMAND + " "
                + FLAG_EMAIL_STR + " "
                + keywords.stream().collect(Collectors.joining(" "));
        FindMemberCommand emailFindCommand = (FindMemberCommand) parser.parseCommand(emailCommandString);
        assertTrue(Arrays.equals(keywords.toArray(), ParserHelper.getEmailKeyWords(nameFindCommand)));
    }

    @Test
    public void parseCommand_findPerson() throws Exception {
        List<String> keywords = Arrays.asList("foo", "bar", "baz");
        String commandString = FindPersonCommand.FULL_COMMAND + " "
                + keywords.stream().collect(Collectors.joining(" "));
        FindPersonCommand command = (FindPersonCommand) parser.parseCommand(commandString);
        assertEquals(new NameContainsKeywordsPredicate(keywords),
                ParserHelper.getNameContainsKeywordsPredicate(command));
    }
    @Test
    public void parseCommand_findTask() throws Exception {
        List<String> keywords = Arrays.asList("foo", "bar", "baz");
        String commandString = FindTaskCommand.FULL_COMMAND + " "
                + FLAG_NAME_STR + " "
                + keywords.stream().collect(Collectors.joining(" "));
        FindTaskCommand nameFindCommand = (FindTaskCommand) parser.parseCommand(commandString);
        assertTrue(Arrays.equals(keywords.toArray(), ParserHelper.getNameKeyWords(nameFindCommand)));
    }

    @Test
    public void parseCommand_help() throws Exception {
        HelpCommand command = (HelpCommand) parser.parseCommand(HelpCommand.COMMAND_WORD);
        assertEquals(new HelpCommand(), command);
    }

    @Test
    public void parseCommand_list() throws Exception {
        ListCommand command = (ListCommand) parser.parseCommand(ListCommand.COMMAND_WORD);
        assertEquals(new ListCommand(), command);
    }

    @Test
    public void parseCommand_listMembers() throws Exception {
        ListMembersCommand command = (ListMembersCommand) parser.parseCommand(ListMembersCommand.FULL_COMMAND);
        assertEquals(new ListMembersCommand(), command);
    }
    @Test
    public void parseCommand_listPersons() throws Exception {
        ListPersonsCommand command = (ListPersonsCommand) parser.parseCommand(ListPersonsCommand.FULL_COMMAND);
        assertEquals(new ListPersonsCommand(), command);
    }
    @Test
    public void parseCommand_listTasks() throws Exception {
        ListTasksCommand commandEmpty = (ListTasksCommand) parser.parseCommand("list tasks");
        assertEquals(false, ParserHelper.getIsComplete(commandEmpty));
        assertEquals(false, ParserHelper.getIsIncomplete(commandEmpty));
        ListTasksCommand commandFlagComplete = (ListTasksCommand) parser.parseCommand(
                ListTasksCommand.FULL_COMMAND + " " + FLAG_COMPLETE_TASKS_STR);
        assertEquals(true, ParserHelper.getIsComplete(commandFlagComplete));
        assertEquals(false, ParserHelper.getIsIncomplete(commandFlagComplete));
        ListTasksCommand commandFlagIncomplete = (ListTasksCommand) parser.parseCommand(
                ListTasksCommand.FULL_COMMAND + " " + FLAG_INCOMPLETE_TASKS_STR);
        assertEquals(false, ParserHelper.getIsComplete(commandFlagIncomplete));
        assertEquals(true, ParserHelper.getIsIncomplete(commandFlagIncomplete));
    }
    @Test
    public void parseCommand_mark() throws Exception {
        MarkCommand command = (MarkCommand) parser.parseCommand(
                MarkCommand.FULL_COMMAND + " " + INDEX_ONE.getOneBased());
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
    }

    @Test
    public void parseCommand_set() throws Exception {
        SetCommand command = (SetCommand) parser.parseCommand(SetCommand.COMMAND_WORD);
        assertEquals(new SetCommand(), command);
    }
    @Test
    public void parseCommand_setDeadline() throws Exception {
        Task task = new TaskBuilder().build();
        String commandString = SetDeadlineCommand.FULL_COMMAND + " "
                + INDEX_ONE.getOneBased() + " "
                + task.getDeadlineStorage();
        SetDeadlineCommand command = (SetDeadlineCommand) parser.parseCommand(commandString);
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
        assertEquals(task.getDeadline().get(), ParserHelper.getDeadline(command));
    }

    @Test
    public void parseCommand_setTeam() throws Exception {
        Team team = new TeamBuilder().build();
        String commandString = SetTeamCommand.FULL_COMMAND + " "
                + team.getTeamName().toString();
        SetTeamCommand command = (SetTeamCommand) parser.parseCommand(commandString);
        assertEquals(team.getTeamName(), ParserHelper.getTeamName(command));
    }

    @Test
    public void parseCommand_sort() throws Exception {
        SortCommand command = (SortCommand) parser.parseCommand(SortCommand.COMMAND_WORD);
        assertEquals(new SortCommand(), command);
    }
    @Test
    public void parseCommand_sortMember() throws Exception {
        String commandString = SortMemberCommand.FULL_COMMAND + " "
                + "asc";
        SortMemberCommand command = (SortMemberCommand) parser.parseCommand(commandString);
        assertEquals(Order.ASCENDING, ParserHelper.getOrder(command));
    }
    @Test
    public void parseCommand_sortTask() throws Exception {
        String commandString = SortTaskCommand.FULL_COMMAND + " "
                + "asc";
        SortTaskCommand command = (SortTaskCommand) parser.parseCommand(commandString);
        assertEquals(Order.ASCENDING, ParserHelper.getOrder(command));
    }

    @Test
    public void parseCommand_taskOf() throws Exception {
        TasksOfCommand command = (TasksOfCommand) parser.parseCommand(
                TasksOfCommand.FULL_COMMAND + " " + INDEX_ONE.getOneBased());
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
    }
    @Test
    public void parseCommand_taskSummary() throws Exception {
        TasksSummaryCommand command = (TasksSummaryCommand) parser.parseCommand(TasksSummaryCommand.COMMAND_WORD);
        assertEquals(new TasksSummaryCommand(), command);
    }
    @Test
    public void parseCommand_theme() throws Exception {
        ThemeCommand command = (ThemeCommand) parser.parseCommand(ThemeCommand.COMMAND_WORD);
        assertEquals(new ThemeCommand(), command);
    }

    @Test
    public void parseCommand_unmark() throws Exception {
        UnmarkCommand command = (UnmarkCommand) parser.parseCommand(
                UnmarkCommand.FULL_COMMAND + " " + INDEX_ONE.getOneBased());
        assertEquals(INDEX_ONE, ParserHelper.getIndex(command));
    }


    @Test
    public void parseCommand_unrecognisedInput_throwsParseException() {

    }

    @Test
    public void parseCommand_unknownCommand_throwsParseException() {
        assertThrows(ParseException.class, String.format(MESSAGE_INVALID_COMMAND_WITH_HELP_COMMAND,
                HelpCommand.MESSAGE_USAGE), () -> parser.parseCommand("unknownCommand"));
    }
}
