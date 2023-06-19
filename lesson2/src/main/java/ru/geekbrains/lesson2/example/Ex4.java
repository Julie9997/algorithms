package ru.geekbrains.lesson2.example;

import java.util.Scanner;

import static ru.geekbrains.lesson2.example.Ex1.prepareArray;
import static ru.geekbrains.lesson2.example.Ex1.printArray;
import static ru.geekbrains.lesson2.example.Ex2.quickSort;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = prepareArray(n);
        printArray(array);
        quickSort(array, 0, array.length-1);
        printArray(array);
        
        int value = scanner.nextInt();
        System.out.println(binarySearch(array, value, 0, array.length));
    }

    /**
     * @apiNote бинарный поиск
     * @param array
     * @param value искомое значение
     * @param left левая границв
     * @param right правая граница
     * @return индес элемента
     */
    private static int binarySearch(int[] array, int value, int left, int right) {
        int mid;
        if (right < left)
            return -1;
        else
            mid = (right - left) / 2 + left;

        if (value > array[mid])
            return binarySearch(array, value, mid+1, right); // обрубили половину
        else if (value < array[mid])
            return binarySearch(array, value, left, mid-1);
        else
            return mid;
    }
}
