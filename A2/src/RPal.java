import java.util.ArrayList;

/**
 * Created by poon. on 5/5/2017 AD.
 */
public class RPal {
    public static void main(String[] args) {
        int[] ys = {1,1, 2, 2, 4, 4, 6, 6, 10, 10, 14, 14, 20, 20, 26, 26, 36, 36, 46, 46, 60, 60,
                74, 74, 94, 94, 114, 114, 140, 140, 166, 166, 202, 202, 238, 238, 284, 284, 330,
                330, 390, 390, 450, 450, 524, 524, 598, 598, 692, 692, 786, 786, 900, 900, 1014, 1014,
                1154, 1154, 1294, 1294, 1460, 1460, 1626, 1626, 1828, 1828, 2030, 2030, 2268, 2268, 2506,
                2506, 2790, 2790, 3074, 3074, 3404, 3404, 3734, 3734, 4124, 4124, 4514, 4514, 4964, 4964, 5414,
                5414, 5938, 5938, 6462, 6462, 7060, 7060, 7658, 7658, 8350, 8350, 9042, 9042};

        long startTime = System.nanoTime(); // insert here what you need to time



        for (int i = 0; i <= 99  ; i++) {

            countRPal(i);
        }
        long endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime)/1e6 + " milliseconds");
    }
    public static int countRPal(int N){
        if (N <=1) return 1;
        else{
            return countRPal(N/2) + countRPal(N -2);54
        }
    }














}
