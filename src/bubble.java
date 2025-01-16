
import java.util.Scanner;


public class bubble {
    public static void sortBubble(int array[], int size){
        //login for bubble sort
        for (int i = 0; i <= size -1 ; i++){
            for (int j = 0; j <= size - i - 2; j++){
                if (array[j] < array[j+1]){
                    // int temp = array[j];
                    // array[j] = array[j+1];
                    // array[j+1] = temp;
                    swap (array, j, j+1);
                }
            }
        }
    }
    public static void swap(int array[], int i, int j){
        //login for swap
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void display(int array[]){
        //login for display array
        for (int x : array){
            System.out.print(x + " ");
        }
        System.out.println(" ");
    }
    public static void input (int array[]){
        //login for input array
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter the number: ");
            array[i] = input.nextInt();
        }
        input.close();
    }
    public static void main(String[] args) {
        System.out.println("Sort number using burble method");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int array[] = new int [size];
        input(array);
        display(array);
        System.out.println("After sorting: ");
        sortBubble(array, array.length);
        display(array);
    }
}
