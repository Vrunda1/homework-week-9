package calculate;
/*Write a Java program to reverse an array of integer values.

 */
import java.util.ArrayList;
import java.util.Arrays;

public class Program_3_ReverseArray {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50, 60};//define Array
        System.out.println("Original Arrray:" + Arrays.toString(a));
        System.out.println("Reverse of the Array is: ");
        for (int i = a.length-1; i >= 0; i--) //loop to
        {
            System.out.print( a[i] + " ");

        }


    }


}
