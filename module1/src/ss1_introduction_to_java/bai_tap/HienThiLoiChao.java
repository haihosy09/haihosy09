package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" nhập tên :");
        String name = in.nextLine();
        System.out.println("hello " + name);
    }
}
