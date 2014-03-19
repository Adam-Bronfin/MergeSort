package com.company;

public class Main {

    public static void main(String[] args) {
        int[] random = new int[]{5, 2, 4, 10, 13, 3, 41, 1, 3, 2, 9};

        MergeSort mergeSort = new MergeSort(random);
        int[] sorted = mergeSort.sortNumbers();

        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}
