package org.gurikin;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int bound = 20;
        int[] sourceNums = new int[rand.nextInt(bound)];
        for (int i=0; i<sourceNums.length; i++) {
            sourceNums[i] = rand.nextInt(bound);
        }
        int targetNum = rand.nextInt(bound);
        System.out.println(twoSum(sourceNums,targetNum));
    }

    public static boolean twoSum(int[] sourceNums, int targetNum) {
        Set<Integer> sourceSet = new HashSet<>(sourceNums.length);
        int cnt = 0;
        int subtrahend;
        for (int sourceNum:
             sourceNums) {
            subtrahend = targetNum - sourceNum;
            System.out.println(cnt++);
            if (sourceSet.contains(subtrahend)) {
                System.out.println("Сумма: " + targetNum + "\tВычитаемое: " + subtrahend);
                System.out.println("Длина массива: " + sourceNums.length);
                return true;
            }
            sourceSet.add(subtrahend);
        }
        System.out.println("Сумма: " + targetNum);
        System.out.println("Длина массива: " + sourceNums.length);
        return false;
    }
}
