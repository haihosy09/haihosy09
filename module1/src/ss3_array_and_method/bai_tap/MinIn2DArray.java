package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class MinIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng :");
        int rows = sc.nextInt();
        System.out.print(" nhập so cột :");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println(" nhập các phần tử trong mảng ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(" phần tử tại [" + i + "][" + j + "] : ");
                array[i][j] = sc.nextInt();
            }
        }
        int min = array[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(" min : " + min);
    }
}
