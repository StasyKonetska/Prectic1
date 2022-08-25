package PracticalWork1;

import java.util.Scanner;

public class SpittingApples2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількусть яблук: ");
        int a = in.nextInt();
        if (a > 0) {
            System.out.print("Введіть кількусть школярів: ");
            int s = in.nextInt();
            if (s > 0) {
                int K = a % s;
                if (K == 1) {
                    System.out.println("У кошику залишиться одне яблуко.");
                } else if (K > 1 && K < 5) {
                    System.out.print("У кошику залишиться " + K + " яблука.");
                } else {
                    System.out.print("У кошику залишиться " + K + " яблук.");
                }
            } else {
                System.out.println("Ви ввели невірні данні!");
            }
        } else {
            System.out.println("Ви ввели невірні данні!");
        }
    }
}