package Tuan3.TrenLop.service;


import Tuan3.TrenLop.constant.Constant;
import Tuan3.TrenLop.User;

public class BankService {

        public void transfer(User from, User to, Double amount) {
            if (Constant.Bank.isBankMaintain){
                System.out.println(Constant.ErrorMessage.BANK_MAINTAIN);
                return;
            }

            from.withdraw(amount);
            to.deposite(amount);

            System.out.println(Constant.SuccessMessage.TRANSFER_SUCCESS);
        }
    }
