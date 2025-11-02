package Tuan3.TrenLop;

import Tuan3.TrenLop.constant.Constant;

import java.util.UUID;

public class User {
        private String id;
        private String name;
        private Double balance;

        public User() {
        }

        public User(String name, Double balance) {
            this.id = UUID.randomUUID().toString();
            this.name = name;
            this.balance = balance;
        }

        public void deposit(Double amount) {
            if (amount < 0) {
                System.out.println(Constant.ErrorMessage.INVALID_AMOUNT);
                return;
            }

            if (Constant.Account.isAccountLocked){
                System.out.println(Constant.ErrorMessage.ACCOUNT_LOCKED);
                return;
            }

            if (amount > Constant.Account.isAccountDepositLimit) {
                System.out.println(Constant.ErrorMessage.OVER_LIMIT_AMOUNT);
                return;
            }

            this.balance += amount;

            System.out.println(Constant.SuccessMessage.DEPOSIT_SUCCESS + ": " + amount);
        }

        public void withdraw(Double amount) {
            if (amount < 0 || amount > balance) {
                System.out.println(Constant.ErrorMessage.INVALID_AMOUNT);
                return;
            }

            if (Constant.Account.isAccountLocked){
                System.out.println(Constant.ErrorMessage.ACCOUNT_LOCKED);
                return;
            }

            if (amount < Constant.Account.isAccountDrawLimit) {
                System.out.println(Constant.ErrorMessage.OVER_LIMIT_AMOUNT);
                return;
            }

            this.balance -= amount;
            System.out.println(Constant.SuccessMessage.DRAW_SUCCESS + ": " + amount);
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getBalance() {
            return balance;
        }

        public void setBalance(Double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }

    public void deposite(Double amount) {
    }
}
