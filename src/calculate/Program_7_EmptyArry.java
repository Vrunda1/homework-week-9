package calculate;
/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names */

import java.util.ArrayList;

public class Program_7_EmptyArry {
    public static void main(String[] args) {
        Program_7_EmptyArry obj=new Program_7_EmptyArry();
        obj.isempty();
    }

        public void isempty(){
        ArrayList<String> tubenames = new ArrayList<>();
        tubenames.add("Metropolitan");
        tubenames.add("Victoria");
        tubenames.add("Bakerloo");
        tubenames.add("Jubliee");
        tubenames.add("Picadelly");
        System.out.println("Given Array list "+tubenames);
        if (tubenames.isEmpty()) {
            System.out.println("Given Array list is empty");
        } else {
            System.out.println("Given Array list is not empty");
        }
    }
}