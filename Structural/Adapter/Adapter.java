interface Bird
{
    public void makeSound();
}

interface Toy
{
    public void squeak();
}

class Sparrow implements Bird
{
    public void makeSound()
    {
        System.out.println("Chirpppp");
    }
}

class ToySparrow implements Toy
{
    public void squeak()
    {
        System.out.println("Puchuk");
    }
}

class ToyBird implements Toy
{
    Bird bird;

    ToyBird(Bird bird)
    {
        this.bird = bird;
    }

    public void squeak()
    {
        bird.makeSound();
    }
}

public class Adapter {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Toy plasticBird = new ToyBird(sparrow);

        plasticBird.squeak();
    }
}
