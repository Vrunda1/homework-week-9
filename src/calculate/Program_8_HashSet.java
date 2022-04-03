package calculate;

import java.util.HashSet;
import java.util.Set;

/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)
*/
public class Program_8_HashSet {
    public static void main(String[] args) {

        Program_8_HashSet ob = new Program_8_HashSet();
        ob.hashProg();
    }

    public void hashProg() {
        Set<Integer> numArray = new HashSet<>();

        numArray.add(4);
        numArray.add(7);
        numArray.add(8);
        System.out.println(numArray);

        for (int i = 1; i <= 10; i++) {
            if (numArray.contains(i)) {
                System.out.println(i + " number is between 1 to 10");
            } else {
                System.out.println( i+ " number is not in 1 to 10");
            }
        }
    }

}