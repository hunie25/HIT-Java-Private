package Tuan4.BTVN.Model;

public class Laptop extends Product{
    private String ram;
    private String cpu;

    public Laptop(String name, String description, double price, String ram, String cpu) {
        super(name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop(String name, String description, double price) {
        super(name, description, price);
    }


    @Override
    public String getInfo() {
        return "Laptop -> " + super.getInfo() +
                String.format(" | RAM: %s | CPU: %s", ram, cpu);
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
