import java.util.Random;

public class RandomPerm {
    public static void main(String[] args) {
        int[] arr = {100000,200000,400000,800000,1600000,3200000,6400000};

        int n ;
        for (int i = 0; i < arr.length; i++) {
            n = (50/(i+1));
            long startTime = System.nanoTime();
            for (int j = 0; j < n ; j++) {



                // insert here what you need to time
                int[] ok = mkPerm(arr[i]);



            }
            long endTime = System.nanoTime();
            System.out.println(((endTime - startTime) / 1e6 )/n +",");

        }
    }


    static void swp(int[] arr, int i, int j) {

        int tmp=arr[i]; arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static int[] mkPerm(int n) {
        int[] perm = new int[n]; // theta(n)
        Random rng = new Random();// O(1) = C

        for (int i=0;i<n;i++)//O(n)
            perm[i] = i+1;//c

        for (int i=0;i<n;i++) {// O(n)
            int t = rng.nextInt(i+1);//O(1) = C
            if (i!=t) {
                swp(perm, t, i); // C
            }
        }
        return perm;
    }



}