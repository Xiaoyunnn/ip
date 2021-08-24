package duke.commands;

import java.time.format.DateTimeFormatter;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * Abstract Command class to categorise user commands.
 */
public abstract class Command {
    /**
     * Formatter for parsing String into Date.
     */
    public static final DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HHmm");

    /**
     * Returns true if the command is an exit command, return false otherwise.
     *
     * @return true if the command is an exit command, return false otherwise.
     */
    abstract public boolean isExit();

    /**
     * Executes the respective command given and displays the result or error message(s).
     *
     * @param tasks TaskList that stores the list of tasks.
     * @param ui Ui instance that prints various messages.
     * @param storage Storage instance that reads and writes the task list.
     */
    abstract public void execute(TaskList tasks, Ui ui, Storage storage);
}
