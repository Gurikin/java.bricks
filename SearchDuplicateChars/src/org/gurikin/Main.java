package org.gurikin;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(findDuplicate("abcdefa"));
    }

    public static int findDuplicate(String str)
    {
        char[] source = str.toCharArray();
        HashSet<Character> charsToSearch = new HashSet<>();
        int count;
        count = 0;
        for (char currentChar: source) {
            if (charsToSearch.contains(currentChar)) {
                return count;
            }
            charsToSearch.add(currentChar);
            count++;
        }
        return -1;
    }
}
