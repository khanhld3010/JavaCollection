//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    inputMenu();
}

static void displayMenu() {
    System.out.println("Product Manager !!!!");
    System.out.println("1: Add Product");
    System.out.println("2: Update Product By Id");
    System.out.println("3: Delete Product By Id");
    System.out.println("4: Display Product");
    System.out.println("5: Search Product By Id");
    System.out.println("6: Sort Product By Price");
    System.out.println("7: Exit");
}

static void inputMenu() {
    ProductManager productManager = new ProductManager();
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    do {
        displayMenu();
        System.out.println("Enter Your choice");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                productManager.addProduct();
                break;
            case 2:
                productManager.updateProduct();
                break;
            case 3:
                productManager.deleteProduct();
                break;
            case 4:
                productManager.displayProduct();
                break;
            case 5:
                productManager.searchProduct();
                break;
            case 6:
                productManager.sortProduct();
                break;
            case 7:
                System.exit(0);
                break;
        }
    } while (choice >= 1 && choice <= 7);
}
