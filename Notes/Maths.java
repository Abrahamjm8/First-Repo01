package Notes;

public interface Maths {
    /*
     * All interfaces will share some common charactersitics
     * All fields in an interface are considered by default to be public static final
     * public: can be accessed anywhere
     * static: the value belongs to the interface, not the objects that implement the interface
     * final: the value cannot be changed
     */

    /*Methods in interfaces also have some default settings: they are considered by default to be 
      public and abstract
     *
     */


     //return type void bc they will be printed to the console
     void add(float numOne, float numTwo);

     void subtract(float numOne, float numTwo);

     void multiply(float numOne, float numTwo);

     void divide(float numOne, float numTwo);
}
