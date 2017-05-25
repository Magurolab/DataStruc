import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by poon. on 5/13/2017 AD.
 */
public class Hello {

    public static void main(String[] args) {
        int[] t1 = {0};
        int[] t2 = {2, 2, 1};
        int[] t3 = {2, 2, 1, 1, 2, 2, 1};
        int[] t4 = new int[63];
        System.out.println(stepsRemaining(t3));

    }
    public static long F(int[] d, int f, int t, int a) {
        if (d.length == 1) {
            if (d[0] == f) {
                return 0;
            } else
                return 1;
        } else {
            if (d[d.length - 1] == f) {
                return F(Arrays.copyOfRange(d, 0, d.length - 1), f, a, t);
            } else
                {
                return ((long) 1 << (d.length - 1)) + F(Arrays.copyOfRange(d, 0, d.length - 1), a, t, f);
            }
        }
    }

    public static long stepsRemaining(int[] diskPos) {
        return (1 << diskPos.length) - 1 - F(diskPos, 0, 1, 2);
    }


//    public static long My_(int[] diskPos){
//
//        boolean[] found = {false};
//        long c = 0;
//        long[] lst_c ={c};
//        int[] s = new int[diskPos.length];
//        int n = diskPos.length;
//
//        My_solve_hanoi(lst_c,found,diskPos,s,n,0,1,2);
//         long totalsteps = (long)Math.pow(2,n) -1 ;
//
//
//        return lst_c[0] - totalsteps ;// because the code add one extra at the first time we find the postion.
//    }


//    public static void My_solve_hanoi(long[] count,boolean[] found,int[] diskPos,int[] stage,int n, int from_peg, int to_peg, int aux_peg) {
//
//        if(Arrays.equals(diskPos,stage))// when we find it
//            found[0] = true;
//
//        if (n == 1) {
//            if(!found[0]){
//                for (int i = 0; i < stage.length; i++) {
//                    if (stage[i] == from_peg) {// when we found it.
//                        stage[i] = to_peg;
//                        break;
//                    }
//                }
//
//                long c = count[0];
//                c+=1;
//                count[0] = c;
//            }
//
//        } else {
//
//            My_solve_hanoi(count,found,diskPos,stage, n - 1, from_peg, aux_peg, to_peg);
//
//            My_solve_hanoi(count,found,diskPos,stage, 1, from_peg, to_peg, aux_peg);
//
//            My_solve_hanoi(count,found,diskPos,stage, n - 1, aux_peg, to_peg, from_peg);
//
//
//
//        }
//    }
}
