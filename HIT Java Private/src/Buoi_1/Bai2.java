package Buoi_1;

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
}
