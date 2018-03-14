package com.fatal;
/*
 * @Author - Andreychenko Artem
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MethodsForTestTasks someEntity = new MethodsForTestTasks();
        int tasksNumber;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\nSelect Task 1-4:" +
                    "\n1. Вывести на консоль буквы английского алфавита от 'A' до 'Z'." +
                    "\n2. Получить сумму чётных элементов челочисленного массива." +
                    "\n3. Написать функцию, которая принимает номер дня недели, а возвращает строку с названием дня недели." +
                    "\n4. Отсортировать целочисленный массив." +
                    "\n0. Выйти из программы.");
            System.out.print("Enter number: ");
            tasksNumber = scan.nextInt();
            switch (tasksNumber) {
                case 1:
                    someEntity.EnglishAlphabet();
                    break;
                case 2:
                    someEntity.SumEvenNumber();
                    break;
                case 3:
                    System.out.print("Enter day number: ");
                    int dayNumber = scan.nextInt();
                    someEntity.WhatIsTheWeekDay(dayNumber);
                    break;
                case 4:
                    someEntity.ArraysSort();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Enter correct number!!!");
            }
        }while (tasksNumber!=0);
    }
}
