public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String password) {
        String hashedPassword = "";
        for (char character : password.toCharArray()) {
            switch (character) {
                case 'a', 'A' -> hashedPassword += 4;
                case 'e', 'E' -> hashedPassword += 3;
                case 'i', 'I' -> hashedPassword += 1;
                case 'o', 'O' -> hashedPassword += 0;
                case 'u', 'U' -> hashedPassword += 9;
                default -> hashedPassword += character;
            }
        }
        return hashedPassword;
    }

    public static boolean checkPassword(String password, String hashedPassword) {
        return hashedPassword.equals(hashPassword(password));
    }
}

