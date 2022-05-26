public class MinMaxOfArray {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int[] minMax = new int[2];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        minMax[0] = min;
        minMax[1] = max;
        return minMax;
    }
}
