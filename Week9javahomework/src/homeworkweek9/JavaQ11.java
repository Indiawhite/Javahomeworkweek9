package homeworkweek9;

public class JavaQ11 {
    public static String myName = "Deval";

    public static void main(String[] args) {
        String[] groupNames = {"Kinjal", "vaishali", "Janki", "Deval"} ;

        for (String name : groupNames){
            if (name .equals(myName)){
                System.out.println("My name is :" + myName);

            }
        }
    }
}
