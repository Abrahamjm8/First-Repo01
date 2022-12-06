public class Operators {
    /*In java you have multiple operators to use:
     * - Mathethematical operators
     * 
     * 
     * 
     * 
     */

     public static void main(String[] args) {
        int add = 5 + 5; // add 
        int subtract = 5 - 5; // subtract
        int multiply = 5 * 5; // multiply 
        int divide = 5 / 5; // divide
        int modulus = 5 % 5; // modulus returns the remainder

        /*
         * there are "quality of life" operators:
         * assignment and mathetical operators together
         * 
         */

         int number = 5; 
        number = number + 5;
        System.out.println(number);
        //the above means the same as below   
        number = 5; //resetting number 
        number +=5;
        System.out.println(number);
     }
}
