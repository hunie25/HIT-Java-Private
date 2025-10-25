package Tuan2;

public class BaiTap {
    public static int tinhTong(int[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
        return tong;
    }

    public static long tinhTich(int[] arr) {
        long tich = 1;
        for (int i = 0; i < arr.length; i++) {
            tich *= arr[i];
        }
        return tich;
    }

    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void inSoNguyenTo(int[] arr) {
        System.out.print("Cac so nguyen to trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            if (laSoNguyenTo(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println("Tong cac phan tu: " + tinhTong(a));
        System.out.println("Tich cac phan tu (tran bo nho): " + tinhTich(a));
        inSoNguyenTo(a);
    }
}


