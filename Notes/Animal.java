package Notes;

public class Animal {
    public int limbs;
    public String name;
    public String size;
    public String eyeColor;

    public Animal(){

    }

    //these parameters are not the same as the fields we are going to initialize
    public Animal(int limbs, String name, String size, String eyeColor) {
        this.limbs = limbs;
        this.name = name; 
        this.size = size;
        this.eyeColor = eyeColor;
    }

    public void breathe() {
        System.out.println("wheeze");


    }

    public void makeNoise() {
        System.out.println("noises");
    }

    
}
