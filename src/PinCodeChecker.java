public class PinCodeChecker {

    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (pin.charAt(i) < '0' ||  pin.charAt(i) > '9') {
                    return false;
                }
            }
        } else return false;
        return true;
    }
}


