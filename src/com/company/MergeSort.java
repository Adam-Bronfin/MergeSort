package com.company;

class MergeSort {
    private int[] numbers;
    private int[] copy;

    public MergeSort(int[] array){
        numbers = array;
        copy = new int[array.length];
    }
    public int[] getNumbers(){
        return this.numbers;
    }
    public int[] sortNumbers() {
        mergeSort(0, this.numbers.length - 1);

        return this.numbers;
    }
    private void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;

            mergeSort(low, middle);

            mergeSort(middle + 1, high);

            merge(low, middle, high);
        }
    }
    private void merge(int low, int mid, int high) {
        for (int i = 0; i < numbers.length; i++ ) {
            copy[i] = numbers[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (copy[i] <= copy[j]) {
                numbers[k] = copy[i];
                i++;
            } else {
                numbers[k] = copy[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            numbers[k] = copy[i];
            k++;
            i++;
        }
    }
}