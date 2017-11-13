public class TurnTVOff implements Command {

    Television tv;

    public TurnTVOff(Television tv){

        this.tv = tv;

    }

    public void execute() {

        tv.off();

    }

    // Used if you want to allow for undo
    // Do the opposite of execute()

    public void undo() {

        tv.on();

    }

}