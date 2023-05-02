import java.util.*;

class Memento
{
    String fontstyle;
    int fontsize;

    Memento(String fontstyle, int fontsize)
    {
        this.fontsize = fontsize;
        this.fontstyle = fontstyle;
    }

    public Memento getState()
    {
        return this;
    }

    public String toString()
    {
        return "Font Style: " + this.fontstyle + ", Font Size: " + this.fontsize + "\n";
    }
}

class Originator
{
    String fontstyle;
    int fontsize;
    Memento state;

    public void setState(String fontstyle, int fontsize)
    {
        this.fontsize = fontsize;
        this.fontstyle = fontstyle;
    }

    public void saveState()
    {
        state = new Memento(this.fontstyle, this.fontsize);
    }

    public Memento getState()
    {
        return state;
    }

    public Memento getStateFromMemento(Memento memento)
    {
        return memento.getState();
    }
}

class Caretaker
{
    private ArrayList<Memento> snaps = new ArrayList<Memento>();

    public void add(Memento memento)
    {
        snaps.add(memento);
    }

    public Memento get(int index)
    {
        return snaps.get(index);
    }

    public void remove(Memento memento)
    {
        snaps.remove(memento);
    }
}

public class MementoPattern {
    public static void main(String[] args) {
        
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Bold", 12);
        originator.saveState();
        caretaker.add(originator.getState());

        originator.setState("Italic", 14);
        originator.saveState();
        caretaker.add(originator.getState());

        originator.setState("Underline", 16);
        originator.saveState();
        caretaker.add(originator.getState());

        System.out.println("Current State: " + originator.getState());
        System.out.println("First saved State: " + caretaker.get(0));
        System.out.println("Second saved State: " + caretaker.get(1));
        System.out.println("Third saved State: " + caretaker.get(2));
        
    }
}
