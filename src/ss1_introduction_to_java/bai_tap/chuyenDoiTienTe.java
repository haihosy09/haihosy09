package ss1_introduction_to_java.bai_tap;



import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số usd ");
        double usd = Double.parseDouble(sc.nextLine());
        double vnd = usd * 23000;
        System.out.println("số việt nam đồng mà bạn nhận được là : "+ vnd);
    }
}
