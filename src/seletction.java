public class seletction {

    public static void seletctionSort(String name[], int size){
        //login for selection sort
        for (int i = 0 ; i <= size - 1 ; i ++){
            int minIndex = i;
            for (int j = i + 1 ; j <= size - 1; j++ ){
                if (name[j].compareToIgnoreCase(name[minIndex])< 0){
                    minIndex = j;
                }
            }
            String temp = name[i];
            name[i] = name[minIndex];
            name[minIndex] = temp;
        }

    }
    public static void display (String array[]){
        //login for display array
        for (String x : array){
            System.out.print( x + " ");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Sort number using selection method");
        String name[] = {"dara" , "sok" , "sokha" , "dodo", "zoro" , "wangling" , "tenzin"};
        display(name);
        seletctionSort(name, name.length);
        System.out.println(" ");
        display(name);
    }
}
