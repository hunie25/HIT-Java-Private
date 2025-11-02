package Tuan3.BTVN;

import Tuan3.BTVN.Model.User;
import Tuan3.BTVN.Service.AuthService;
import Tuan3.BTVN.Service.UserService;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("U001", "admin", "Admin@123", "admin@gmail.com", "0987654321"));
        userList.add(new User("U002", "khanh", "Khanh@123", "khanh@gmail.com", "0911222333"));
        userList.add(new User("U003", "huyen", "Huyen@123", "huyen@gmail.com", "0933444555"));
        userList.add(new User("U004", "minh", "Minh@123", "minh@gmail.com", "0944555666"));
        userList.add(new User("U005", "lam", "Lam@123", "lam@gmail.com", "0955666777"));

        AuthService authService = new AuthService(userList);
        UserService userService = new UserService(userList);

        while (true) {
            System.out.println("\n--- Menu Auth ---");
            System.out.println("1. Login (Dang nhap)");
            System.out.println("2. Register (Dang ky)");
            System.out.println("3. Exit (Thoat)");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhap ten nguoi dung: ");
                    String username = sc.nextLine();
                    System.out.print("Nhập mat khau: ");
                    String password = sc.nextLine();

                    if (authService.login(username, password)) {
                        while (true) {
                            System.out.println("\n--- Menu User ---");
                            System.out.println("1. Get user by id (Tim kiem nguoi dung bang ID)");
                            System.out.println("2. Get all user (Danh sach nguoi dung)");
                            System.out.println("3. Change password (Thay doi mat khau)");
                            System.out.println("4. Logout (Dang xuat)");
                            System.out.print("Chon chuc nang: ");
                            int userChoice = sc.nextInt();
                            sc.nextLine();

                            switch (userChoice) {
                                case 1 -> {
                                    System.out.print("Nhap ID muon tim: ");
                                    String id = sc.nextLine();
                                    userService.getUserById(id);
                                }
                                case 2 -> userService.getAllUsers();
                                case 3 -> {
                                    System.out.print("Nhap ID nguoi dung can doi mat khau: ");
                                    String id = sc.nextLine();
                                    System.out.print("Nhap mat khau cu: ");
                                    String oldPass = sc.nextLine();
                                    System.out.print("Nhap mat khau moi: ");
                                    String newPass = sc.nextLine();
                                    System.out.print("Xac nhan mat khau moi: ");
                                    String confirm = sc.nextLine();

                                    authService.changePassword(id, oldPass, newPass, confirm);
                                }
                                case 4 -> {
                                    System.out.println("Da dang xuat!");
                                    break;
                                }
                                default -> System.out.println("Lua chon khong hop le!");
                            }
                            if (userChoice == 4) break;
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Nhap ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap ten nguoi dung: ");
                    String username = sc.nextLine();
                    System.out.print("Nhap mat khau: ");
                    String password = sc.nextLine();
                    System.out.print("Nhap email: ");
                    String email = sc.nextLine();
                    System.out.print("Nhap so đien thoai: ");
                    String phone = sc.nextLine();

                    authService.register(id, username, password, email, phone);
                }
                case 3 -> {
                    System.out.println("Thoat!");
                    System.exit(0);
                }
                default -> System.out.println("Lua chon khong hop le!");
            }
        }
    }
}


