package Tuan4.VanDung;

public class Employee {

    private int iD;
    private String name;
    private String country;
    private double salary;

    public Employee(int iD, String name, String country, double salary) {
        this.iD = iD;
        this.name = name;
        this.country = country;
        this.salary = salary;
    }

    public Employee() {
    }

    public void work() {
        System.out.println(" dang lam viec");
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }
}
