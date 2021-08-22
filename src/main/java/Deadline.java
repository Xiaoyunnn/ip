/**
 * A subclass of Task to represent a task with deadline.
 */
public class Deadline extends Task {
    /**
     * Due date of the task.
     */
    private String by;

    /**
     * Instantiates a Deadline Object.
     *
     * @param description description of the task.
     * @param by due date of the task.
     */
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    public Deadline(String description, boolean isDone, String by) {
        super(description, isDone);
        this.by = by;
    }

    /**
     * Returns the string representation of this Deadline Object.
     *
     * @return String representation of Deadline object.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + this.by + ")";
    }

    @Override
    public String toSaveString() {
        return "D" + super.toSaveString() + "|" + this.by;
    }
}
