import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {25,14,56,15,36,56,77,18,29,49};
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
            min = arr[i];
            }
            if (arr[i] > max){
            max = arr[i];
            }
        }
       
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
