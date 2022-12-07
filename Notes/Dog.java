package Notes;

public class Dog extends Animal {

    public Dog() {

    }

    public Dog(int limbs, String name, String size, String eyeColor) {
       super(limbs, name, size, eyeColor);
    }
    public static void main(String[] args) {
        Dog myDog = new Dog(4, "Linda", "Small", "Brown");
        myDog.breathe();

    }

    @Override
    public void breathe() {
        System.out.println("pant pant");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark Bark!");
    }
}