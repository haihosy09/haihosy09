package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.print("phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print(" nhập vị trí muốn xóa ( từ 1 đến " + n + "):");
        int index = scanner.nextInt() - 1 ;
        if ( index < 0 || index >= n){
            System.out.println(" vị trí không hợp lệ!");
        }else {
            int [] newArr = new int[n-1];
            int j = 0;
            for (int i = 0; i < n ; i++) {
                if ( i != index){
                    newArr[j++] = arr[i];
                }
            }
            System.out.println(" mảng sau khi xóa phần tử là: ");
            for (int i = 0; i < newArr.length; i++) {
                System.out.println( newArr[i] + "");
            }
        }
    }
}
