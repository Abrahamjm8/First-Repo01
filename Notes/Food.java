package Notes;

public abstract class Food {
    /*
     * An abstract class can not have objected created from it: you must instead have sub-class inherit 
     * the properties of the abstract class and create an object of that subclass to access the props of the 
     * the abs class 
     */

     public String name;
     public String taste;
     public String texture;
     public String smell;
     public int calorieCount;
     public boolean isCandy;
     public boolean isCooked;

     public Food() {

     }

     public Food(String name, String taste, String texture, String smell, int calorieCount, boolean isCandy,
            boolean isCooked) {
        this.name = name;
        this.taste = taste;
        this.texture = texture;
        this.smell = smell;
        this.calorieCount = calorieCount;
        this.isCandy = isCandy;
        this.isCooked = isCooked;
    }

    public static void main(String[] args) {
        //Food f = new Food(); not allowed because you cannot instantiate an abstract class.

     }
    public abstract void eat();
    public abstract void cook();
    public abstract void store();


}
