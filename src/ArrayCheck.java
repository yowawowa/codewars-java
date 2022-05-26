// check if array contains obj x
public class ArrayCheck {
    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (o == x) {
                return true;
            }
        }
        return false;
    }
}
