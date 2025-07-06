import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,1,9,3,7,2,8};
        Arrays.sort(arr);
        int min1 = arr[0], min2 = arr[1];
        int max1 = arr[arr.length-1], max2 = arr[arr.length-2];
System.out.printf("Smallest 2: %d, %d%nLargest 2: %d, %d%n", min1, min2, max2, max1);
    }
}
