package org.example;

import java.util.Random;


public class Book_solutions {
    /*
    Здесь я записываю задачи по книге Грокаем алгоритмы
    в книге все описанные примеры написаны на Python я все переписывал на Java в силу своего понимания
    чтобы лучше понять структуру и работу алгоритмов

     */








    /*
    Здесь описывается самый примитивный и тупой способ перебора поиска чисел от 1 до 100
    принцып такой загадывается число
     и программа начинает поиск с 1 и при каждом неправильном угадывании оно увеличивается на +1
    Это глава № 1
    параграф Бинарный поиск
    */

    public static void searchNumber() {
        Random random = new Random();
        // Генерируем рандомное число от 1 до 100
        int target = random.nextInt(100) + 1;
        int guess = 1; // Первая попытка

        // Перебираем числа от 1 до 100
        while (guess <= 100) {
            // Если угадали число, выводим сообщение и завершаем программу
            if (guess == target) {
                System.out.println("Ура! Я угадал число: " + guess);
                break;
            }
            // Увеличиваем попытку на следующее число
            System.out.println(guess);
            guess++;
        }
    }

    /*
    А тут уже описан конкретный бинарный поиск
    его скорость можно определить как log2(n)
    например если n = 8 то тогда ответ будет log2(8)= 3 потому что 2 в степени 3 =8

    его работа заключатся в том что
    */
    public static void binary_search() {
        Random random = new Random();
        int[] massiv = new int[100];// создали массив
        for (int i = 0; i < 100; i++) {
            massiv[i] = i + 1;
        }

        int target = random.nextInt(100) + 1;

        int low = 0;
        int high = massiv.length;
        System.out.println(high);//нашли его длину
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println(mid);// нашли середину массива
            int guess = mid;
            if (guess == target) {
                System.out.println("Ура! Я угадал число: " + guess);
                break;

            } else if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

    }




}
