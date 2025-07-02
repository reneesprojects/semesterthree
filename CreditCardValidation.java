//Importing the Scanner class 
import java.util.Scanner;

public class CreditCardValidation {

//Method to utilize the Luhn algorithm to validate the card number 
    public static boolean isValidCreditCard(String cardNumber) {
//Initialize the sum to 0
        int sum = 0;
//Sets the initial value to "False"before proving it true later
        boolean alternate = false;

//Iterate from right to left through the card number using loops
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
//Reads the input as a integer instead            
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));

//Doubles every second digit
            if (alternate) {
                n *= 2;
//If the result is greater than 9, subtract 9
                if (n > 9) {
                    n -= 9;
                }
            }
//Adds the current digit to the sum
            sum += n;
//Determines if the digit should be doubled or not
            alternate = !alternate; 
        }

//The number is valid if the total sum is a multiple of 10
        return (sum % 10 == 0);
    }
//Method to check the type of credit card inputted
    public static String getCardType(String number) {
        if (number.startsWith("4")) return "Visa";
        if (number.startsWith("5")) return "MasterCard";
        if (number.startsWith("37")) return "American Express";
//If none is matched, this is the output
        return "Unknown type";
    }
//Adds spaces in between every four digits    
    public static String formatCardNumber(String number) {
//Replace every 4 characters with itself followed by a space
        return number.replaceAll("(.{4})", "$1 ").trim();
    }

//Create a Scanner object for input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//Input with specific instuctions on what type of format to type in
        System.out.print("Enter a credit card number in this format (XXXX-XXXX-XXXX-XXXX): ");
//Reads the user input
        String inputString = input.next();
//Removes dashes from the input for easier processing
        String cleanedInput = inputString.replace("-", ""); 

//Check if there is 16 digits
        if (cleanedInput.length() < 16) {
            System.out.println("Invalid input: Must be at least 16 digits long.");
//Exit if invalid
            return; 
        }
//Check if the card number is valid
        boolean isValid = isValidCreditCard(cleanedInput);
//Get the card type based on the prefix
        String cardType = getCardType(cleanedInput);

//Print the results
        System.out.println("Card type: " + cardType);
        System.out.println("Number of digits: " + cleanedInput.length());
        System.out.println("The card " + formatCardNumber(cleanedInput) + " is " + (isValid ? "valid." : "invalid."));
    }
}






