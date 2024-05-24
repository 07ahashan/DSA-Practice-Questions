import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class EmailVerification {
        public static boolean isValidEmail(String email) {
            // Regular expression pattern for a valid email address
            String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            // Creating a Pattern object
            Pattern pattern = Pattern.compile(regex);

            // Creating a Matcher object
            Matcher matcher = pattern.matcher(email);

            // Returning true if the email matches the pattern, false otherwise
            return matcher.matches();
        }

        static void withoutRegeX()
        {
            int atSymbil=0;
            int dotSymbol=0;

            String email="test@example.com";
            char[] c=email.toCharArray();

            for(int i=0;i<c.length;i++) {
                if(c[i]==('@')){
                    atSymbil=i;
                }
                if(c[i]=='.')
                {
                    dotSymbol=i;
                }

            }
            if(atSymbil<1 || dotSymbol< atSymbil+2|| dotSymbol>=email.length()-1)
            {
                System.out.println("Invalid Email");
            }
            else {
                System.out.println("Valid Email");
            }
        }




        public static void main(String[] args) {
            // Test cases
            String[] emails = {"test@example.com", "invalid_email.com", "test123", "123@example.com", "ggi2021.2171@ggi.ac.in"};

//            int atSymbil=0;
//            int dotSymbol=0;
//            String email="123@example.com";
//
//            char[] c=email.toCharArray();
//
//            for(int i=0;i<c.length;i++) {
//                if(c[i]==('@')){
//                     atSymbil=i;
//                }
//                if(c[i]=='.')
//                {
//                    dotSymbol=i;
//                }
//
//            }
//            if(atSymbil<1 || dotSymbol< atSymbil+2|| dotSymbol>=email.length()-1)
//            {
//                System.out.println("Invalid Email");
//            }
//            else {
//                System.out.println("valid Email");
//            }

            for (String email : emails) {
                System.out.println(email + ": " + isValidEmail(email));
            }

            withoutRegeX();


        }
    }


