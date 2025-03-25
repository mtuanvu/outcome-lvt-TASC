package KienThucCore;

//viết code tạo 2 mảng số nguyên, lọc ra các phần tử giống nhau ở 2 mảng này và đưa vào mảng mới

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaiTapJavaInterview {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9};

        List<Integer> intersection = new ArrayList<Integer>();
        for(int num1 : arr1) {
            for(int num2 : arr2) {
                if(num1 == num2 && !intersection.contains(num1)) {
                    intersection.add(num1);
                    break;
                }
            }
        }
        int[] result = intersection.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Phần tử chung: " + Arrays.toString(result));
    }
}
