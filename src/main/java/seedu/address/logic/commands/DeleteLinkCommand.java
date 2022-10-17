package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;
import seedu.address.model.team.Link;

public class DeleteLinkCommand extends Command {
    public static final String COMMAND_WORD = "delete_link";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Deletes an existing link TODO";

    public static final String MESSAGE_DELETE_LINK_SUCCESS = "Deleted Link: %1$s";

    private final Index targetIndex;

    public DeleteLinkCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }


    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Link> lastShownList = model.getFilteredLinkList();
        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }
        Link linkToDelete = lastShownList.get(targetIndex.getZeroBased());
        model.deleteLink(linkToDelete);
        return new CommandResult(String.format(MESSAGE_DELETE_LINK_SUCCESS, linkToDelete));


    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof DeleteLinkCommand // instanceof handles nulls
                && targetIndex.equals(((DeleteLinkCommand) other).targetIndex)); // state check
    }
}
