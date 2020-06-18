import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;


public class GuessGame {
    public static void main(String[] args) {
        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(6) + 1;
        System.out.println("Im thinking of a number between 1-10 \nCan you tell  me what it is?");
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            userInput = scanner.nextInt();

            if (userInput < randomNumber) {
                System.out.println("Your guess is to low");
            } else if (userInput > randomNumber) {
                System.out.println("Your guess is too high.");
            }

        } while (userInput != randomNumber);
        {
            System.out.println("You got it. Go again?");
        }
    }
}
