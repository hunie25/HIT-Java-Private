package Tuan3.TrenLop;

import Tuan3.TrenLop.service.BankService;

public class Main {
    public static void main(String[] args) {
        User user_1 = new User("Khuong", 1000000000.0);
        User user_2 = new User("Vuong", 50000.0);
        User user_3 = new User("Hieu", 100000.0);

        BankService bankService = new BankService();

        bankService.transfer(user_1, user_2, 10.0);
    }
}
