package homeworkweek9;

import java.util.HashSet;

public class JavaQ6 {
    public static void main(String[] args) {
        HashSet<Integer> NumberSet = new HashSet<>();

        NumberSet . add(4);
        NumberSet . add(7);
        NumberSet . add(8);

        System.out.println("numbers are between 1 and 10 are in the set");
        for (int i = 1 ; i<=10 ;i++){
            if (NumberSet.contains(i)){
                System.out.println(i);
            }
        }
    }
}
