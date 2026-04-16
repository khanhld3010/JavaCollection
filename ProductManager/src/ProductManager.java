import java.util.*;

public class ProductManager {
    // List<Product> productArrayList = new ArrayList<>();
    List<Product> productArrayList = new LinkedList<>();
    private int lastId = 0;

    public ProductManager() {
        productArrayList.add(new Product(1, "Laptop Dell XPS", 25000000, 5));
        productArrayList.add(new Product(2, "Chuột không dây Logitech", 450000, 20));
        productArrayList.add(new Product(3, "Bàn phím cơ Keychron", 1800000, 15));
        if (!productArrayList.isEmpty()) {
            lastId = productArrayList.get(productArrayList.size() - 1).getId();
        } else {
            lastId = 0;
        }
    }

    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        lastId++;
        int id = lastId;
        System.out.print("Enter Product Name ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price ");
        int price = scanner.nextInt();
        System.out.print("Enter Product Quantity ");
        int quantity = scanner.nextInt();
        Product newProduct = new Product(id, name, price, quantity);
        System.out.println(newProduct);
        productArrayList.add(newProduct);
    }

    public void updateProduct() {
        System.out.print("Enter Product Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Product product : productArrayList) {
            if (id == product.getId()) {
                System.out.print("Enter Product Name ");
                String name = scanner.nextLine();
                System.out.print("Enter Product Price ");
                int price = scanner.nextInt();
                System.out.print("Enter Product Quantity ");
                int quantity = scanner.nextInt();
                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                System.out.println("Update Success");
                System.out.println(productArrayList);
                return;
            }
        }
        System.out.println("Not Found Product Id");
    }

    public void deleteProduct() {
        System.out.print("Enter Product Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                System.out.println("Delete Success");
                System.out.println(productArrayList);
                return;
            }
        }
        System.out.println("Id Not Found");
    }

    public void displayProduct() {
        System.out.println(productArrayList);
    }

    public void searchProduct() {
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        ArrayList<Product> searchProductList = new ArrayList<>();
        for (Product product : productArrayList) {
            if (name.equals(product.getName())) {
                searchProductList.add(product);
            }
        }
        if (searchProductList.size() == 0) {
            System.out.println("Not Found Product");
        } else {
            System.out.println(searchProductList);
        }
    }

    public void sortProduct() {
        Collections.sort(productArrayList);
        System.out.println(productArrayList);
    }
}
