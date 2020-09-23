import java.lang.Math;
import java.text.DecimalFormat;
public class some {
    public static void main(String[] args) {
        int[] g = new int[14];
        double[] x = new double[20];
        double[][] d = new double[14][20];
        double k;
        int m = 16;
        double min = -7.0;

        double max = 11.0;
        for (int i = 0; i < 14; i++) {
            g[i] = m;
            m--;
        }
        
        for (int i = 0; i < x.length; i++) {
            x[i] = (double)(Math.random() * (max - min)) + min;
        }

        for (int i = 0; i < 14; i ++) {
            if (g[i] == 3){
                for (int j = 0; j < 20; j++) 
                    d[i][j] = Math.pow(Math.pow(4 * (0.75 - Math.log(Math.abs(x[j]))),Math.tan(x[j])),Math.log(3.0 / (4 + Math.abs(x[j]))));
            } else if (g[i] == 4 || g[i] == 5 || g[i] == 7 || g[i] == 8 || g[i] == 10 || g[i] == 11 || g[i] == 12) {
                for (int j = 0; j < 20; j++)
                    d[i][j] = Math.tan(Math.cos(Math.pow(x[j], 1.0 / 3)));
            } else 
                for (int j = 0; j < 20; j++)
                    d[i][j] = (Math.cos(Math.pow(2 * Math.asin((x[j] + 2) / 18),3)) - 0.75) / 2;
        }
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 20; j++) {
                k = d[i][j];
                String formattedDouble = new DecimalFormat("#0.000").format(k);
                System.out.print(formattedDouble + "\t");
            }
            System.out.println();
        }
    }
}
