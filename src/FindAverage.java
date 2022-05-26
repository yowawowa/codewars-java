public class FindAverage {

    public static double find_average(int[] array){
        double total = 0;
        if (array.length == 0) {
            return 0;
        } else {
            for (int j : array) {
                total = total + j;
            }
            return  total/array.length;
        }
    }
}
