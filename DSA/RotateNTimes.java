import java.util.Arrays;

public class RotateNTimes {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7};
        int n=3;
        rotate(arr,n);
    }

    public static void rotate(int arr[], int n) {
        int len = arr.length;
        n =  n % len;
        reverse(arr, 0, len-1);
        reverse(arr, 0, n-1);
        reverse(arr, n, len-1);

       System.out.println("Ans: " + Arrays.toString(arr));
       Arrays.stream(arr).forEach(System.out::print);
    }

    public static void reverse(int arr[], int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
