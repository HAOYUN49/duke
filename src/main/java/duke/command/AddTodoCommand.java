package duke.command;

import duke.Parser;
import duke.TaskList;
import duke.Ui;

/**
 * a command class that executes the operation to add a todo task to task list
 */
public class AddTodoCommand extends Command {

    private String taskName;

    public AddTodoCommand(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList tasks, Ui ui) {
        String description = tasks.addTodo(taskName);
        ui.printFormat(Ui.ADD_TASK+description);
    }

}
