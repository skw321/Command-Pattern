import java.util.Stack;

public class RemoteControl {

    Command command;
    static Stack<Command> record = new Stack<>();

    public RemoteControl (Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
        record.push(command);
    }

    public void pressUndo(){
        command.undo();
    }

    public static Stack<Command> getRecord() {
        return record;
    }

    public static void setRecord(Stack<Command> record) {
        RemoteControl.record = record;
    }
}
