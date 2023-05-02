class User
{
    String name;

    User(String name)
    {
        this.name = name;
    }

    public void sendMessage(String text)
    {
        Chatroom.showMessage(this, text);
    }
}

class Chatroom
{
    public static void showMessage(User user, String text)
    {
        System.out.println(user.name + " sent: " + text);
    }
}

public class Mediator {
    public static void main(String[] args) {
        
        User john = new User("John");
        User jane = new User("Jane");

        john.sendMessage("Hi Jane!");
        jane.sendMessage("Hello John!");

    }
}
