package collectioncolour;

import java.util.ArrayList;

public class ArrayColourList {

    public static void main(String[] args) {
        ArrayList<String>colour = new ArrayList<>();

        colour .add("Red");
        colour .add("Green");
        colour .add("Pink");
        colour .add("Brown");
        colour .add("white");
        colour .add("Yellow");

        System.out.println("Array List Colour");

        for (String Colour : colour);
        System.out.println(colour);

    }
}
