import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password");
        String password = sc.nextLine();

        boolean hasLetter = false;
        boolean hasDigits = false;
        boolean hasSpecials = false;

        for(char ch: password.toCharArray()){
            if(Character.isLetter(ch)){
                hasLetter = true;
            }
            else if(Character.isDigit(ch)){
                hasDigits = true;
            }
            else{
                hasSpecials = true;
            }
        }
        if(password.length()<=6){
            System.out.println("Weak");
        }
        else if(password.length()>=8 && hasLetter && hasDigits && hasSpecials){
            System.out.println("Strong");
        }
        else{
            System.out.println("medium");
        }
    }
}
