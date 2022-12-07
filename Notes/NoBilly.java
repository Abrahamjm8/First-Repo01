package Notes;

public class NoBilly extends RuntimeException {
    /*
     * There are two types of exceptions:
     * - Runtime Exception
     * - Exception
     * 
     * there are two ways to create your own exceptions, and this is accomplished by either extending the 
     * Exceotion or RunTimeException classes. If your custom exception exetnds Exepction it will be a 
     * "checked exception", meaning that any code that could throw the exception MUST be handled. If 
     * RuntimeException is extended then it is a "unchecked exception" and you do NOT need to handle that code that
     * might produce 
     * 
     */

     //do this youself abe for practice

     //the throws keyword used after the method declaration is basically saying "we'll deal with it later"
     

     //Main difference between RuntimeException and checked Exception is that It is mandatory to 
     // provide try-catch or try finally block to handle checked Exception and failure to do so will 
     // result in a compile-time error, while in the case of RuntimeException this is not mandatory.


     //these means that we throw a runtimeeexpcetiom (by first creating one creating one) we have the leeway
     //of handling (using a try catch block) later in our code in than in the method (or other piece of code) 
     //which we are throwing it in.
}
