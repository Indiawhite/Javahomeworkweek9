package undergraound;

import java.util.ArrayList;

public class TubeNameList {
    public static void main(String[] args) {
        ArrayList<String> tubeName= new ArrayList<>();

        tubeName.add("Metropolitan Line");
        tubeName.add("Central Line");
        tubeName.add("Piccadilly Lain");
        tubeName. add("Northern Line");
        tubeName. add("Bakerloo Line");

        if (tubeName.isEmpty()){
            System.out.println("UnderGround tubeList is empty");

        }else {
            System.out.println("UnderGround tubeList is not empty");
        }

    }
}
