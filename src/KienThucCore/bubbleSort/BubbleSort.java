package KienThucCore.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,7,9,3,3,6,46,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}