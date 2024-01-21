package project;

import java.util.Scanner;

public class App3 {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        String names = "Bob, Alice, Tom, Lucy, Bob, Lisa";

        System.out.print("Input a name for searching: ");
        String searchName = sc.nextLine();

        int nameCount = findNameCount(names, searchName);

        getResult(nameCount, searchName);
    }

    private static int findNameCount(String names, String searchName) {

        int count = 0;
        StringBuilder namesBuilder = new StringBuilder(names);

        namesBuilder = new StringBuilder(namesBuilder.toString()
                .replace(",", " ").toUpperCase());

        int index = namesBuilder.indexOf(searchName);
        while (index != -1) {
            count++;
            namesBuilder.delete(index, index + searchName.length());
            index = namesBuilder.indexOf(searchName);
        }
        return count;
    }

    private static void getResult(int nameCount, String searchName) {

        if (nameCount > 0) {
            System.out.println("Name: " + searchName + ", Quantity in list: " + nameCount);
        } else {
            System.out.println("Name " + searchName + " didn't find in list.");
        }

    }
}
