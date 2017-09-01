/**
 * Created by jc428741 on 1/09/17.
 */
import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args){
        String password;
        boolean validPassword = false;
        while (!validPassword) {
            int lettersUpper=0;
            int lettersLower=0;
            int digits=0;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a password with at least 2 uppercase, 2 lowercase, and 2 digits >> ");
            password = in.nextLine();
            for(int i = 0; i < password.length(); i++){
                if(Character.isUpperCase(password.charAt(i)))
                    lettersUpper++;
                else if(Character.isLowerCase(password.charAt(i)))
                    lettersLower++;
                else if(Character.isDigit(password.charAt(i)))
                    digits++;
            }
            if (lettersUpper>=2 && lettersLower>=2 && digits>=2){
                validPassword=true;
                System.out.println("Password valid!");
            }

        }

    }
}
