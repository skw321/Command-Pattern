public class TurnTVOn implements Command {

    Television tv;

    public TurnTVOn(Television tv){

        this.tv = tv;

    }

    public void execute() {

        tv.on();

    }

    public void undo() {

        tv.off();

    }

}