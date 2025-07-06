public class Main {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 10 and 99: ");
        for (int num = 10; num <= 99; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    
    public static boolean isPrime(int n) {
        if (n < 2)
        return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
            return false;
        }
        return true;
    }
}
