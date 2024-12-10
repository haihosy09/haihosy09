package ss5_static.quan_li_san_pham;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(" \nQuản Lý Sản Phẩm:");
            System.out.println(" 1. Thêm sản phẩm");
            System.out.println(" 2. xem sản phẩm");
            System.out.println(" 3. cập nhật sản phẩm");
            System.out.println(" 4. xóa sản phẩm");
            System.out.println(" 5. hiển thị tất cả sản phẩm");
            System.out.println(" 6. thoát");
            System.out.println(" chọn chức năng: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();
                    System.out.println(" nhập tên :");
                    String name = scanner.nextLine();
                    System.out.println("nhập giá :");
                    double price = Double.parseDouble(scanner.nextLine());
                    manager.addProduct(id, name, price);
                    break;
                case 2:
                    System.out.println(" nhập id sản phẩm cần xem :");
                    id = Integer.parseInt(scanner.nextLine());
                    manager.viewProduct(id);
                    break;
                case 3:
                    System.out.println(" nhập id sản phẩm cần cập nhật: ");
                    id = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();
                    System.out.println(" nhập tên mới ");
                    name = scanner.nextLine();
                    System.out.println(" nhập giá mới");
                    price = Double.parseDouble(scanner.nextLine());
                    manager.addProduct(id, name, price);
                    break;
                case 4:
                    System.out.println(" nhập id sản phẩm cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    manager.deleteProduct(id);
                    break;
                case 5:
                    manager.listProduct();
                    break;
                case 6:
                    System.out.println(" thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println(" lựa chọn không hợp lệ");
            }
        }
    }
}
