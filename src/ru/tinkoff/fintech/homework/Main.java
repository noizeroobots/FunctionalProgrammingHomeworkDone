package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(final String[] args) {
        int[] test = getFilledArray(10, 2,
                (index, md) -> index + md);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println();

        test = getFilledArray(10, 2,
                (index, md) -> index * md);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println();

        test = getFilledArray(10, 2,
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
    }

    public static int[] getFilledArray(final int size, final int md, final Process p) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = p.run(i, md);
        }

        return array;
    }
}
