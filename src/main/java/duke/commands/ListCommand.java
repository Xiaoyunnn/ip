package duke.commands;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * Prints the existing current task list.
 */
public class ListCommand extends Command {
    /**
     * The command word that identifies a ListCommand instance.
     */
    public static final String COMMAND_WORD = "list";

    /**
     * Guide on how to use this command word.
     */
    public static final String MESSAGE_USAGE = COMMAND_WORD + " - display the list of tasks";

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printHorizontalLine();
        tasks.printList();
        ui.printHorizontalLine();
    }
}
