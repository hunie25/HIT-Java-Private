package Tuan1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap tong so giay: ");
        int seconds = sc.nextInt();
        int minutes = (seconds % 3600) / 60;
        int hours = seconds / 3600;
        int second = seconds % 60;

        System.out.println(hours + " gio " + minutes + " phut " + second + " giay " );

    }

    public static class baiTap {
        int[] mangSo = new int[100];

        public void tinhTong(){
            int sum = 0;
            for (int i = 0; i < mangSo.length; i++) {
                sum += (i+1);
            }
        }

        public void tinhTich() {
            int tich = 1;
            for (int i = 0; i < mangSo.length; i++) {
                tich *= (i+1);
            }
        }

        public void timSoNT() {
            for (int i = 2; i < mangSo.length; i++) {

            }
        }
    }
}
