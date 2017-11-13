import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class RemoteControlTest {

    public static void main(String[] args){

        Television tv = new Television();

        // TurnTVOn contains the command to turn on the tv
        // When execute() is called on this command object
        // it will execute the method on() in Television

        TurnTVOn onCommand = new TurnTVOn(tv);

        // Calling the execute() causes on() to execute in Television

        RemoteControl onPressed = new RemoteControl(onCommand);

        // When press() is called theCommand.execute(); executes

        onPressed.press();

        //----------------------------------------------------------

        // Now when execute() is called off() of Television executes

        TurnTVOff offCommand = new TurnTVOff(tv);

        // Calling the execute() causes off() to execute in Television

        onPressed = new RemoteControl(offCommand);

        // When press() is called theCommand.execute(); executes

        onPressed.press();


        Stack<Command> record = onPressed.getRecord();

        while (!record.isEmpty()){

            Command command = record.pop();
            System.out.print("Undo the action - ");
            command.execute();
            command.undo();
        }


    }


}
