package homeworkweek9;

import java.util.HashMap;
import java.util.HashSet;

public class JavaQ7 {
    public static void main(String[] args) {
        HashMap<String,Integer> people = new HashMap<>();
        people . put("Deval" , 34);
        people . put("Vaishali" , 38);
        people . put("Kinajl" , 39);
        people. put("Janki", 37);
        people. put("Mili" , 40);

        System.out.println(" Value in Map");
        for (String name :  people.keySet()) {
            System.out.println(name);


        }
    }
}
