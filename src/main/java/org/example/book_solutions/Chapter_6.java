package org.example.book_solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Chapter_6 {
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
