package Tuan4.BTVN;

import Tuan4.BTVN.Constants.Constants;
import Tuan4.BTVN.Model.Laptop;
import Tuan4.BTVN.Model.Smartphone;
import Tuan4.BTVN.Model.Product;
import Tuan4.BTVN.Service.ProductController;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();
        ProductController controller = new ProductController(productList);

        String[][] initialProducts = {
                {"laptop", "Dell XPS 13", "Laptop cao cấp", "1500", "16GB", "Intel i7"},
                {"laptop", "MacBook Air", "Laptop mỏng nhẹ", "1200", "8GB", "M1"},
                {"smartphone", "iPhone 14", "Smartphone Apple", "1000", "y"},
                {"smartphone", "Samsung Galaxy S23", "Smartphone Samsung", "950", "y"},
                {"laptop", "HP Pavilion", "Laptop phổ thông", "700", "8GB", "Intel i5"}
        };

        for (String[] data : initialProducts) {
            String type = data[0];
            String name = data[1];
            String description = data[2];
            double price = Double.parseDouble(data[3]);

            if (controller.getProductByName(name) != null) continue;

            if (type.equalsIgnoreCase("laptop")) {
                productList.add(new Laptop(name, description, price, data[4], data[5]));
            } else if (type.equalsIgnoreCase("smartphone")) {
                boolean has5G = data[4].equalsIgnoreCase("y");
                productList.add(new Smartphone(name, description, price, has5G));
            }
        }

        System.out.println("Danh sach san pham ban dau:");
        controller.getAllProducts();

        boolean exit = false;
        while (!exit) {
            Constants.showMenu();
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print(Constants.Enter.ENTER_TYPE);
                    String type = sc.nextLine();
                    System.out.print(Constants.Enter.ENTER_NAME);
                    String name = sc.nextLine();
                    System.out.print(Constants.Enter.ENTER_DESCRIPTION);
                    String description = sc.nextLine();
                    System.out.print(Constants.Enter.ENTER_PRICE);
                    double price = 0;
                    try {
                        price = Double.parseDouble(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Gia tien khong hop le!");
                        break;
                    }
                    controller.addProduct(type, name, description, price);
                    break;
                case "2":
                    System.out.print(Constants.Enter.ENTER_ID);
                    int removeId = Integer.parseInt(sc.nextLine());
                    controller.removeById(removeId);
                    break;
                case "3":
                    System.out.print(Constants.Enter.ENTER_ID);
                    int searchId = Integer.parseInt(sc.nextLine());
                    controller.getProductById(searchId);
                    break;
                case "4":
                    controller.getAllProducts();
                    break;
                case "5":
                    exit = true;
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }

        sc.close();
    }
}
