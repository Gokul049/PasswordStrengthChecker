# Password Strength Checker
The program checks whether a user-entered password is strong or weak based on common security rules.

# How It Works
---
Takes input from the user (Scanner) as the password.

Validates strength using the method isStrengthPassword(String password):

Password must be at least 8 characters long.

Must contain at least one uppercase letter.

Must contain at least one lowercase letter.

Must contain at least one digit (0–9).

Must contain at least one special character (anything not a letter or digit).
---
# Program
```python
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
```
# output
<img width="1920" height="1080" alt="Screenshot 2025-08-21 122404" src="https://github.com/user-attachments/assets/edd782da-8d0a-4fa6-90aa-c528aba30fcd" />


