package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("арбуз");
        hashSet.add("банан");
        hashSet.add("вишня");
        hashSet.add("груша");
        hashSet.add("дыня");
        hashSet.add("ежевика");
        hashSet.add("женьшень");
        hashSet.add("земляника");
        hashSet.add("ирис");
        hashSet.add("картофель");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
