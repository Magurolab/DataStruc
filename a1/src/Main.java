import java.util.Arrays;

/**
 * Created by poon. on 4/29/2017 AD.
 */
public class Main {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 5, 4};// should get false
        int[] arr_in = {8,6,3,2,9,5,4,1,7};// should get true
        int[] wtf = {3,1,2};

        int[] arr = jarvis(test1);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }

    public static int[] move(int[] arr, int pos1, int pos2, int pos3) {

        int slot = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = arr[pos3];
        arr[pos3] = slot;

        return arr;

    }

    public static int[] forward(int[] arr_in) {
        int n = arr_in.length - 3;
        int[] arr = arr_in;

        for (int i = 0; i < n; i++) {

            while (arr[i + 2] < arr[i] || arr[i + 2] < arr[i + 1]) {
                arr = move(arr, i, i + 1, i + 2);
            }

        }
        return arr;
    }

    public static int[] backward(int[] arr_in) {
        int n = arr_in.length - 1;
        int[] arr = arr_in;

        for (int i = n; i > 1; i--) {
            while (arr[i] < arr[i - 1] || arr[i] < arr[i - 2]) {
                arr = move(arr, i - 2, i - 1, i);
            }
        }
        return arr;
    }

    public static int[] jarvis(int arr_in[]){
            int[] arr = arr_in;
            boolean case1, case2, case3;

            while (arr[0] + arr[1] + arr[2] != 6 || !isSorted(Arrays.copyOfRange(arr, 3, arr.length))) {
                arr = forward(arr);
                arr = backward(arr);
            }
            case1 = arr[0] == 1 && arr[1] == 3 && arr[2] == 2;
            case2 = arr[0] == 3 && arr[1] == 2 && arr[2] == 1;
            case3 = arr[0] == 2 && arr[1] == 1 && arr[2] == 3;

            if(case1 || case2 || case3 || (!isSorted(arr) && arr.length != 3)) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        return arr;
    }
    
    public static boolean isSorted(int[]arr_in){
        int n = arr_in.length -1;
        for (int i = 0; i < n ; i++) {
            if(arr_in[i]>arr_in[i+1])
                return false;
        }
        return true;
    }
}
