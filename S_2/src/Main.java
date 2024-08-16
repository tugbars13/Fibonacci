import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("FİBONACCİ SERİSİ");
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int a = 0;
        int b = 1;

        if (number >= 1) System.out.print(a + " ");
        if (number >= 2) System.out.print(b + " ");


        for (int i = 2; i < number; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
