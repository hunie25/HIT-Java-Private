package Tuan2.BTVN;

public class Utils {
    public static int tinhTong(int[] arr) {
        int tong = 0;
        for (int x : arr){
            tong += x;
        }
        return tong;
    }

    public static int timMax(int[] arr){
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int timMin(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min){
                min = x;
            }
        }
        return min;
    }

    public static void sapXep(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static boolean soNT(int n) {
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0){
                return false;
            }
        return true;
    }

    public static int maxSNT(int[] arr) {
        int maxPrime = -1;
        for (int x : arr) {
            if (soNT(x) && x > maxPrime)
                maxPrime = x;
        }
        return maxPrime;
    }
}
