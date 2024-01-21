package project;

public class App1 {
    static String [] products = { "brange", "plum", "tomato", "onibn", "grape"};

    public static void main(String[] args) {

        getProducts(products);
        getCorrectNames(products);

    }

    private static void getProducts(String [] products){
        System.out.println("Incorrect names of products:");
        for (int i = 0; i < products.length; i++ ){
            System.out.println((i + 1) + ") " + App1.products[i]);
        }
    }

    private static String fixIssues(String product){
        return product.replace("brange", "orange")
                .replace("onibn", "onion");
    }

    private static void getCorrectNames(String [] products){
        System.out.println("\nCorrect names of products: ");
        for (int i = 0; i < products.length; i++){
            products[i] = fixIssues(products[i]);
            System.out.println((i + 1) + ") " + products[i]);
        }
    }
}
