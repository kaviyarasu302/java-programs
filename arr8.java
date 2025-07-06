public class Main {
    public static int sumExcept67(int[] arr) {
        int sum = 0;
        boolean inBlock = false;
        for (int num : arr) {
            if (num == 6) inBlock = true;
            else if (num == 7 && inBlock) inBlock = false;
            else if (!inBlock) sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumExcept67(new int[]{10,3,6,1,2,7,9})); 
        System.out.println(sumExcept67(new int[]{7,1,2,3,6}));      
        System.out.println(sumExcept67(new int[]{1,6,4,7,9}));      
    }
}
