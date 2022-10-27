package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import picocli.CommandLine;
import seedu.address.commons.core.Messages;
import seedu.address.logic.parser.NameContainsKeywordsPredicateConverter;
import seedu.address.model.Model;
import seedu.address.model.person.NameContainsKeywordsPredicate;

/**
 * Finds and lists all persons in address book whose name contains any of the argument keywords.
 * Keyword matching is case-insensitive.
 */
@CommandLine.Command(name = "person")
public class FindPersonCommand extends Command {

    public static final String COMMAND_WORD = "find person";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Finds all persons whose names contain any of "
            + "the specified keywords (case-insensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + COMMAND_WORD + " alice bob charlie";

    @CommandLine.Parameters(arity = "1", paramLabel = "keywords", parameterConsumer = NameContainsKeywordsPredicateConverter.class)
    private NameContainsKeywordsPredicate predicate;

    public FindPersonCommand() {
    }

    @Override
    public CommandResult execute(Model model) {
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
