package Notes;

public class Methods {
    /*
     * methods are reusable code that declared im a class or interface. They are useful
     * when you need to repeatedly execute some code but dont exactly know when the code will need
     * to be executed. 
     * 
     * 
     * 
     * 
     */

     public static void main(String[] args) {
        Methods obj = new Methods();

        obj.doSomething("Oogie Boogie");

        //this is not assigned to variable
        System.out.println(obj.addFive(10));

        //this one is stored in a variable
        int returnValue = obj.addFive(10);
        System.out.println(returnValue);

        try {
            obj.exceptionsHappen(0);
        } catch () {
            
        }
        
     }

     public void doSomething(String input) {
        System.out.println("You entered the string: " + input);
     }

     public int addFive (int num) {
        return num + 5;
     }

     public int exceptionsHappen(int num) {
        try {
            return 100 / num;
        } catch (ArithmeticException e) {
            throw new RuntimeException("you cannot divide by zero");
        }
     }
}
