package org.gurikin;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "abcdefhjkl";
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 30000000; i++) {
            sb.append(s);
        }
        String reverseS = reverseStringSB(sb.toString());
        String reverseSwap = reverseStringSwap(sb.toString());
        System.gc();
    }

    public static String reverseStringSB(String s) {
        StringBuffer sb = new StringBuffer();
        long time = System.currentTimeMillis();
        time = time - time/1000;
        System.out.println("String buffer reverse start at: " + time);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        time = System.currentTimeMillis();
        time = time - time/1000;
        System.out.println("String buffer reverse end at: " + time);
        return sb.toString();
    }

    public static String reverseStringSwap(String s) {
        char temp;
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();

        long time = System.currentTimeMillis() - System.currentTimeMillis()/1000;
        System.out.println("String swap reverse start at: " + time);
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        StringBuffer sb = new StringBuffer();
        sb.append(sb);
        time = System.currentTimeMillis() - System.currentTimeMillis()/1000;
        System.out.println("String swap reverse end at: " + time);
        return sb.toString();
    }
}
