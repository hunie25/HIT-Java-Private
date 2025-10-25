package Tuan2;

public class Main {

    public static void inNguoc() {
        for (int i = Mang.str.length - 1; i >= 0; i--){
            System.out.println(Mang.str[i]);
        }
    }
    public static void main(String[] args) {
        Mang.inPT();
        inNguoc();
    }
}
