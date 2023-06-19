package ru.geekbrains.lesson2.example;

import java.util.Arrays;
import java.util.Date;

import static ru.geekbrains.lesson2.example.Ex1.prepareArray;

public class Ex3 {
    public static void main(String[] args) {
        for (int i = 10_000; i < 100_000; i+=10_000) {
            int[] arr = prepareArray(i);
            Date startDate = new Date();
            Ex1.bubblesort(Arrays.copyOf(arr, arr.length));
            Date endDate = new Date();
            long diff = endDate.getTime() - startDate.getTime();
            System.out.println(diff);

            Date start2 = new Date();
            Ex2.quickSort(Arrays.copyOf(arr, arr.length), 0, arr.length - 1);
            Date end2 = new Date();
            long diff2 = end2.getTime() - start2.getTime();
            System.out.println(diff2);
        }
    }
}
