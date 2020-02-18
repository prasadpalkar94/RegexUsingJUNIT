import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    final static String NAME="^[A-Z]{1}[A-Za-z]{3,}$";
    final static String EMAIL="^[a-zA-Z]*[-./+]?[0-9]*[@]{1}[a-z0-9]{3,}[.]{1}[a-z]{2,3}$";
    final static String MOBILENO="^[0-9]{2}[[:space:]]{1}[0-9]{10}$";
    final static String PASSWORD="^[0-9a-zA-Z@#$&-_]{8,}$";
    public static boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public static boolean checkLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }


    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean checkContactNo(String mobileNo) {
        Pattern pattern = Pattern.compile(MOBILENO);
        Matcher matcher = pattern.matcher(mobileNo);
        return matcher.matches();
    }

    public static boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }


}
