package org.example;

import java.util.ArrayList;

public class Task1 {
    // Задание №1 найти средний элемент в LinkedList за один проход?
    public static void decision(){
        //создам элемент листа LinkedList так как я не знаю что должно быть в списке будет строки
        ArrayList<String> linkedList = new ArrayList<>();
        linkedList.add("Один");
        linkedList.add("Два");
        linkedList.add("Три");
        float countElements = linkedList.size();
        if (countElements % 2 == 0) {
            countElements = (countElements / 2) - 1;
        }
        else{
            countElements = (countElements / 2) - 0.5f;
        }
        System.out.println(linkedList.get((int) countElements));
        System.out.println(linkedList.size());


    }



}
