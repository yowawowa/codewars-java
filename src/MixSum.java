import java.util.List;

//Returns a sum of all value no matter the type (in this case Integer and String)
public class MixSum {
    public int sum(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed) {
            if (element instanceof Integer) {
                sum += (Integer) element;
            } else if (element instanceof String) {
                sum += Integer.parseInt((String) element);
            }
        }
        return sum;
    }


//   public int sumAdvanced(List<?> mixed) {
//        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
//    }
//
}