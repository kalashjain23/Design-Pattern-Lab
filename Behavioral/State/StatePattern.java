interface State
{
    public void doAction(Context context);
}

class Context
{
    State state;

    Context()
    {
        this.state = null;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public State getState()
    {
        return this.state;
    }
}

class StartState implements State
{
    public void doAction(Context context)
    {
        System.out.println("Now in start state");
        context.setState(this);
    }

    public String toString()
    {
        return "Start STate";
    }
}

class EndState implements State
{
    public void doAction(Context context)
    {
        System.out.println("Now in end state");
        context.setState(this);
    }

    public String toString()
    {
        return "End STate";
    }
}

public class StatePattern {
    public static void main(String[] args) {

        Context context = new Context();

        StartState start = new StartState();
        start.doAction(context);

        System.out.println(context.getState());

        EndState end = new EndState();
        end.doAction(context);

        System.out.println(context.getState());
        
    }
}
