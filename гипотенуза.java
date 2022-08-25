package PracticalWork1;
import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть довжину першого катета: ");
        int a = in.nextInt();
        if (a > 0 && a < 1000) {
            System.out.print("Введіть довжину другого катета: ");
            int b = in.nextInt();
            if (b > 0 && b < 1000) {
                double c = Math.sqrt(a * a + b * b);
                System.out.println("Гіпотенуза дорівнює: " + c);
            } else {
                System.out.println("Ви ввели невірні данні!");
            }
        }else {
            System.out.println("Ви ввели невірні данні!");
        }

    }
}