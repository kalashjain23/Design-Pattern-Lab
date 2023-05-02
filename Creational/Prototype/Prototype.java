abstract class Mobile implements Cloneable
{
    private String name;
    private int memory;

    public String getName()
    {
        return this.name;
    }

    public int getMemory()
    {
        return this.memory;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMemory(int memory)
    {
        this.memory = memory;
    }

    public String toString()
    {
        return "Name: " + this.getName() + "\n" + "Memory: " + this.getMemory() + "\n"; 
    }

    public abstract Mobile clone();
}

class IPhone extends Mobile
{
    IPhone(String name, int memory)
    {
        this.setMemory(memory);
        this.setName(name);
    }

    IPhone(IPhone iphone)
    {
        this.setMemory(iphone.getMemory());
        this.setName(iphone.getName());
    }

    public Mobile clone()
    {
        return new IPhone(this);
        // Galaxy gal = null;
        // try
        // {
        //     gal = (Galaxy) this.clone();
        // }
        // catch(CloneNotSupportedException e){}

        // return gal;
    }
}

class Galaxy extends Mobile
{
    Galaxy(String name, int memory)
    {
        this.setMemory(memory);
        this.setName(name);
    }

    Galaxy(Galaxy galaxy)
    {
        this.setMemory(galaxy.getMemory());
        this.setName(galaxy.getName());
    }

    public Mobile clone()
    {
        return new Galaxy(this);
        // Galaxy gal = null;
        // try
        // {
        //     gal = (Galaxy) this.clone();
        // }
        // catch(CloneNotSupportedException e){}

        // return gal;
    }
}

public class Prototype {
    public static void main(String[] args) {
        IPhone iphone13 = new IPhone("IPhone13", 64);
        System.out.println(iphone13);

        IPhone pro = (IPhone) iphone13.clone();
        pro.setName("IPhone13 Pro");
        pro.setMemory(128);
        System.out.println(pro);
    }
}
