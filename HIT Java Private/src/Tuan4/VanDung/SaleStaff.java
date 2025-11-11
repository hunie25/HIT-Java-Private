package Tuan4.VanDung;

public class SaleStaff extends Employee {
    private int numberOfSale;


    public SaleStaff(int iD, String name, String country, double salary, int numberOfSale) {
        super(iD, name, country, salary);
        this.numberOfSale = numberOfSale;
    }

    public SaleStaff(int numberOfSale) {
        this.numberOfSale = numberOfSale;
    }

    @Override
    public void work() {
        System.out.println(" dang ban hang");
    }
    public SaleStaff() {
    }

    public int getNumberOfSale() {
        return numberOfSale;
    }

    public void setNumberOfSale(int numberOfSale) {
        this.numberOfSale = numberOfSale;
    }
}
