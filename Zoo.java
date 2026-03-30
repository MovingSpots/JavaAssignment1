
import java.util.Scanner; // Import Scanner class to take user input

// Define the main class
public class Zoo {

  public static void main(String[] args) {
    
      // Create scanner object to read input from keyboard
      Scanner scanner = new Scanner(System.in);

      // Prompt user to enter animal name
      System.out.print("Enter animal Name: ");
      String animalName = scanner.nextLine(); // read name input

      // Prompt user to enter animal color
      System.out.print("Enter animal Color: ");
      String animalColor = scanner.nextLine(); // read color input

      // Prompt user to enter animal age
      System.out.print("Enter animal Age: ");
      int animalAge = scanner.nextInt(); // read intiger input

      // Clear buffer after the iniger input
      scanner.nextLine();

      // Prompt user to enter favorate food
      System.out.print("Enter Favorite Food: ");
      String favFood = scanner.nextLine(); // read food input

      // Create an Animal object using constructor
      Animal animal = new Animal(animalName, animalColor, animalAge, favFood);
    
      // Print the animal details using method
      animal.printDetails();
      
      // Close scanner to protect resource
      scanner.close();
  } // main
} // class