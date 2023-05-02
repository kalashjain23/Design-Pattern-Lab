interface IceCream
{
    void makeIceCream();
}

class SimpleIceCream implements IceCream
{
    public void makeIceCream()
    {
        System.out.println("Base IceCream");
    }
}

abstract class IceCreamDecorator implements IceCream
{
    IceCream icecream;

    public IceCreamDecorator(IceCream icecream)
    {
        this.icecream = icecream;
    }

    public void makeIceCream()
    {
        icecream.makeIceCream();
    }
}

class NuttyDecorator extends IceCreamDecorator
{
    public NuttyDecorator(IceCream icecream)
    {
        super(icecream);
    }

    public void makeIceCream()
    {
        super.makeIceCream();
        System.out.println("Adding Nuts");
    }
}

class HoneyDecorator extends IceCreamDecorator
{
    public HoneyDecorator(IceCream icecream)
    {
        super(icecream);
    }

    public void makeIceCream()
    {
        super.makeIceCream();
        System.out.println("Adding Honey");
    }
}

public class Decorator {
    public static void main(String[] args) {
        
        IceCream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIceCream()));
        icecream.makeIceCream();

    }
}
