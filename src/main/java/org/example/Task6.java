package org.example;

public class Task6 {
    /*
    dddeeeklln -> 3d3e1k2l1n
    одну строку перевести в формат
     */


    public static String Decision1(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(count).append(currentChar);
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        compressed.append(count).append(currentChar);
        System.out.println("была " + str + " стала " + compressed.toString());
        return compressed.toString();
    }
}



