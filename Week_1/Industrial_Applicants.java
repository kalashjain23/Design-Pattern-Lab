import java.util.ArrayList;

class Industry
{
    private String industry_name;
    ArrayList<String> applicants;

    Industry(String name)
    {
        this.industry_name = name;
        this.applicants = new ArrayList<String>();
    }
    
    public void addApplicant(Applicant applicant)
    {
        this.applicants.add(applicant.name);
    }

    public void showApplicants()
    {
        for(String name : this.applicants)
        {
            System.out.println(name);
        }
    }

    public void getName()
    {
        System.out.println(this.industry_name);
    }
}

class Applicant
{
    String name;
    int yoe;
    Contact contact = new Contact();

    Applicant()
    {
        this.name = "";
        this.yoe = 0;
    }

    Applicant(String name, int yoe)
    {
        this.name = name;
        this.yoe= yoe;
        
    }

    void setContact(int phone_number, String address, String mail_id)
    {
        this.contact.setAddress(address);
        this.contact.setMail(mail_id);
        this.contact.setPhoneNumber(phone_number);
    }

    void getContact()
    {
        this.contact.getPhoneNumber();
        this.contact.getAddress();
        this.contact.getMail();
    }

    public void getName()
    {
        System.out.println(this.name);
    }

    public void getYOE()
    {
        System.out.println(this.yoe);
    }
}

class Contact
{
    private long phone_number;
    private String address;
    private String mail_id;

    Contact()
    {
        this.phone_number = 0;
        this.address = "";
        this.mail_id = "";
    }

    Contact(int num, String address, String mail_id)
    {
        this.phone_number = num;
        this.address = address;
        this.mail_id = mail_id;
    }

    void setPhoneNumber(int num)
    {
        this.phone_number = num;
    }

    void setAddress(String address)
    {
        this.address = address;
    }

    void setMail(String mail)
    {
        this.mail_id = mail;
    }

    void getPhoneNumber()
    {
        System.out.println("Phone Number: " + this.phone_number);
    }

    void getAddress()
    {
        System.out.println("Address: " + this.address);
    }

    void getMail()
    {
        System.out.println("Mail Id: " + this.mail_id);
    }

    public String toString()
    {
        return (this.address);
    }
}

public class Industrial_Applicants
{
    public static void main(String[] args)
    {
        Industry textile = new Industry("Textile");
        Applicant dhruv = new Applicant("Dhruv", 3);

        textile.addApplicant(dhruv);
        textile.showApplicants();
    }
}
