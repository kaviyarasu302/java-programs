public class Main {
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,34,56,7};
        System.out.println(findIndex(arr, 90)); 
        System.out.println(findIndex(arr, 56)); 
    }
}
