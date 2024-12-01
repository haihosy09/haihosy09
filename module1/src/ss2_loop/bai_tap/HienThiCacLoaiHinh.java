package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập chiều dài :");
        int rows = scanner.nextInt();
        System.out.print(" nhập chiều rộng ");
        int columns = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0 ; j < columns; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= rows ; i++) {
            for (int j = 0 ; j <i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = rows; i >=1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
