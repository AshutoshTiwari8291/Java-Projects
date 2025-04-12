package NeetCode;

import java.util.Arrays;

public class BitonicPoint {
    public static void main(String[] args) {
        int arr[] =  {8, 10, 100, 200, 400, 500, 3, 2, 1};
        int arr1[] = {10, 20, 30, 40, 30, 20};
        int arr2[] = {60, 70, 120, 100, 80};

        System.out.println(Arrays.toString(arr));
        System.out.println(bitonicPoint(arr));
        System.out.println(bitonicPoint(arr1));
        System.out.println(bitonicPoint(arr2));
    }

    public  static int bitonicPoint(int[] arr) {
        int s = 0;
        int e = arr.length;
        while (s < e) {
            int mid = (s+e)/2;
            if (arr[s] < arr[mid]) {
                s = mid;
            } else {
                e = mid;
            }
        }
        return Math.max(arr[s],arr[e]);
    }
}
