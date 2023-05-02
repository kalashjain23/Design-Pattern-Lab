import java.util.*;

class Subject
{
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int population;

    public void setPopulation(int population)
    {
        this.population = population;
        notifyAllObservers();
    }

    public int getPoulation()
    {
        return this.population;
    }

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    private void notifyAllObservers()
    {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }
}

abstract class Observer
{
    protected Subject subject;
    public void update(){};
}

class WHO extends Observer
{
    WHO(Subject subject)
    {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public void update()
    {
        System.out.println("WHO: " + subject.getPoulation());
    }
}

class TOI extends Observer
{
    TOI(Subject subject)
    {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public void update()
    {
        System.out.println("TOI: " + subject.getPoulation());
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        
        Subject subject = new Subject();
        new WHO(subject);
        new TOI(subject);

        subject.setPopulation(100);
        subject.setPopulation(200);
        subject.setPopulation(300);

    }
}
