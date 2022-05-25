public class PowersOfTwo {
    public static long[] powersOfTwo(int n){
        long list[] = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = 1L << i;
        }
        return list;
    }
}
