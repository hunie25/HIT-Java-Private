package Tuan3.BTVN.Service;

import Tuan3.BTVN.Model.User;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class AuthService {
    private final ArrayList<User> users;

    public AuthService(ArrayList<User> users) {
        this.users = users;
    }

    public boolean login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                System.out.println("Dang nhap thanh cong!");
                return true;
            }
        }
        System.out.println("Dang nhap that bai! Sai ten dang nhap hoac mat khau!");
        return false;
    }

    private boolean isValidUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            System.out.println("TEn nguoi dung khong duoc de trong!");
            return false;
        }
        if (username.length() < 3) {
            System.out.println("Ten nguoi dung dai toi thieu 3 ki tu!");
            return false;
        }
        if (username.contains(" ")) {
            System.out.println("Ten nguoi dung khong de khoang trang!");
            return false;
        }
        return true;
    }

    private boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Mat khau dai toi thieu  8 ki tu!");
            return false;
        }
        String strongPasswordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$";

        if (!password.matches(strongPasswordRegex)) {
            System.out.println("Khong hop le! Mat khau phai co it nhat: 1 chu in hoa, 1 chu in thuong, 1 chu so, 1 kky tu dac biet");
            return false;
        }

        return true;
    }

    public void register(String id, String username, String password, String email, String phoneNumber) {
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                System.out.println("Ten dang nhap da ton tai!");
                return;
            }
        }

        if (!Pattern.matches(".+@.+\\..+", email)) {
            System.out.println("Dia chi email khong hop le!");
            return;
        }
        if (!Pattern.matches("\\d{10,11}", phoneNumber)) {
            System.out.println("So dien thoai khong hop le!");
            return;
        }

        users.add(new User(id, username, password, email, phoneNumber));
        System.out.println("Dang ki thanh cong!");
    }

    public void changePassword(String userId, String oldPassword, String newPassword, String confirmNewPassword) {
        for (User u : users) {
            if (u.getiD().equals(userId)) {
                if (!u.getPassword().equals(oldPassword)) {
                    System.out.println("Mat khau cu khong dung!");
                    return;
                }
                if (u.getPassword().equals(newPassword)) {
                    System.out.println("Mat khau moi trung voi mat khau cu!");
                    return;
                }
                if (!newPassword.equals(confirmNewPassword)) {
                    System.out.println("Mat khau xac nhan khong trung khop!");
                    return;
                }

                if (!isValidPassword(newPassword)) {
                    System.out.println("Khong hop le! Mat khau phai co it nhat: 1 chu in hoa, 1 chu in thuong, 1 chu so, 1 kky tu dac biet");
                    return;
                }
                u.setPassword(newPassword);
                System.out.println("Doi mat khau thanh cong!");
                return;
            }
        }

        System.out.println("Co loi, vui lòng thu lai!");
    }
}
