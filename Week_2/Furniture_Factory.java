interface AbstractFurnitureFactory
{
    Chair createChair();
    Table createTable();
}

class FactoryProducer
{
    public static AbstractFurnitureFactory createFactory(String type)
    {
        if(type.toLowerCase() == "plastic") return new PlasticFactory();
        else return new WoodenFactory();
    }
}

class PlasticFactory implements AbstractFurnitureFactory
{
    public PlasticChair createChair()
    {
        return new PlasticChair();
    }

    public PlasticTable createTable()
    {
        return new PlasticTable();
    }
}

class WoodenFactory implements AbstractFurnitureFactory
{
    public WoodenChair createChair()
    {
        return new WoodenChair();
    }

    public WoodenTable createTable()
    {
        return new WoodenTable();
    }
}

interface Chair
{
    void setColor(String color);
    String getColor();
}

interface Table
{
    void setColor(String color);
    String getColor();
}

class PlasticChair implements Chair
{
    String color;

    PlasticChair()
    {
        System.out.println("Plastic chair has been created!");
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }
}

class WoodenChair implements Chair
{
    String color;

    WoodenChair()
    {
        System.out.println("Wooden chair has been created!");
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }
}

class PlasticTable implements Table
{
    String color;

    PlasticTable()
    {
        System.out.println("Plastic table has been created!");
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }
}

class WoodenTable implements Table
{
    String color;

    WoodenTable()
    {
        System.out.println("Wooden table has been created!");
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }
}  

public class Furniture_Factory {
    public static void main(String[] args) {
        PlasticFactory plastic_factory = (PlasticFactory) FactoryProducer.createFactory("plastic");
        WoodenFactory wooden_factory = (WoodenFactory) FactoryProducer.createFactory("wooden");

        WoodenTable wooden_table = wooden_factory.createTable();
        PlasticChair plastic_chair = plastic_factory.createChair();

        plastic_chair.setColor("Red");
        System.out.println(plastic_chair.getColor());
        wooden_table.setColor("Blue");
        System.out.println(wooden_table.getColor());
    }
}
