public class ShortestWord {

    public static int findShort(String s) {
        String[] string = s.split(" ");
        String shortest = string[0];
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() < shortest.length()) {
                shortest = string[i];
            }
        }
        return shortest.length();
    }
}

