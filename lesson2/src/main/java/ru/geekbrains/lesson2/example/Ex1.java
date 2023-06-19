package ru.geekbrains.lesson2.example;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = prepareArray(n);
        printArray(array);

        bubblesort(array);
        printArray(array);
    }

    /**
     * @apiNote сортировка пузырьком
     * @param array
     */
    public static void bubblesort(int[] array) {
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        } while (flag);
    }


    /**
     * @apiNote распечатываем массив в консоль
     * @param arr входной массив
     */
    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    /**
     * @apiNote формируем массив из рандомных чисел
     * @param length длинна массива
     * @return массив
     */
    public static int[] prepareArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
