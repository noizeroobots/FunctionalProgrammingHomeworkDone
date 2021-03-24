package ru.tinkoff.fintech.homework;

import java.beans.Expression;
import java.util.Scanner;
import java.util.Random;

public class Test {

    private int size = 10; // Первый параметр - размер массива, который мы задаём сами
    private int input = scanner();

    private WorkingWithLambda workingWithLambda = new WorkingWithLambda();

    public final int scanner() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String expression = in.nextLine();
        return Integer.parseInt(expression); // Второй параметр - число, введённое пользователем
    }


    public final void randomize(final int a, final int b, final Process p) { // принимает на вход экземпляр класса, реализующий ФИ Randomizer (когда несколько параметров)
        p.run(size, input);
    }

    public Test() {

//        int[][] arr = getFilledArray(size, input, Process p); //Working with 2 param
        int[][] arr = getFilledArray(size, input);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //    public static int[][] getFilledArray(final int size, final int input) { // Working with 2 param
    public static int[][] getFilledArray(final int size, final int input) {

        int[][] fight = new int[2][size];
        for (int i = 0; i < size; i++) {
            fight[0][i] = input + i;
        }
        for (int j = 0; j < size; j++) {
            fight[1][j] = input * j;
        }
//        for (int i = 0; i < size; i++) {
//            fight[2][i] = блаблабла;
//        }

        return fight;
    }


}