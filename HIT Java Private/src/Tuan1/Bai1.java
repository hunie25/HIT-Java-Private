package Tuan1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so thu nhat: ");
        int theFirstNumber = sc.nextInt();
        System.out.println("NHap so thu hai: ");
        int theSecondNumber = sc.nextInt();

        System.out.println("Tong cua hai so la: " + (theFirstNumber + theSecondNumber));
        System.out.println("Hieu cua hai so la: " + (theFirstNumber - theSecondNumber));
        System.out.println("Tich cua hai so la: "+ (theFirstNumber * theSecondNumber));
        System.out.println("Thuong cua hai so la: "+ (theFirstNumber / theSecondNumber));
        System.out.println("Phan du cua hai so la: "+ (theFirstNumber % theSecondNumber));
    }
}
