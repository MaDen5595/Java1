package Practice_1;

import java.util.Scanner;

public class Code {
    public static int fuc(int a) {
        int ret = 1;
        for (int i = 1; i < a + 1; i++) {
            ret = ret * i;
        }
        return ret;

    }

    public static void main(String[] args) {


//3
        int[] chisla = new int[6];
        chisla[0] = 8;
        chisla[1] = 4;
        chisla[2] = 14;
        chisla[3] = 13;
        chisla[4] = 2;
        chisla[5] = 5;
        int sum_mas = 0;
        for (int i = 0; i < 6; i++) {
            sum_mas = sum_mas + chisla[i];
        }
        float sr = sum_mas / 6f;
        System.out.println("Сумма массива: " + sum_mas);
        System.out.println("Среднее арифметическое: " + sr);


//4
        System.out.print("Введите количество чисел массива (Целое число!): ");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.print("Ты пьяный или кто? ВВЕДИТЕ ЦЕЛОЕ ЧИСЛО: ");
            sc.nextLine();
        }
        int sum_mas2 = 0;
        int el = 0;
        int big = 0;
        int lil = 999999999;
        int sus = sc.nextInt();
        for (int i = 0; i < sus; i++) {
            String ogo = String.format("Введите %d элемент массива (целое число): ", i + 1);
            System.out.print(ogo);
            while (!sc.hasNextInt()) {
                System.out.print("Введите заново: ");
                sc.nextLine();
            }
            el = sc.nextInt();
            sum_mas2 = sum_mas2 + el;
            if (el > big) {
                big = el;
            }
            if (el < lil) {
                lil = el;
            }
        }
        System.out.println("Сумма массива: " + sum_mas2);
        System.out.println("Макс: " + big);
        System.out.println("Мин: " + lil);


//6
        for (int i = 1; i < 11; i++) {
            double o = 1. / i;
            String otv = String.format("%d элемент гармонического ряда: %.2f", i, o);
            System.out.println(otv);
        }


//7
        System.out.print("Введите число, для которого вычислить факториал (целое число): ");
        while (!sc.hasNextInt()) {
            System.out.print("Да как ты надоел. НУ ВВЕДИ ЦЕЛОЕ ЧИСЛО: ");
            sc.nextLine();
        }
        int b = sc.nextInt();
        System.out.println(fuc(b));
        sc.close();
    }
}
