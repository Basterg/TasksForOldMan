package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] firstArray = {1, 2, 3, 3, 5};
        list.add(firstArray);
        int[] secondArray = {2, 2};
        list.add(secondArray);
        int[] thirdArray = {1, 2, 3, 4};
        list.add(thirdArray);
        int[] fourthArray = {1, 2, 3, 3, 5, 3, 8};
        list.add(fourthArray);
        int[] fifthArray = {};
        list.add(fifthArray);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
