package duke.task;

/**
 * the abstract task class(superclass of Deadline, Event, Todo Class)
 */
public abstract class Task {
    String name;
    boolean isDone;

    public Task(String name, boolean status) {
        this.name = name;
        isDone = status;
    }

    public String getName() {
        return name;
    }

    public void changeStatus(boolean newStatus) {
        isDone = newStatus;
    }

    public abstract String textToFile();

    public abstract String print();
}
