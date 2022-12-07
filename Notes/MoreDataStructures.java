package Notes;

import java.util.ArrayList;
import java.util.List;

public class MoreDataStructures {
    /*
     * 2 very common interfaces to be familiar with:
     * - list interfaces
     * - set interfaces
     * 
     * Lists are going to be your most flexible data strucrture:
     *  - Lists are indexable, they retain order of insertion and they allow duplicate values
     *  - the most common kind of list is the ArrayList
     * 
     * Lists make use of Generics: these are placeholders that tell java what KIND of data
     * is going to be used with the object in question
     */

     //whats the difference between using the reference type List vs ArrayList

     public static void main(String[] args) {
     List<String> namesList = new ArrayList<>(); //ArrayList has diamond brackets too but they can stay empty
     namesList.add("Billy");
     namesList.add("Sally");
     namesList.add("Teddy");
     namesList.add("Adam");

     System.out.println(namesList);
     }
}
