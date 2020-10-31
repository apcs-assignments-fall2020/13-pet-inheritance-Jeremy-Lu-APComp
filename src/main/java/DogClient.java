public class DogClient {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex", 4, "Pug");
        System.out.println(d1); //tests toString method
        System.out.println(d1.getBreed()); //tests getBreed method
        d1.makeNoise(); //tests makeNoise method
        System.out.println(new Dog()); //tests default constructor
    }
}