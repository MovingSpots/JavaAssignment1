public class Animal {
    // Declare private fields for the Animal class
    private String animalName;    // stores the animal's name
    private String animalColor;   // stores the animal's color
    private int animalAge;     // stores the animal's age
    private String favFood;       // stores the animal's favorite food

    // Constructor: used to initialize all the fields when an object is created
    public Animal (String animalName, String animalColor, int animalAge, String favFood) {
    
        // 'this' refers to current object variables
        this.animalName = animalName;   // assign name to class
        this.animalColor = animalColor; // assign color
        this.animalAge = animalAge;     // assign age
        this.favFood = favFood;         // assign favorite food
    }

    // Getter method for name of the animal
    public String getName() {
        return animalName;
    }
    // Setter method for name of the animal
    public void setName(String animalName) {
        this.animalName = animalName;
    }

    // Getter for color
    public String getColor() {
        return animalColor;
    }
    // Setter for color
    public void setColor(String animalColor) {
        this.animalColor = animalColor;
    }

    // Getter for age
    public int getAge() {
        return animalAge;
    }
    // Setter for age
    public void setAge(int animalAge) {
        this.animalAge = animalAge;
    }

    // Getter for favorate food
    public String getFavFood() {
        return favFood;
    }
    // Setter for favorate food
    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    // Method to print all details using printf
    public void printDetails() {

        // print formatted output of all animal details
        System.out.printf(
            "Animal Details:\nName: %s\nColor: %s\nAge: %d\nFavorate Food: %s\n",
            animalName, animalColor, animalAge, favFood
        );
    } // Animal
} // class
