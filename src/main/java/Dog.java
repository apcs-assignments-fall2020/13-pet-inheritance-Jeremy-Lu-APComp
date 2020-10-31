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
    public void makeNoise(){
        System.out.println("Bark!");
    }

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
    public void setBreed(String breed){
        if(breed.trim().length() != 0){ //the length will never be less than zero
            this.breed = breed.trim();
        }
    }
}
