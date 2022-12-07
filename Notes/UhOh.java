package Notes;

public class UhOh {
    /*
     * Anytime something foes wrong in your coode java will "throw" and exception. Tis is the deault behavior for handling things going wrong in your code. if you as a developerwant to "handle" these exceptions you have to make use
     * 
     * 
     */
    

     try {
        System.out.println(10/0);
     } catch (ArithmeticException e) { //this exception is thrown if we try to divide by zero
        System.out.println(e.getMessage());
        System.out.println("you cant divide by zero!"); //we could also print out our own message
     }


     try {
        //some code
     } catch (IOException | ArithmeticException e ) {
        System.out.println();
     }

}
