import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    final static String name="^[A-Z]{1}[A-Za-z]{3,}$";
    public static boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }



}
