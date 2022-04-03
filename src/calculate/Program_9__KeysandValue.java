package calculate;

import java.util.HashMap;
import java.util.Map;

/*   Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map
*/
public class Program_9__KeysandValue {
    public static void main(String[] args) {
        Program_9__KeysandValue obj=new Program_9__KeysandValue();
        obj.hashMap();

    }
    public void hashMap(){
        Map<String,Integer> People= new HashMap<>();
        People.put("Vrunda",1);
        People.put("Shruti",2);
        People.put("Surbhi",3);
        People.put("Harsh",4);
        People.put("Purviben",5);
        People.put("Kalpeshbhai",6);
        People.put("Saurabhbhai",7);

        for(Map.Entry<String,Integer> personName : People.entrySet())
        {
            System.out.println(personName.getValue() +" " + personName.getKey());
        }
    }
}
