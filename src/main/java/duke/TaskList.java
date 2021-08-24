package duke;

import duke.tasks.Task;
import java.util.List;

public class TaskList {
    private List<Task> items;

    public TaskList(List<Task> items) {
        this.items = items;
    }

    public Task getTask(int index) {
        return items.get(index);
    }

    public List<Task> getItems() {
        return items;
    }

    public int getSize() {
        return items.size();
    }

    public void markTaskDone(int index) {
        items.get(index).markAsDone();
    }

    public void addTask(Task task) {
        this.items.add(task);
    }

    public void deleteTask(int index) {
        this.items.remove(index);
    }

    /**
     * Prints the list of tasks the user has currently.
     */
    public void printList() {
        if (items.size() > 0) {
            System.out.println("Here are the tasks in your list:");

            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%d. " + items.get(i) + "\n", i + 1);
            }
        } else {
            System.out.println("You have no tasks in your list.");
        }

    }
}
