import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

      Arrays.stream(arr).forEach(e -> System.out.println(Arrays.toString(e)));
      int[][] transposedArray = transpose(arr);
      Arrays.stream(transposedArray).forEach(e -> System.out.println(Arrays.toString(e)));
      int[][] roatedArray = rotateNinetyDegree(transposedArray);
      Arrays.stream(roatedArray).forEach(e -> System.out.println(Arrays.toString(e)));
    }

    public static int[][] transpose(int[][] arr) {
        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j< arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    public static int[][] rotateNinetyDegree(int[][] matrix) {
        for (int[] val : matrix) {
            rotateRow(val);
        }
        return matrix;
    }

    public static void rotateRow(int[] arr) {
        int l=0, r = arr.length-1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void makeAllZero() {
        int[][] arr = {
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
    }
}
