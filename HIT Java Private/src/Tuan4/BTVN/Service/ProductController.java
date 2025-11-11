package Tuan4.BTVN.Service;

import Tuan4.BTVN.Constants.Constants;
import Tuan4.BTVN.Model.Product;
import Tuan4.BTVN.Model.Laptop;
import Tuan4.BTVN.Model.Smartphone;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<Product> products;

    public ProductController(ArrayList<Product> products) {
        this.products = products;
    }

    private boolean isProductExists(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Hàm mới: trả về Product theo tên hoặc null nếu không có
    public Product getProductByName(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (isProductExists(product.getName())) {
            System.out.println("San pham da ton tai! Khong the them.");
            return;
        }
        products.add(product);
        System.out.println(Constants.Success.SUCCESS_ADD);
    }

    public void addProduct(String type, String name, String description, double price) {

        if (isProductExists(name)) {
            System.out.println("San pham da ton tai! Vui long nhap ten khac.");
            return;
        }

        if (type.equalsIgnoreCase("laptop")) {
            System.out.print(Constants.Enter.ENTER_RAM);
            String ram = sc.nextLine();

            System.out.print(Constants.Enter.ENTER_CPU);
            String cpu = sc.nextLine();

            products.add(new Laptop(name, description, price, ram, cpu));
            System.out.println(Constants.Success.SUCCESS_ADD);
            return;
        }

        if (type.equalsIgnoreCase("smartphone")) {
            boolean has5G = false;
            boolean valid = false;

            do {
                System.out.print(Constants.Enter.ENTER_HAS5G);
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("y")) {
                    has5G = true;
                    valid = true;
                } else if (input.equalsIgnoreCase("n")) {
                    has5G = false;
                    valid = true;
                } else {
                    System.out.println("Nhap 'y' hoac 'n'!");
                }
            } while (!valid);

            products.add(new Smartphone(name, description, price, has5G));
            System.out.println(Constants.Success.SUCCESS_ADD);
            return;
        }

        System.out.println(Constants.Error.ERR_WRONG_TYPE);
    }

    public void removeById(int id) {
        Product p = getProductById(id);
        if (p != null) {
            products.remove(p);
            System.out.println(Constants.Success.SUCCESS_REMOVE);
        } else {
            System.out.println(Constants.Error.ERR_DATA_NOT_FOUND);
        }
    }

    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getiD() == id) {
                System.out.println(Constants.Success.SUCCESS_FOUND);
                System.out.println(p.getInfo());
                return p;
            }
        }
        System.out.println(Constants.Error.ERR_DATA_NOT_FOUND);
        return null;
    }

    public void getAllProducts() {
        if (products.isEmpty()) {
            System.out.println(Constants.Error.ERR_EMPTY_LIST);
            return;
        }

        System.out.println(Constants.Display.DISPLAY_LIST);
        for (Product p : products) {
            System.out.println(p.getInfo());
        }
    }
}
