package calculate;

import java.util.ArrayList;
import java.util.Iterator;

/*Write a Java program to iterate through all elements in an array list using
Iterator
*/
public class Program_5_Iterator {
    public static void main(String[] args) {

        ArrayList<String> colour=new ArrayList<>();

        colour.add("Red");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Orange");

        Iterator itr=colour.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
