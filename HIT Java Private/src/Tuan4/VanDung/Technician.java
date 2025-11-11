package Tuan4.VanDung;

public class Technician extends Employee {
    private String techSkill;

    public Technician(int iD, String name, String country, double salary, String techSkill) {
        super(iD, name, country, salary);
        this.techSkill = techSkill;
    }

    public Technician(String techSkill) {
        this.techSkill = techSkill;
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }

    @Override
    public void work() {
        System.out.println(" dang sua chua.");
    }
}
