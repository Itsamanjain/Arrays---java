import java.util.Arrays;

public class ArrayTailInsertion {
    public static void main(String[] args) {
        int[] myArray = new int[6];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 30;
        int newElement = 50;
        int lastIndex = myArray.length - 1;
        myArray[lastIndex] = newElement;
        System.out.println(Arrays.toString(myArray)); // Outputs [10, 20, 30, 40, 30, 50]
    }
}
