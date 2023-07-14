public class HrAndMin {
    public static void main(String[] args) {

        System.out.println( minHrDiff(12,45));

    }
    public static double minHrDiff(int hr, double min){
        double hours = (hr%12 + min/60)*30;

        double mins = min*6;

        double angle = Math.abs(hours-mins);

        return angle>180?360-angle:angle;
    }
}
