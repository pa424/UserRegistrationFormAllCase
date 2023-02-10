import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormDetails {
    Scanner sc = new Scanner(System.in);
    Pattern p = Pattern.compile("[A-Z][a-z]*");
    Pattern p1 = Pattern.compile("abc[.][a-z]{3}@bl[.]co[.][a-z]{2}");
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
    void emailId()
    {
        System.out.println("Enter your email Id:");
        String emailId = sc.next();
        Matcher m = p1.matcher(emailId);
        if (m.find()) {
            System.out.println("Valid Email Id");
        } else {
            System.out.println("Invalid Email ID");
        }


    }

}