public class Main {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int max = Integer.MIN_VALUE, val;
        System.out.print("The given array is : ");
        for (String s : args) {
            val = Integer.parseInt(s);
            System.out.printf("%d ", val);
            if (val > max) max = val;
        }
        System.out.printf("%nThe biggest number in the given array is %d%n", max);
    }
}
