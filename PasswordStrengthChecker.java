
import java.util.*;

public class PasswordStrengthChecker {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Password : ");
        String password = scan.nextLine();

        if(isStrengthPassword(password))
        {
            System.out.println("✅Strong Password!");
        }
        else {
            System.out.println("⚠ Weak Password! Strong password should have a length more than 8,capital,number and a symbol.");
        }
    }

    private static boolean isStrengthPassword(String password) {
        if(password.length()<8)
            return false;

        boolean hasCapital = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(char c : password.toCharArray())
        {
            if(c>='A' && c<='Z')
                hasCapital = true;
            else if(c>='a' && c<='z')
                hasLower = true;
            else if(c>='0' && c<='9')
                hasDigit = true;
            else
                hasSpecial = true;
        }
        return hasDigit && hasLower && hasCapital && hasSpecial;
    }

}
