public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) { // returns a grade from 3 reviews
        char result;
        int score = (s1 + s2 + s3) / 3;
        switch (score / 10) {
            case 6:
                result =  'D';
            break;
            case 7:
                result =  'C';
            break;
            case 8:
                result =  'B';
            break;
            case 9:
                result =  'A';
            break;
            case 10:
                result =  'A';
            break;
            default:
                result = 'F';
        }
        return result;
    }  
}


