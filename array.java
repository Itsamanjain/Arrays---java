import java.util.Scanner;



public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array size");
        int size =in.nextInt();   // input lele ne ke liye 
        int numbers[]= new int [size];  // array declear

        // input 
        System.out.println("enetr the value of array");
        for (int i = 0; i < size; i++) {
            numbers [i]= in.nextInt();

        }
        System.out.println("enter the value of x");
        int x = in.nextInt();  // konsa no find karna hai 


            //output
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==x){
                System.out.println("x is found at index : "+i);
            }
            
        }


    }
    
}
