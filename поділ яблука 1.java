package PracticalWork1;

import java.util.Scanner;

public class SplittingApples1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількусть яблук: ");
        int a = in.nextInt();
        if (a > 0) {
            System.out.print("Введіть кількусть школярів: ");
            int s = in.nextInt();
            if (s > 0) {
                int N = a/s;
                if (N == 1) {
                    System.out.println("Кожен школяр отримає по одному яблоку.");
                } else if (N > 1 && N < 5) {
                    System.out.print("Кожен школяр отримає " + N + " яблука.");
                } else {
                    System.out.print("Кожен школяр отримає " + N + " яблук.");
                }
            } else {
                System.out.println("Ви ввели невірні данні!");
            }
        } else {
            System.out.println("Ви ввели невірні данні!");
        }
    }
}
