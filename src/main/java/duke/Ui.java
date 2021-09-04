package duke;

import java.util.Scanner;

import duke.tasks.Task;

/**
 * Prints various messages.
 */
public class Ui {
    private final Scanner sc;

    /**
     * Instantiates a ui object.
     */
    public Ui() {
        this.sc = new Scanner(System.in);
    }

    /**
     * Prints a message to show users the number of tasks there are in the list.
     *
     * @param index Index of items, i.e. the number of tasks
     * @return Message showing the number of tasks.
     */
    public String printTaskNum(int index) {
        return "\nNow you have " + index + " tasks in the list.\n";
    }

    /**
     * Prints a message to show the task that has been successfully added to the list.
     *
     * @param task Task added to items list.
     * @return Success message showing that the specified task has been added.
     */
    public String printAddTask(Task task) {
        return "Got it. I've added this task:\n" + task;
    }

    /**
     * Prints the welcome message when the bot is first called.
     *
     * @return Welcome message.
     */
    public String printWelcomeMessage() {
        String logo = " ______           _          __\n"
                + "|   __    \\      /   \\      |   |\n"
                + "|  |_|  /     /  /\\  \\    |   |\n"
                + "|  |_|  \\   /    __   \\   |   |\n"
                + "|______/ /__/    \\__\\ |__|\n";
        return logo + "Hello! I'm Bai. （ ● ___ ●.）\nWhat can I do for you?";
    }

    /**
     * Prints the exit message when exit command is called.
     *
     * @return Exit message.
     */
    public String printExitMessage() {
        return "Goodbai. Hope to see you again soon! （ ● ___ ●.）";
    }

    /**
     * Prints the message when a task has been added to the list successfully.
     *
     * @param task Task that has been added.
     * @param size Number of items in the list after the task has been added.
     * @return Success message of the added task.
     */
    public String printTaskAdded(Task task, int size) {
        return printAddTask(task) + printTaskNum(size);
    }

    /**
     * Prints the message when a task has been deleted from the list successfully.
     *
     * @param task Task that has been deleted.
     * @return Delete message to be displayed.
     */
    public String printTaskDeleted(Task task) {
        return "Noted. I've removed this task:\n" + task;
    }

    /**
     * Prints the message when a task has been marked done.
     *
     * @param task Task that has been completed.
     * @return Done message to be displayed.
     */
    public String printTaskDone(Task task) {
        return "Nice! I've marked this task as done:\n" + task;
    }

    /**
     * Reads the user input.
     *
     * @return User input string.
     */
    public String readCommand() {
        String input = sc.nextLine();

        while (input.strip().isEmpty()) {
            input = sc.nextLine();
        }

        return input;
    }

    /**
     * Prints the error message.
     *
     * @param err Error message to be displayed.
     * @return Error message.
     */
    public String printError(String err) {
        return err;
    }
}
