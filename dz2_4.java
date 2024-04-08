import java.util.Scanner;

/**
 * dz2_4
 */
public class dz2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String userInput = scanner.nextLine();

        try {
            validateInput(userInput);
            System.out.println(userInput);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void validateInput(String input) throws EmptyStringException {
        if (input == null || input.trim().isEmpty()
        ){
            throw new EmptyStringException("Empty string is not allowed.");
        }
    }
}

class EmptyStringException extends Exception{
    public EmptyStringException(String message){
        super(message);
    }
}