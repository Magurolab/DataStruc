/**
 * Created by poon. on 4/29/2017 AD.
 */
public class HalvingSum {
   
    public static double hsum(double[] X) {

        while (X.length>1){

            double[] Y = new double[X.length/2];

            for (int i = 0; i < X.length/2; i++) {

                Y[i] = X[2*i] + X[2*i+1];
            }

            X=Y;

        }
        return X[0];
    }
}

