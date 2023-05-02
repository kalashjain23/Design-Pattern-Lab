import java.util.*;

class SingleClass
{
    private static SingleClass SingleObject = new SingleClass();

    private SingleClass(){}

    public static SingleClass getInstance()
    {
        return SingleObject;
    }

    public void showMessage()
    {
        System.out.println("Ho gaya ji singleton");
    }
}

public class singleton
{
    public static void main(String[] args) {
        SingleClass object = SingleClass.getInstance();

        object.showMessage();
    }
}