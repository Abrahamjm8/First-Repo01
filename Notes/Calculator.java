package Notes;


public class Calculator implements Maths {

    @Override
    public void add(float numOne, float numTwo) {
        int IntOne = Math.round(numOne);
        int IntTwo = Math.round(numTwo); //will convert out float to an int by rounding it 
        System.out.println(IntOne + IntTwo);

    }

    @Override
    public void subtract(float numOne, float numTwo) {
        int IntOne = Math.round(numOne);
        int IntTwo = Math.round(numTwo); //will convert out float to an int by rounding it 
        System.out.println(IntOne + IntTwo);
        
    }

    @Override
    public void multiply(float numOne, float numTwo) {
        int IntOne = Math.round(numOne);
        int IntTwo = Math.round(numTwo); //will convert out float to an int by rounding it 
        System.out.println(IntOne + IntTwo);
        
    }

    @Override
    public void divide(float numOne, float numTwo) {
        int IntOne = Math.round(numOne);
        int IntTwo = Math.round(numTwo); //will convert out float to an int by rounding it 
        System.out.println(IntOne + IntTwo);
        
    }
}
