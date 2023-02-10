//Dustin Olinger
//CIS-18A Course Project
//2-9-23
//Car Wash Service
// Import the Scanner class from the java.util package
import java.util.Scanner;

// Define the CarWashOrder class
class CarWashOrder {
    // Declare variables for the customer's name, product selection, appointment
    // date, and appointment time
    String name;
    String product;
    String Date;
    String Time;

    // Constructor for the CarWashOrder class
    public CarWashOrder(String name, String product, String Date, String Time) {
        // Initialize the variables with the values passed as arguments
        this.name = name;
        this.product = product;
        this.Date = Date;
        this.Time = Time;
    }

    // Getter method for the name variable
    public String getName() {
        return name;
    }

    // Getter method for the product variable
    public String getProduct() {
        return product;
    }

    // Getter method for the Date variable
    public String Date() {
        return Date;
    }

    // Getter method for the Time variable
    public String Time() {
        return Time;
    }
}

// Define the CarWashProgram class
public class CarWashProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Dustin's CarWash! ");
        System.out.println("Are Hours Are All Day EveryDay ");
	 System.out.println("Your Car Needs Cleaning ");
	 System.out.println("Dusty's Car Services is on the job ");
 
       // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Display the product options
        System.out.println("Select a product:");
        System.out.println("1. Basic Wash");
        System.out.println("2. Deluxe Wash");
        System.out.println("3. Premium Wash");

        // Store the user's product selection
        int productSelection = input.nextInt();
        String product = "";
        boolean validSelection = false;

        // Validate the user's product selection
        while (!validSelection) {
            if (productSelection == 1) {
                product = "Basic Wash";
                validSelection = true;
            } else if (productSelection == 2) {
                product = "Deluxe Wash";
                validSelection = true;
            } else if (productSelection == 3) {
                product = "Premium Wash";
                validSelection = true;
            } else {
                System.out.println("Invalid selection. Please try again.");
                productSelection = input.nextInt();
            }
        }

        // Consume the new line character
        input.nextLine();

        // Prompt the user for their appointment date
        System.out.print("Enter your appointment date (MM/dd): ");
        String Date = input.nextLine();

        // Prompt the user for their appointment time
        System.out.print("Enter your appointment time (hh:mm): ");
        String Time = input.nextLine();

        // Create a CarWashOrder object with the user's information
        CarWashOrder order = new CarWashOrder(name, product, Date, Time);

        // Display the order summary
        System.out.println("\nOrder Summary:");
        System.out.println("Name: " + order.getName());
        System.out.println("Product: " + order.getProduct());
        System.out.println("Appointment Date: " + order.Date());
        System.out.println("Appointment Time: " + order.Time());
    }
}