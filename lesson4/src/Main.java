public class Main {
    public static void main(String[] args) {
        double[] array1 = new double[]{1.55, 1.73, 1.86};
        double[] array2 = new double[]{1.78, 1,52, 1.97};
        System.out.println(pearson_correlation(array1, array2));
    }
    public static double pearson_correlation(double[] array1, double[] array2){
        int size = array1.length;
        double sx = 0;
        double sy = 0;
        double sxx = 0;
        double sxy = 0;
        double syy = 0;
        for (int i = 0; i < size; i++) {
            double w1 = array1[i];
            double w2 = array2[i];
            sx += w1;
            sy += w2;
            sxx += w1 * w1;
            syy += w2 * w2;
            sxy += w1 * w2;
        }
        //double cov = (sxy * size) - (sx * sy);
        //double sigmaX = Math.sqrt((sxx * size) - sx * sx);
        //double sigmaY = Math.sqrt((syy * size) - sy * sy);
        return sxy / Math.sqrt(sxx) * Math.sqrt(syy);
    }
}