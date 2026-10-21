package src;

import java.util.regex.Pattern;

public class RegexValidator {

//    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-z0-9._%+-]+@native\\.semicolon\\.africa$");

    public static boolean isEmailValid(String email) {

        if(email == null) return false;

        String regex = "^[a-z]\\.[a-z]+@native\\.semicolon\\.africa$";

//        Matcher matcher = EMAIL_PATTERN.matcher(email);

        return email.matches(regex);
    }

    public static boolean isPasswordValid(String password) {
        if(password == null) return false;

        String regex = "(?=.*[@#_+.])(?=.*\\d)[A-Za-z0-9@#_+.]{8,16}$";

        return password.matches(regex);
    }

}


