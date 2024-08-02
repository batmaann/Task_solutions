package org.example.book_solutions;

import java.util.Random;
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;


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


    public static List<Integer> name1() {
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
            newArr.add(arr.remove(smallestIndex));// в новый список добовляю значение smallestIndex, но приэтом удаляю это значение из smallestIndex
            System.out.println(newArr);
        }
        System.out.println(arr);
        return newArr;

    }

    /*

    Это глава № 3
    параграф Рекурсия

    функция вызывает саму себя внутри своего тела.


    */

    // Рекурсивный метод для подсчета факториала числа

    public static int factorial1(int n) {
        // Базовый случай
        if (n == 0) {
            System.out.println("Результат: " + 1); // Выводим результат, если n равно 0
            return 1;
        } else {
            // Рекурсивный случай
            int result = n * factorial1(n - 1); // Вызываем рекурсивно функцию для n - 1 и сохраняем результат
            System.out.println("Результат: " + result); // Выводим результат
            return result; // Возвращаем результат
        }
    }


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


    /*

    Это глава № V
    хеш-таблицы
    суть в том что можно и не тратить время на поиск
    хэш таблицы позволяют реализовать всё быстро

    */


    public static void hashBook() {
        HashMap<String, Double> book = new HashMap<>();

        book.put("apple", 0.67);
        System.out.println("Яблоки стоят " + book.get("apple") + " доллара");

        book.put("milk", 1.49);
        System.out.println("Молоко стоит " + book.get("milk") + " доллара");
    }

    /*

Это глава № VI
Поиск в ширину

*/
    public static void graf() {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();

        addNode(graph, "you", new String[]{"alice", "bob", "claire"});
        addNode(graph, "Bob", new String[]{"tom", "jerry", "mark"});
        addNode(graph, "Cate", new String[]{"helen", "mike", "robert"});

        System.out.println("Соседи узла 'you': " + graph.get("you"));
        System.out.println("Соседи узла 'Bob': " + graph.get("Bob"));
        System.out.println("Соседи узла 'Cate': " + graph.get("Cate"));
    }

    public static void addNode(HashMap<String, ArrayList<String>> graph, String nodeName, String[] neighbors) {
        ArrayList<String> neighborList = new ArrayList<>();
        for (String neighbor : neighbors) {
            neighborList.add(neighbor);
        }
        graph.put(nodeName, neighborList);
    }

    public static String searchName(HashMap<String, ArrayList<String>> graph, String startNode) {
        Queue<String> queue = new LinkedList<>();
        ArrayList<String> searched = new ArrayList<>();

        queue.add(startNode);
        while (!queue.isEmpty()) {
            String person = queue.poll();
            if (!searched.contains(person)) {
                if (person.endsWith("Seller")) { // Проверяем, является ли этот человек продавцом манго
                    return person;
                } else {
                    queue.addAll(graph.getOrDefault(person, new ArrayList<>())); // Добавляем всех соседей этого человека в очередь
                    searched.add(person); // Помечаем этого человека как проверенного
                }
            }
        }
        return null; // Если продавца манго не найдено
    }
}
