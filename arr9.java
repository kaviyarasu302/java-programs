public class Main {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) arr[i] = Integer.parseInt(args[i]);
        System.out.print("The given array is : ");
        for (int num : arr) System.out.print(num + " ");
        System.out.print("\nThe reverse of the array is : ");
        for (int i = 3; i >= 0; i--) System.out.print(arr[i] + " ");
    }
}
