package ru.tinkoff.fintech.homework;

public class WorkingWithLambda {

        public static void randomize(final int size, final int input, final Process p) { // принимает на вход экземпляр класса, реализующий ФИ Process (когда несколько параметров)
        p.run(size, input);
    }

}
