import java.util.Scanner; // Importing the Scanner class

public class W05Practical {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creating a new Scanner object called reader
        System.out.println("Enter total number of hours");
        int input = reader.nextInt();

        // Checking if the input is correct (negative hours don't exist!)
        if (input < 0) {
            System.out.println("Invalid input!");
            return;
        }

        Converter converter = new Converter(); // Creating a new Converter object called converter
        converter.convert(input); // Converting the input into weeks/days/hours using the convert method
        converter.display(); // Displaying the time in the required format using the display method
    }
}