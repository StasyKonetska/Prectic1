package PracticalWork1;

import java.util.Scanner;

public class NextAndPrevious {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int x = in.nextInt();
        if (x > -10001 && x < 10001) {
            System.out.println("The next number for the number " + x + "  is " + ++x);
            x = x-1;
            System.out.println("The previous number for the number " + x + "  is " + --x);
        } else {
            System.out.println("Ви ввели невірні данні!");
        }
    }
}
