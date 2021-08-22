/**
 * A subclass of Exception that deals with Duke-specific exceptions.
 */
public class DukeException extends Exception {
    /**
     * Message to be displayed.
     */
    private final String message;

    /**
     * Instantiates DukeException.
     *
     * @param message Error message to be displayed.
     */
    public DukeException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * Returns the string representation of this Exception.
     * @return Error message specified.
     */
    @Override
    public String toString() {
        return "OOPS!!! " + this.message;
    }
}
