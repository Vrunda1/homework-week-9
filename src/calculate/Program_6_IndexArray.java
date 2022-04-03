package calculate;

/*Write a Java program to retrieve an element (at a specified index) from a given
array lis

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program_6_IndexArray {
    public static void main(String[] args) {
        Program_6_IndexArray obj=new Program_6_IndexArray();
        obj.fruitIndex();
    }

        public void fruitIndex(){

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("strawberry");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Pear");
        System.out.println(fruits);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any index value:");
        int index = sc.nextInt();
        System.out.println(fruits.get(index));

    }
}