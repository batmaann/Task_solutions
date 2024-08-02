package org.example.book_solutions;

import java.util.HashMap;

public class Chapter_5 {
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
}