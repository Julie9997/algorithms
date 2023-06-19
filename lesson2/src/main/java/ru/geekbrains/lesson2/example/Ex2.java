package ru.geekbrains.lesson2.example;

import java.util.Scanner;

import static ru.geekbrains.lesson2.example.Ex1.prepareArray;
import static ru.geekbrains.lesson2.example.Ex1.printArray;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = prepareArray(n);
        printArray(array);

        quickSort(array, 0, array.length-1);
        printArray(array);
    }

    /**
     * @apiNote быстрая сортировка
     * @param array
     * @param startPosition позиция старта
     * @param endPosition позиция конца
     */
    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int left = startPosition;
        int right = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];

        do {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                if (left != right) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
                left++;
                right--;
            }
        } while (left <= right);
        if (left < endPosition) {
            quickSort(array, left, endPosition);
        }
        if (startPosition < right) {
            quickSort(array, startPosition, right);
        }
    }
}
