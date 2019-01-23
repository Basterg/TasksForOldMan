package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>(list);
        for (int i = 0; i < 3; i++) {
            char[] chars = copy.get(i).toCharArray();
            int countL = 0;
            int countR = 0;
            for (int j = 0; j < chars.length; j++) {
                String a = Character.toString(chars[j]);
                if (a.equals("л")) {
                    countL++;
                }
                if (a.equals("р")) {
                    countR++;
                }
                if (j == chars.length - 1) {
                    if (countR > 0 && countL == 0) {
                        list.remove(i);
                    } else if (countR == 0 && countL > 0) {
                        list.add(i, copy.get(i));
                    }
                }
            }
        }
        return list;
    }
}