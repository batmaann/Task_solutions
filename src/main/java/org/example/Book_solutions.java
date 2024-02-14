package org.example;

import java.util.Random;
import java.util.ArrayList;
import java.util.*;


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

    Его работа можно описать как поиск льва в пустыне
    берем пустыню делим на пополам
    если в одной половине нет льва, значит лев в другой половине
    делим область, где есть лев ещё, а половину и.т.д
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




    /*
    Сортировка выбором
    Это глава № 2
    параграф Сортировка выбором
    есть 3 метода
    1 findSmallest
    Здесь берется список и из списка ищется наименьший элемент путем перебора

    2 selectionSort
    Здесь
    3 name1

    */




    public static  List<Integer> name1(){
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.add(10);
        findSmallest(arr);
        selectionSort(arr);
        return arr;
    }


    public static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;// «Для хранения наименьшего значения»

        for (int i = 1; i < arr.size(); i++) {// «Для хранения индекса наименьшего значения»
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        System.out.println("Список: " + arr + ", а это самый маленьнкий элемент: " + arr.get(smallestIndex));


        return smallestIndex;

    }

    public static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        int size = arr.size();// записали размер списка
        for (int i = 0; i < size; i++) {
            int smallestIndex = findSmallest(arr);// в smallestIndex записываем значение из метода findSmallest
            newArr.add(arr.remove(smallestIndex));
            System.out.println(newArr);
        }
        System.out.println(arr);
        return newArr;




    }



}
































