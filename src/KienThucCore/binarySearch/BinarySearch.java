package KienThucCore.binarySearch;

//chỉ áp dụng khi mảng đã được sắp xếp
//cách hoạt động
//lấy phần tử mid mảng
//nếu mid == target, retủn index
//nếu mid > target, lấy phần nửa đầu
//nếu mid < target, lấy phần nửa sau

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(search(arr, 60));
    }
}
