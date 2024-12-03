package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print(" nhập số phần tử của mảng:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println(" nhập các phần tử của mang :");
        for (int i = 0; i < n; i++) {
            System.out.print(" phần tử thứ" + (i + 1 )+ ":");
            array[i] = sc.nextInt();
        }
        System.out.print(" nhập phần tử muốn thêm :");
        int newelement = sc.nextInt();
        System.out.print(" nhập vị trí muốn thêm ( từ 1 đến"+ (n + 1) + "):");
        int index = sc.nextInt() - 1;
        if (index < 0 || index >= n) {
            System.out.println(" vị trí khng hợp lệ !");
        }else {
            int[] newArray = new int [ n + 1];
            for (int i = 0,j = 0 ; i <newArray.length ; i++) {
                if ( i == index) {
                    newArray[i] = newelement;
                }else {
                    newArray[i] = array[j++];
                }
            }
            System.out.println(" mảng sau khi thêm là :");
            for (int i = 0; i < newArray.length; i++) {
                System.out.println(newArray[i] + " ");
            }
        }
    }
}
