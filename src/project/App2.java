package project;

public class App2 {
    static String [] products = {"orange", "plum", "tomato", "onion", "grape", "onion"};

    public static void main(String[] args) {

        getProductList(products);
        products = removeProduct(products, "onion");
        newProductList(products);

    }
    private static void getProductList(String[]products){
        System.out.println("Product list: ");
        for (int i = 0; i < products.length; i++ ){
            System.out.println((i + 1) + ") " + products[i]);
        }
    }

    private static String[] removeProduct (String[] products, String wordToRemove){
        StringBuilder changeList = new StringBuilder();
        for (String word : products){
            if (!word.equals(wordToRemove)) {
                changeList.append(word).append(",");
            }
        }
        return changeList.toString().split(",");
    }

    private static void newProductList(String[] products) {
        System.out.println("\nNew product list: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ") " + products[i]);
        }
    }
}
