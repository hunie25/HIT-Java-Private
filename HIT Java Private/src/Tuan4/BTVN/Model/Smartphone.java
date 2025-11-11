package Tuan4.BTVN.Model;

public class Smartphone extends Product {
    private boolean has5G;

    public Smartphone(String name, String description, double price, boolean has5G) {
        super(name, description, price);
        this.has5G = has5G;
    }

    public Smartphone(int iD, String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getInfo() {
        return "SmartPhone -> " + super.getInfo() +
                String.format(" | 5G: %s", has5G ? "Yes" : "No");
    }
}
