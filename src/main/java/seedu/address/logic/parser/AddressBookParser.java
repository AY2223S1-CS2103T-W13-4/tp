package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;

import picocli.CommandLine;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.RootCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.NameContainsKeywordsPredicate;
import seedu.address.model.person.Phone;
import seedu.address.model.team.Task;
import seedu.address.model.team.Url;

/**
 * Parses user input.
 */
public class AddressBookParser {
    private final CommandLine commandLine = new CommandLine(new RootCommand())
            .registerConverter(Name.class, new NameConverter())
            .registerConverter(Email.class, new EmailConverter())
            .registerConverter(Phone.class, new PhoneConverter())
            .registerConverter(Address.class, new AddressConverter())
            .registerConverter(Index.class, new IndexConverter())
            .registerConverter(Url.class, new UrlConverter())
            .registerConverter(Task.class, new TaskConverter())
            .registerConverter(NameContainsKeywordsPredicate.class, new NameContainsKeywordsPredicateConverter());

    /**
     * Parses user input into command for execution.
     *
     * @param userInput full user input string
     * @return the command based on the user input
     * @throws ParseException if the user input does not conform the expected format
     */
    public Command parseCommand(String userInput) throws ParseException {
        try {
            String[] args = ArgumentTokenizer.tokenize(userInput.trim());

            CommandLine.ParseResult parseResult = commandLine.parseArgs(args);
            CommandLine.ParseResult commandExecuted = parseResult.subcommand();

            // Since all commands are defined to be subcommands of RootCommand, there will always be a non-null
            // subcommand inside the parsed result
            assert commandExecuted != null;

            // Deepest subcommand is the actual command executed
            while (commandExecuted.subcommand() != null) {
                commandExecuted = commandExecuted.subcommand();
            }

            return (Command) commandExecuted.commandSpec().userObject();
        } catch (CommandLine.UnmatchedArgumentException e) {
            throw new ParseException(MESSAGE_UNKNOWN_COMMAND);
        } catch (CommandLine.PicocliException e) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, e.getMessage()));
        }
    }

}
