import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormDetails {
    Scanner sc = new Scanner(System.in);
    Pattern p = Pattern.compile("[A-Z][a-z]*");
    void lastName(){

        System.out.println("Enter your last name:");
        String lastName = sc.next();
        Matcher m = p.matcher(lastName);
        if (m.find()) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
    }

}