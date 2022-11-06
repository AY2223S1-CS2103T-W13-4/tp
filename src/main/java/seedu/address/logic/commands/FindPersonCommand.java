package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR;
import static seedu.address.logic.parser.CliSyntax.FLAG_HELP_STR_LONG;
import static seedu.address.logic.parser.CliSyntax.FLAG_NAME_SEARCH_KEYWORDS_DESCRIPTION;
import static seedu.address.logic.parser.CliSyntax.LABEL_PERSON_NAME_KEYWORDS;

import picocli.CommandLine;
import seedu.address.commons.core.Messages;
import seedu.address.logic.parser.NameContainsKeywordsPredicateConverter;
import seedu.address.model.Model;
import seedu.address.model.person.NameContainsKeywordsPredicate;

/**
 * Finds and lists all persons in TruthTable whose name contains any of the argument keywords.
 * Keyword matching is case-insensitive.
 */
@CommandLine.Command(name = FindPersonCommand.COMMAND_WORD,
        aliases = {FindPersonCommand.ALIAS}, mixinStandardHelpOptions = true)
public class FindPersonCommand extends Command {
    public static final String COMMAND_WORD = "person";
    public static final String ALIAS = "p";
    public static final String FULL_COMMAND = FindCommand.COMMAND_WORD + " " + COMMAND_WORD;

    public static final String MESSAGE_USAGE = FULL_COMMAND + ": Finds all persons whose names contain any of "
            + "the specified keywords (case-insensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + FULL_COMMAND + " alice bob charlie";

    @CommandLine.Parameters(arity = "1", paramLabel = LABEL_PERSON_NAME_KEYWORDS,
            parameterConsumer = NameContainsKeywordsPredicateConverter.class,
            description = FLAG_NAME_SEARCH_KEYWORDS_DESCRIPTION)
    private NameContainsKeywordsPredicate predicate;

    @CommandLine.Option(names = {FLAG_HELP_STR, FLAG_HELP_STR_LONG}, usageHelp = true,
            description = FLAG_HELP_DESCRIPTION)
    private boolean help;

    @CommandLine.Spec
    private CommandLine.Model.CommandSpec commandSpec;

    public FindPersonCommand() {
    }

    @Override
    public CommandResult execute(Model model) {
        if (commandSpec.commandLine().isUsageHelpRequested()) {
            return new CommandResult(commandSpec.commandLine().getUsageMessage());
        }
        requireNonNull(model);
        model.updateFilteredPersonList(predicate);
        return new CommandResult(
                String.format(Messages.MESSAGE_PERSONS_LISTED_OVERVIEW, model.getFilteredPersonList().size()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof FindPersonCommand // instanceof handles nulls
                && predicate.equals(((FindPersonCommand) other).predicate)); // state check
    }

}
