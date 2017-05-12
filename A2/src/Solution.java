import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int K = Integer.parseInt(in.readLine());
        int[] list = new int[N];

        for(int i = 0; i < N; i ++)
            list[i] = Integer.parseInt(in.readLine());
        Arrays.sort(list);

      /*
       * Write your code here, to process numPackets N, numKids K, and the packets of candies
       * Compute the ideal value for unfairness over here
      */
        System.out.println(find(list,K));


    }

    public static int find(int[] arr, int k){
        int unf = Integer.MAX_VALUE;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if(i+k-1 >= arr.length)
                break;
            temp = arr[i+k-1]-arr[i];
            if(unf > temp)
                unf = temp;

        }
        return unf;
    }
}

