package Notes;

public class StringAPI {
    /*
     * Strings are the simplist object we can use to represent words/phrases within our code. They are 
     * useful when we need to so things like  pass messages to our users, create error messahes for developers, etc.
     * 
     * Strings are immutable objects: at best, you can reassign a var with your "updated" string, buy uou
     * do not change the initial string that was created
     * 
     */


     public static void main(String[] args) {
        String myName = "Abraham";

        System.out.println(myName); //prints Abraham

        myName += " Martinez";

        System.out.println(myName); //prints Abraham Martinez, but it is techincally not the same variable

        /*
         * if you want to change your word/phrase, what tool would you use. The easiest tool to use would
         * be the StringBuilder class
         */

         StringBuilder myWord = new StringBuilder(myName);

         System.out.println(myWord);

         //Word.reverse();

         System.out.println(myWord);

         myWord.append(", the great!");

         System.out.println(myWord);

         myWord.toString().split(".");
         
         System.out.println(myWord);
     }
}
