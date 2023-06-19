package ru.geekbrains.lesson2.homework;

import java.util.Scanner;

import static ru.geekbrains.lesson2.example.Ex1.prepareArray;
import static ru.geekbrains.lesson2.example.Ex1.printArray;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = prepareArray(n);
        printArray(array);
        heapSort(array);
        printArray(array);
    }

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);
        for (int i= arr.length-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; //  корень
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}

