package KienThucCore.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 28, 39, 845, 5473};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}