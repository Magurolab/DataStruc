import java.util.ArrayList;

/**
 * Created by poon. on 5/13/2017 AD.
 */
public class AllPerm {
    public static void main(String[] args) {
        int[] arr = new int[3];
        genPerm(3, 0, arr);

    }

    public static void printAllperm() {// stupid version

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    if (j != k && i != j && i != k) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.println();
                    }
                }


            }

        }

    }

    public static void genPerm(int N, int k, int[] arrSofar) {
        if (k == N) {
            for (int i = 0; i < arrSofar.length; i++) {
                System.out.print(arrSofar[i]);
            }
            System.out.println();

        } else {

            for (int i = 1; i <= N; i++) {
                boolean exit = false;
//
//                for (int j = 0; j < k; j++) {
//
//                    if (arrSofar[j] == i) {
//                        exit = true;
//                        break;
//                    }
//
//
//                }

//                if (!exit) {
                    arrSofar[k] = i;
                    genPerm(N, k + 1, arrSofar);

//                }


            }
        }

    }
}





