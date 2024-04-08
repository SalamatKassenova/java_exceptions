import java.util.Scanner;


/**
 * dz2
 */
public class dz2 {

    public static void main(String[] args) {
        double UserFloat = requestFloatInput();
        System.out.println(UserFloat);
    }

    public static double requestFloatInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input float: ");
        while (true) {
            try {
                String userInput = scanner.nextLine();
                double input = Double.parseDouble(userInput); 
                return input;
            } catch (NumberFormatException e){
                System.out.println("Your inpust should be float, try again: ");
                //scanner.next();
            }

        }
    }
}