package Tuan2.BTVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tinh tong cac phan tu trong mang ");
            System.out.println("2. In ra phan tu lon nhat, nho nhat trong mang");
            System.out.println("3. Sap xep lai mang theo chieu tang dan");
            System.out.println("4. In ra so nguyen to lon nhat trong mang");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tong cac phan tu: " + Utils.tinhTong(arr));
                    break;
                case 2:
                    System.out.println("Phan tu lon nhat: " + Utils.timMax(arr));
                    System.out.println("Phan tu nho nhat: " + Utils.timMin(arr));
                    break;
                case 3:
                    Utils.sapXep(arr);
                    System.out.println("Mang sau khi sap xep: ");
                    for (int x : arr) System.out.print(x + " ");
                    System.out.println();
                    break;
                case 4:
                    int maxPrime = Utils.maxSNT(arr);
                    if (maxPrime == -1)
                        System.out.println("Khong co so nguyen to trong mang.");
                    else
                        System.out.println("So nguyen to lon nhat: " + maxPrime);
                    break;
                default:
                    System.out.println("Lua chọn khong hop le, chon lai");
            }
        } while (choice != 0);

        sc.close();
    }
}

