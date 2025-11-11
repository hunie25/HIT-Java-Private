package Tuan4.BTVN.Constants;

public class Constants {
    public static class Enter {
        public static final String ENTER_ID = "Nhap ID: ";
        public static final String ENTER_NAME = "Nhap ten: ";
        public static final String ENTER_DESCRIPTION = "Nhap mo ta: ";
        public static final String ENTER_PRICE = "Nhap gia tien: ";
        public static final String ENTER_TYPE = "Nhap the loai (laptop/smartphone): ";
        public static final String ENTER_CPU = "Nhap CPU: ";
        public static final String ENTER_RAM = "Nhap RAM: ";
        public static final String ENTER_HAS5G = "Co 5G (y/n): ";
    }

    public static class Error {
        public static final String ERR_EMPTY_LIST = "Danh sach trong!";
        public static final String ERR_WRONG_TYPE = "Nhap sai the loai, vui long nhap lai!";
        public static final String ERR_DATA_NOT_FOUND = "Du lieu khong ton tai!";
    }

    public static class Success {
        public static final String SUCCESS_REMOVE = "Xoa san pham thanh cong!";
        public static final String SUCCESS_ADD = "Them san pham thanh cong!";
        public static final String SUCCESS_FOUND = "Đa tim thay du lieu!";
    }

    public static class Display {
        public static final String DISPLAY_LIST = "Danh sach san pham:";
    }

    public static void showMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Them san pham moi");
        System.out.println("2. Xoa san pham");
        System.out.println("3. In thong tin san pham theo ID");
        System.out.println("4. Hien thi tat ca san pham");
        System.out.println("5. Thoat");
        System.out.print("Nhap lua chon: ");
    }
}
