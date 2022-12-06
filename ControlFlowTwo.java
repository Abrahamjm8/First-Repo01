public class ControlFlowTwo {
    public static void main(String[] args) {
        int visa = 100;
        int cost = 50;
        
        //either, or situation
        if (visa >= cost) {
            System.out.println("congrats on purchase");
        } else {
            System.out.println("you do not have enough money to purchase item");
        }


        //else if statements are mutually exclusive, this means only one of the statements will execute 
        // the first statement that is true will execute 
        if (visa > cost) {
            System.out.println("congrats on purchase");
        } else if (visa == cost) {
            System.out.println("purchase made, and you have no money left on the gift card");
        } else {
            System.out.println("you do not have enough money to purchase item");
        }

        //one place you might make use of this with user authentication
        String username = "username";
        String password = "password";


        //nested if statemnets can be a little rough to read: recommended combing them into on if statement if possible
        //.equals() is the string equivalent of == 
        if (username.equals("username")) {
            if (password.equals("password")) {
                System.out.println("logged in successful!");
            } else {
                System.out.println("logged in failed, please try again.");

            }
        } else {
            System.out.println("logged in failed, please try again.");
        }


        // more compact way of writing the above statement
        if (username.equals("username") && password.equals("password")) {
            System.out.println("logged in successful!");
        } else {
            System.out.println("logged in failed, please try again.");
        }
    }
    
}
