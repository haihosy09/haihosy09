package ss5_static.quan_li_san_pham;

import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> productList = new ArrayList<Product>();
    public void addProduct(int id, String name, double price) {
        for (Product p : productList) {
            if (p.getId() ==id ){
                System.out.println(" id đã tồn tại, không thể thêm sản phẩm.");
                return;
            }
        }
        productList.add(new Product(id, name, price));
        System.out.println("thêm mới thành công");
    }
    public void viewProduct(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                System.out.println(p);
                return;
            }
        }
        System.out.println(" ko tìm thấy sản phẩm với id : "+ id);
    }
    public void updateProduct(int id, String name, double price) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(name);
                p.setPrice(price);
                System.out.println(" sản phẩm đã được cập nhật!");
                return;
            }
        }
        System.out.println(" không tìm thấysản phẩm với id : "+ id);
    }
    public void deleteProduct(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                productList.remove(p);
                System.out.println(" sản phẩm đã được xóa");
                return;
            }
        }
        System.out.println(" không tìm thấy sản phẩm với id "+ id);
    }
    public void listProduct() {
        if (productList.isEmpty()) {
            System.out.println(" danh sách trống");
        }else {
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }
}
