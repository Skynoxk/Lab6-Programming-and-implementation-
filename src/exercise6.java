/*
 * Author: Meas Ratanakviphou
 * Date: 15/01/2025
 */
// Create a product management system that allows the user to add products to the system.
//sorting products by price base on bubble sort (descending order)
import java.util.Scanner;
class product {
    int size = 10;
    String name [] = new String[size];
    double price [] = new double[size];
    String ID [] = new String[size];
    String category [] = new String[size];
    public product(String name[], double price[], String ID[], String category[]) {
        for (int i = 0 ; i < name.length; i++) {
            this.name[i] = name[i];
            this.price[i] = price[i];
            this.ID[i] = ID[i];
            this.category[i] = category[i];
        }
    }
    static void swap(double[] price, String[] name, String[] ID,String category[], int i, int j) {
        double tempPrice = price[i];
        price[i] = price[j];
        price[j] = tempPrice;
        String tempName = name[i];
        name[i] = name[j];
        name[j] = tempName;
        String tempID = ID[i];
        ID[i] = ID[j];
        ID[j] = tempID;
        String tempCategory = category[i];
        category[i] = category[j];
        category[j] = tempCategory;
    }
    static void bubble(double[] price, String[] name, String[] ID, int size, String[] category) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (price[j] < price[j + 1]) {
                    swap(price, name, ID,category, j, j + 1); //swap all the elements not only the price like in the previous exercise
                }
            }
        }
    }
    static void display(String name[], double price[], String ID[], String category[]) {
        System.out.println("Product Name\tProduct Price\tProduct ID\tProduct Category");
        System.out.println("==============================================================");
        for (int i = 0; i < price.length; i++) {
            System.out.println(name[i] + "\t\t" + price[i] + "\t\t" + ID[i] + "\t\t" + category[i]);
        }
    }
}
public class exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to product management system");
        System.out.println("==============================================================");
        //User input the number of products
        // System.out.print("Enter the number of products you want to add: ");
        // int size = input.nextInt();
        // double price [ ] = new double[size];
        // String name [ ] = new String[size];
        // String ID [ ] = new String[size];
        // String category [ ] = new String[size];
        // System.out.println("======================================");
        // for (int i = 0; i < size; i++) {
        //     System.out.print("Enter the name of product " + (i + 1) + ": ");
        //     name[i] = input.next();
        //     System.out.print("Enter the price of product " + (i + 1) + ": ");
        //     price[i] = input.nextDouble();
        //     System.out.print("Enter the ID of product " + (i + 1) + ": ");
        //     ID[i] = input.next();
        //     System.out.println("Enter the category of product " + (i + 1) + ": ");
        //     category[i] = input.next();
        //     System.out.println("======================================");
        //}
        
        //initialize 10 products

        double price[] = { 100.0, 50.0, 150.0, 20.0, 170.0, 390.0, 350.5, 400.0, 34.0, 5.0 };
        String name[] = { "flower", "book", "pen", "pencil", "bag", "shoes", "shirt", "pants", "hat", "glasses" };
        String ID[] = { "p20230001", "p20230002", "p20230003", "p20230004", "p20230005", "p20230006", "p20230007", "p20230008", "p20230009", "p20230010" };
        String category[] = { "Category 1", "Category 2", "Category 3", "Category 4", "Category 5", "Category 6", "Category 7", "Category 8", "Category 9", "Category 10" };
        product.bubble(price, name, ID,price.length, category);
        product.display(name, price, ID, category);
    }
}
