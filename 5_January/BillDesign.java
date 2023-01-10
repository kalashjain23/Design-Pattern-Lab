abstract class Bill
{
    private int bill_id;
    private int bill_unit;
    private float bill_rate;
    abstract float calculateBill();

    void setBillRate(float rate)
    {
        this.bill_rate = rate;
    }

    void setBillId(int id)
    {
        this.bill_id = id;
    }

    void setBillUnit(int unit)
    {
        this.bill_unit = unit;
    }

    void getBillRate()
    {
        System.out.println(this.bill_rate);
    }

    void getBillId()
    {
        System.out.println(this.bill_id);
    }

    void getBillUnit()
    {
        System.out.println(this.bill_unit);
    }
}

class MobileBill extends Bill
{
    MobileBill()
    {
        this.bill_id = 0;
        this.bill_unit = 0;
        this.bill_rate = 0;
    }

    MobileBill(int bill_id, int bill_unit, float bill_rate)
    {
        this.bill_id = bill_id;
        this.bill_rate = bill_rate;
        this.bill_unit = bill_unit;
    }
    
    float calculateBill()
    {
        return this.bill_rate * this.bill_unit;
    }

    void printBill()
    {
        System.out.println("Bill_Id: " + this.bill_id);
        System.out.println("Bill_Unit: " + this.bill_unit);
        System.out.println("Bill_Rate: " + this.bill_rate);
        System.out.println("Bill_Amount: " + calculateBill());
    }

}

class ElectricityBill extends Bill
{
    ElectricityBill()
    {
        this.bill_id = 0;
        this.bill_unit = 0;
        this.bill_rate = 0;   
    }

    ElectricityBill(int bill_id, int bill_unit, float bill_rate)
    {
        this.bill_id = bill_id;
        this.bill_rate = bill_rate;
        this.bill_unit = bill_unit;
    }

    float calculateBill()
    {
        return this.bill_rate * this.bill_unit;
    }

    void printBill()
    {
        System.out.println("Bill_Id: " + this.bill_id);
        System.out.println("Bill_Unit: " + this.bill_unit);
        System.out.println("Bill_Rate: " + this.bill_rate);
        System.out.println("Bill_Amount: " + calculateBill());
    }

    void setBillRate(float rate)
    {
        this.bill_rate = rate;
    }

    void setBillId(int id)
    {
        this.bill_id = id;
    }

    void setBillUnit(int unit)
    {
        this.bill_unit = unit;
    }

    void getBillRate()
    {
        System.out.println(this.bill_rate);
    }

    void getBillId()
    {
        System.out.println(this.bill_id);
    }

    void getBillUnit()
    {
        System.out.println(this.bill_unit);
    }
}

class GasBill extends Bill
{
    GasBill()
    {
        this.bill_id = 0;
        this.bill_unit = 0;
        this.bill_rate = 0;
    }

    GasBill(int bill_id, int bill_unit, float bill_rate)
    {
        this.bill_id = bill_id;
        this.bill_rate = bill_rate;
        this.bill_unit = bill_unit;
    }

    float calculateBill()
    {
        return this.bill_rate * this.bill_unit;
    }

    void printBill()
    {
        System.out.println("Bill_Id: " + this.bill_id);
        System.out.println("Bill_Unit: " + this.bill_unit);
        System.out.println("Bill_Rate: " + this.bill_rate);
        System.out.println("Bill_Amount: " + calculateBill());
    }

    void setBillRate(float rate)
    {
        this.bill_rate = rate;
    }

    void setBillId(int id)
    {
        this.bill_id = id;
    }

    void setBillUnit(int unit)
    {
        this.bill_unit = unit;
    }

    void getBillRate()
    {
        System.out.println(this.bill_rate);
    }

    void getBillId()
    {
        System.out.println(this.bill_id);
    }

    void getBillUnit()
    {
        System.out.println(this.bill_unit);
    }
}

public class BillDesign
{
    public static void main(String[] args)
    {
        
    }
}
