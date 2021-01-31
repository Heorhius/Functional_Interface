package main.com.kaptsiug.project.controller;

import main.com.kaptsiug.project.util.Executor;

import java.util.Scanner;

public class Main {

    public static final String INPUT_TYPE_OF_EXECUTION = "Input type of execution[1-2]:";
    public static final String STRING_FOR_REVERSE = "Input string for reverse:";
    public static final String INTEGER_FOR_FIBONACCI_CALCULATING = "Input integer for Fibonacci calculating:";

    public static void main(String[] args) {
        System.out.println(INPUT_TYPE_OF_EXECUTION);
        Scanner scanner = new Scanner(System.in);
        int executionType = scanner.nextInt();

        switch (executionType) {
            case 1: {
                Executor<String> executor = (value) -> {
                    StringBuilder stringBuilder = new StringBuilder(value);
                    return stringBuilder.reverse().toString();
                };
                System.out.println(STRING_FOR_REVERSE);
                System.out.println(executor.execute(scanner.next()));
                break;
            }
            case 2: {
                Executor<Integer> executor = (value) -> {
                    int[] array = new int[value + 1];
                    array[0] = 0;
                    array[1] = 1;

                    for (int i = 2; i <= value; i++) {
                        array[i] = array[i - 1] + array[i - 2];
                    }
                    return array[value];
                };
                System.out.println(INTEGER_FOR_FIBONACCI_CALCULATING);
                System.out.println(executor.execute(scanner.nextInt()));
                break;
            }
            default: {
                System.err.println("Incorrect input");
            }
        }
    }

}
