package duke.command;

import duke.Parser;
import duke.TaskList;
import duke.Ui;
import duke.exception.DukeException;

/**
 * a command class that executes the operation of deleting a task in task list
 */
public class DeleteCommand extends Command {

    private int taskNo;

    public DeleteCommand(int taskNo) {
        this.taskNo = taskNo;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    /**
     * execution method of delete command
     * @param tasks the object stores task list and can do operations on the task list
     * @param ui the object that interacts with users
     * @throws DukeException if the task# entered by the user is out of bound
     */
    public void execute(TaskList tasks, Ui ui) throws DukeException{
        try {
            String description = tasks.deleteTask(taskNo);
            ui.printFormat(Ui.DELETE_TASK + description);
        } catch (IndexOutOfBoundsException e) {
            throw new DukeException("The taskNo is not within the range");
        }
    }
}
