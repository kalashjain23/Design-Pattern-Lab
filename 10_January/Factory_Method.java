interface Mobile
{
    void osName();
    void playMusic();
    void sendMessage();
}

class MobileFactory
{
    public Mobile createMobile(String name)
    {
        switch(name.toLowerCase())
        {
            case "android" : return new Samsung();
            case "windows" : return new Nokia();
            case "ios" : return new Apple();
            default : return null;
        }
    }
}

class Samsung implements Mobile
{
    Samsung()
    {
        System.out.println("Samsung Mobile created!");
    }

    public void osName()
    {
        System.out.println("Android");
    }

    public void playMusic()
    {
        System.out.println("Playing music...");
    }

    public void sendMessage()
    {
        System.out.println("Sent message!");
    }
}

class Apple implements Mobile
{
    Apple()
    {
        System.out.println("Apple Mobile created!");
    }
    public void osName()
    {
        System.out.println("iOS");
    }

    public void playMusic()
    {
        System.out.println("Playing music...");
    }

    public void sendMessage()
    {
        System.out.println("Sent message!");
    }
}

class Nokia implements Mobile
{
    Nokia()
    {
        System.out.println("Nokia Mobile created!");
    }
    public void osName()
    {
        System.out.println("Windows");
    }

    public void playMusic()
    {
        System.out.println("Playing music...");
    }

    public void sendMessage()
    {
        System.out.println("Sent message!");
    }
}

public class Factory_Method {
    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();
        Mobile mobile = factory.createMobile("android");
        mobile.osName();
    }    
}
