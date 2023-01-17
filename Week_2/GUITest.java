interface Button
{
    public abstract void createButton();    
}

interface Checkbox
{
    public abstract void createCheckbox();
}

class Windows_Button implements Button
{
    public void createButton()
    {
        System.out.println("Creating Windows Button !!");
    }
}

class MacOs_Button implements Button
{
    public void createButton() 
    {
        System.out.println("Creating MacOs Button !!");
    }
}

class Windows_Checkbox implements Checkbox
{
    public void createCheckbox()
    {
        System.out.println("Creating Windows Checkbox !!");
    }
}

class MacOs_Checkbox implements Checkbox
{
    public void createCheckbox() 
    {
        System.out.println("Creating MacOs Checkbox !!");    
    }
}

interface GUI_Factory
{
    public abstract Button createButton(String element);
    public abstract Checkbox createCheckbox(String element);
}

class Windows_Factory implements GUI_Factory
{
    public Button createButton(String element)
    {
        if(element == "Windows")
        {
            return new Windows_Button();
        }
        
        else
        {
            return null;
        }
    }

    public Checkbox createCheckbox(String element)
    {
        if(element == "Windows")
        {
            return new Windows_Checkbox();
        }
        
        else
        {
            return null;
        }
    }
}

class MacOs_Factory implements GUI_Factory
{
    public Button createButton(String element)
    {
        if(element == "MacOs")
        {
            return new MacOs_Button();
        }
        
        else
        {
            return null;
        }
    }
    
    public Checkbox createCheckbox(String element)
    {
        if(element == "MacOs")
        {
            return new MacOs_Checkbox();
        }
        
        else
        {
            return null;
        }
    }
}

class Factory
{
    public GUI_Factory createGUI(String GUI_Type)
    {
        if(GUI_Type == "Windows")
        {
            return new Windows_Factory();
        }

        else if(GUI_Type == "MacOs")
        {
            return new MacOs_Factory();
        }

        else
        {
            return null;
        }
    }
}


public class GUITest
{
    public static void main(String[] args) 
    {
        GUI_Factory windows_factory = new Windows_Factory();
        GUI_Factory macOS_factory = new MacOs_Factory();
        
        Button windows_button,macOS_button;
        Checkbox windows_checkbox, macOS_checkbox;

        windows_button = windows_factory.createButton("Windows");
        macOS_button = macOS_factory.createButton("MacOs");

        windows_checkbox = windows_factory.createCheckbox("Windows");
        macOS_checkbox = macOS_factory.createCheckbox("MacOs");

        windows_button.createButton();
        macOS_button.createButton();
        windows_checkbox.createCheckbox();
        macOS_checkbox.createCheckbox();
    }
}
