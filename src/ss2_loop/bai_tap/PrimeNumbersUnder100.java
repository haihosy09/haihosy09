package ss2_loop.bai_tap;

public class PrimeNumbersUnder100 {
    public static void main(String[] args) {
        System.out.println(" các số nguyên tố nhỏ hơn 100 là :");
        for (int n = 2; n < 100 ; n++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}
