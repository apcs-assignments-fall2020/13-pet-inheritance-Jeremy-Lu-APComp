public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String a, int b, String c) {
        super(a,b);
        this.breed = c;
    }

    public Dog() {
        super("Steve", 4);
        this.breed = "Pug";
    }

    // makeNoise() method


    // toString method

    public String toString(){
        String str = this.getName() + " " + this.getAge() + " " + this.getBreed();
        return str;
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
}