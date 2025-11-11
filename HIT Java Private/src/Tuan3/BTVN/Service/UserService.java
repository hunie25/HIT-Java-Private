package Tuan3.BTVN.Service;
import Tuan3.BTVN.Model.User;

import java.util.ArrayList;

public class UserService {

    private ArrayList<User> users;

        public UserService() {
            this.users = users;
        }

    public void getUserById(String id) {
        for (User u : users) {
            if (u.getiD().equals(id)) {
                System.out.println(u);
                return;
            }
        }
        System.out.println("Khong tim thay nguoi dung co ID: " + id);
    }

    public void getAllUsers() {
        System.out.println("Danh sach nguoi dung:");
        for (User u : users) {
            System.out.println(u);
        }
    }
}

