package org.example.book_solutions;

import java.util.Arrays;

public class Chapter_4 {
    /*

    Это глава № IV
    параграф быстрой сортировки

    Принцип "разделяй и властвуй"
    Алгоритм Евклида

    */

    //метод суммы массива из элементов упрощенный вариант

    public static int sumMassive() {
        int[] arr = {2, 4, 6};
        int sum = 0; // Переменная sum должна быть объявлена перед циклом, чтобы сохранять сумму всех элементов массива
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            sum = sum + x;
        }
        System.out.println("Сумма элементов массива: " + sum); // Выводим результат
        return sum;
    }

    /*
    метод суммы массива из элементов через рекурсию
    step I определить базовый случай
    step II каждый рекурсивный вызов должен приближать вас к пустому массиву Сведение
    */
    int[] arr = {2};


    public static int sumMassiveRec(int[] arr) {

        // Базовый случай: если массив пуст, возвращаем 0.
        if (arr.length == 0) {
            return 0;
        } else {
            // Иначе, рекурсивно вызываем функцию для подмассива без первого элемента и добавляем первый элемент.
            int sum = arr[0] + sumMassiveRec(Arrays.copyOfRange(arr, 1, arr.length));
            System.out.println("Сумма элементов массива: " + sum);
            return sum;
        }
    }


    public static void name123(int[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(arr[i] + " * " + j + " = " + (arr[i] * j));
            }
        }
    }
}
