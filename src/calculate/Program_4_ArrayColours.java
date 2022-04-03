package calculate;

import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.

 */
public class Program_4_ArrayColours {
    //Array list
    public static void main(String[] args) {

        ArrayList<String> colour = new ArrayList<>();
        colour.add("Red");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Orange");
        for (int i = 0; i < colour.size(); i++) {
            System.out.println(colour.get(i));
        }

    }
}
