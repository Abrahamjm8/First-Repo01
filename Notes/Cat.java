package Notes;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int limbs, String name, String size, String eyeColor) {
        super(limbs, name, size, eyeColor);
    }

    public static void main(String[] args) {
        //Reference type is cat so it is a cat object, and used a cat constructor
        Cat myCat = new Cat(4, "Clara", "Medium", "Green");

        System.out.println();
    }
    public void breathe() {
        System.out.println("pant");
    }

    public void makeNoise() {
        System.out.println("Meow");
    }
}
