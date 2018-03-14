package com.fatal;

import java.util.Arrays;
import java.util.Random;

public class MethodsForTestTasks {

    //вывести на консоль буквы английского алфавита от 'A' до 'Z'
    public void EnglishAlphabet() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    //получить сумму чётных элементов челочисленного массива
    public void SumEvenNumber() {
        Random rand = new Random();
        int sum = 0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Our random massive: " + Arrays.toString(arr));
        System.out.println("Sum of even numbers: " + sum);
    }

    //написать функцию, которая принимает номер дня недели, а возвращает строку с названием дня недели.
    public void WhatIsTheWeekDay(int dayNum) {
        String dayName;
        switch (dayNum) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Wrong number";
                break;
        }
        System.out.println(dayName);
    }


    //отсортировать целочисленный массив.
    public void ArraysSort() {
        int temp;
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println("Random massive" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted massive: "+ Arrays.toString(arr));
    }
}
