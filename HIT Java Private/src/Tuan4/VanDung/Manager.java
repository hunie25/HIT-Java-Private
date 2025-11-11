package Tuan4.VanDung;

public class Manager extends Employee {
    private SaleStaff[] saleStaffs;
    private Technician[] technicians;

    public Manager(SaleStaff[] saleStaffs, Technician[] technicians) {
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public Manager(int iD, String name, String country, double salary, SaleStaff[] saleStaffs, Technician[] technicians) {
        super(iD, name, country, salary);
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public SaleStaff getSaleStaffById(int saleStaffId) {
        for (SaleStaff s : saleStaffs) {
            if (s.getiD() == saleStaffId)
                return s;
        }
        return null;
    }

    public Technician getTechnicianById(int technicianId) {
        for (Technician t : technicians) {
            if (t.getiD() == technicianId)
                return t;
        }
        return null;
    }
}
