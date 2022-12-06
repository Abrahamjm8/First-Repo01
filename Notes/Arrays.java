package Notes;
public class Arrays {
    /*
     * Arrays are data structures in java used to hold other data.
     *  Arrays are immutable structures that are set once they are created. 
     */

     public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9};

        int[] evenNumbers = new int[4];
        // evenNumbers[0] = 2; manually assigning this
        // evenNumbers[1] = 4;

        int num = 2;
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = num; 
            System.out.println(evenNumbers[i]);
            num = num + 2;
        }


        /*
         * arrays will work a little differently if you are not working primitives:
         * what happens when we use strings
         * 
         * null is the default value when you make an empty string array
         */

         String[] words = {"apple","banana", "hello world", "hi"};

         String[] noWordsYet = new String[3];
         String characters = "abcd";

         for (int i = 0; i < noWordsYet.length; i++) {
            System.out.println(noWordsYet[i]);

            noWordsYet[i] = characters;
            /*
             * Two things are happpening below:
             * 1. value of characters is being concatenated with itself 
             * 
             * 
             */
            characters = characters + characters;
         }


        
     }
}
