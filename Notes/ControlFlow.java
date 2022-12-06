package Notes;
public class ControlFlow {
    /*
     * control flow discuss the tools aavialble to determine what parts of our code
     * excute, when to execute, aand under what conditions to execute.
     */

     //reminder: you MUSR have a main method if you want to execute your Java code

     public static void main(String[] args) {
        int visaCard = 100; //this cisaCard variable represents the 1--$ you got for b-day
        int burgerCost = 45; // this burgerCost variable represents the 45$ charge for burger

    //all examples below execute successfully
        if (visaCard >= burgerCost) {
            System.out.println("Congrats on buying the burger. Gordan Ramsey made it; thats why it's 45 bucks");
        }

        //example above with prim
        if (100 >= 45 ) {
            System.out.println("Congrats on buying the burger. Gordan Ramsey made it; thats why it's 45 bucks");
        }

        //example with boolean 
        if (true) {
            System.out.println("Congrats on buying the burger. Gordan Ramsey made it; thats why it's 45 bucks");
        }

    // all conditions false, will not execute
        int lowCard = 40; //card less money

        if (lowCard >= burgerCost) {
            System.out.println("Congrats on buying the burger. Gordan Ramsey made it; thats why it's 45 bucks");
        }

        if (40 >= 45) {
            System.out.println("Congrats on buying the burger. Gordan Ramsey made it; thats why it's 45 bucks");
        }

        if (false) {
            System.out.println("Congrats on buying the burger. Gordan Ramsey made it; thats why it's 45 bucks");
        }

        /*
        * >= is an operator. there are many other options we can use:
        <  less than
        > greater than
        >= greater than or equal to
        <- less than or equal to 
        */
        
        int numOne = 10;
        int numTwo = 32;

        if (numOne > numTwo) {
            System.out.println("will this phrase show?: ");
        }

        int newCard= 100;
        int pizzaCost = 5;


        if (newCard >= pizzaCost) {
            System.out.println("Enjoy pizza! :)");
        }

        if (newCard < pizzaCost) {
            System.out.println("get out of my pizza shop ");
        }

        int balance = 75;
        int expectedBalance = 75; 

        // by using the NOT operator we essentially tell the if statement on a flase statement instead of a true one
        if (balance != expectedBalance) {
            System.out.println("this is bad");
        }

        // this does work: the NOT operator tells our codee to execute the code inside the if statment if the boolean value provided is 
        if (!false) {
            System.out.println("will execute, bc !false is techincally true");
        }

        

     }

 

      
}
