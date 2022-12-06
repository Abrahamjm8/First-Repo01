package Notes;
public class Loops {
    /*
     * Loops are another way of controlling flow. 
     * particurly useful when you need an operation to happen multiple times. 
     * the easiest way of doing this a for loop
     */

     /*
      * a for loop has 3 parts: a controlling valu, a confition to continue, 
      and a change to contrilling value
      */
    public static void main(String[] args) {
        // for (int x = 0; x <= 10; x++) {
        //     System.out.println(x);
        //   }

        // for ( int x = 10; x >= 0; x--) {
        //     System.out.println(x);
        // }

        for (int x = 1; x <= 10; x++) {
            if ( x % 2 == 0 /* checks if even number*/) {
                System.out.println(x);
            }
        }

        //storing int numbers to loop thru them - ARRAY

        int[] numbers = {1,3,5,9,15,34,73,8,4235325};

        //index positions to access: indexing starts with 0 and works its way up
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 2 == 0) {
            System.out.println(numbers[x]);
            } else {
                System.out.println("this is an odd number");
            }
        }

        // while loop is another way to loop through our code
        //useful when there are an unknown times of iteration 
        // or when you dont know when you are going to hit your end condition
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        //do while loop, the logical statment is checked after the code executes
        x = 0;
        do {
            System.out.println(x);
        } while (x <= 10);
        //useful when you need your code to run at least once
    }
      
}
