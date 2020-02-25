package duke.task;

public class Todo extends Task {

    public Todo(String command, boolean status) {super(command, status);};

    public String textToFile() {
        String text = "T | 0 | ";
        if(isDone) text = "T | 1 | ";
        text += name + System.lineSeparator();
        return text;
    }

    public String print(){
        String str = "[T]";
        if(isDone) {
            str += "[\u2713]";
        } else {
            str += "[\u274c]";
        }
        return str = str + " " + name;
    }

}
