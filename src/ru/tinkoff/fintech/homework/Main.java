package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("checkstyle:LocalFinalVariableName")
    public static void main(final String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String entered = in.nextLine();
        int input = Integer.parseInt(entered);
        final int size = 10;

        int[] test = getFilledArray(size, input,
                (index, md) -> index + md);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println();

        test = getFilledArray(size, input,
                (index, md) -> index * md);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println();

        test = getFilledArray(size, input,
                (index, md) -> {
                    if ((index % 2) == 0) {
                        return index / 2 + md;
                    } else {
                        return index * index - md;
                    }
                });
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println();

        // число = когда размер массива равно модификатор <произведение индекса и нуля>;
        // когда размер массива не равно модификатору <произведение индекса и единицы>.
        test = getFilledArray(size, input,
                (index, md) -> {
                    if (input == size) {
                        return index * 0;
                    } else {
                        return index * 1;
                    }
                });
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println();

        // разность индекса и модификатора.
        test = getFilledArray(size, input,
                (index, md) -> index - md);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }

    public static int[] getFilledArray(final int size, final int md, final Process p) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = p.run(i, md);
        }

        return array;
    }
}
