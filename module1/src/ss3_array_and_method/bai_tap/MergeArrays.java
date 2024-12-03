package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng thứ nhất: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Nhập các phần tử của mảng thứ nhất:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.print("Nhập số phần tử của mảng thứ hai: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Nhập các phần tử của mảng thứ hai:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        int[] mergedArray = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = array2[i];
        }
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
