import java.util.ArrayList;

/**
 * Created by poon. on 5/5/2017 AD.
 */
public class RPal {
    
    public static int countRPal(int N){
        if (N <=1) 
        	return 1;
        else{
            return countRPal(N/2) + countRPal(N -2); // 
        }
    }














}
