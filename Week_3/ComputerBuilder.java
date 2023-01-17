class Computer
{
    private int HDD;
    private int RAM_size;
    private String processor_make;
    private String processor_type;
    private float monitorSize;
    private String monitorType;
    private String osConfig;
    private String deviceDriver;

    public Computer(int HDD, int RAM_size, String processor_make, String processor_type, float monitorSize, String monitorType, String osConfig, String deviceDriver) {
        this.HDD = HDD;
        this.RAM_size = RAM_size;
        this.processor_make = processor_make;
        this.processor_type = processor_type;
        this.monitorSize = monitorSize;
        this.monitorType = monitorType;
        this.osConfig = osConfig;
        this.deviceDriver = deviceDriver;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public int getRAM_size() {
        return RAM_size;
    }

    public void setRAM_size(int RAM_size) {
        this.RAM_size = RAM_size;
    }

    public String getProcessor_make() {
        return processor_make;
    }

    public void setProcessor_make(String processor_make) {
        this.processor_make = processor_make;
    }

    public String getProcessor_type() {
        return processor_type;
    }

    public void setProcessor_type(String processor_type) {
        this.processor_type = processor_type;
    }

    public float getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(float monitorSize) {
        this.monitorSize = monitorSize;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public String getOsConfig() {
        return osConfig;
    }

    public void setOsConfig(String osConfig) {
        this.osConfig = osConfig;
    }

    public String getDeviceDriver() {
        return deviceDriver;
    }

    public void setDeviceDriver(String deviceDriver) {
        this.deviceDriver = deviceDriver;
    }

    public String toString() {
        return "Computer {" + "HDD=" + HDD + ", RAM_size=" + RAM_size + ", processor_make=" + processor_make + ", processor_type=" + processor_type + ", monitorSize=" + monitorSize + ", monitorType=" + monitorType + ", osConfig=" + osConfig + ", deviceDriver=" + deviceDriver + '}';
    }
}

public class ComputerBuilder {
    public static void main(String[] args) {
        Computer computer = new Computer(500, 8, "Intel", "i7", 15.6f, "LED", "Windows 10", "NVIDIA");
        System.out.println(computer);

        computer.setHDD(1000);
        computer.setRAM_size(16);
        computer.setProcessor_make("AMD");
        computer.setProcessor_type("Ryzen 5");
        computer.setMonitorSize(17.3f);
        computer.setMonitorType("LCD");
        computer.setOsConfig("Linux");
        computer.setDeviceDriver("Intel");

        System.out.println(computer);
    }    
}
