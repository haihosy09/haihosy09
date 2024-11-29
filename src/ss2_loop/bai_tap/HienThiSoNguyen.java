package ss2_loop.bai_tap;


public class HienThiSoNguyen {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int n = 2;
        System.out.println(" 20 số nguyên tố đầu tiên là : ");
        while ( count < numbers ) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }
    }
}
