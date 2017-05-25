import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        Collections.sort(arr);
        int lastindex = arr.size() -1 ;
//        System.out.println(arr.toString());
        ArrayList<Integer> Ans = new ArrayList<>();
        solve(lastindex, k, arr, Ans );
//        System.out.println(Ans.toString());

        if (Ans.size() == 0)
            System.out.print(-1);
        else{
            int temp =1;
            System.out.printf("%d ",temp);
            for (int i = Ans.size()-1; i >= 0 ; i--) {
                temp *= Ans.get(i);
                System.out.printf("%d ",temp);

            }



            }
        }



    public static void solve(int lastIndex, int k, ArrayList<Integer> arr, ArrayList<Integer> ans) {

        if(k == 1){
//            System.out.println("HEllO world");
        }
        else if(lastIndex == 0 && k%arr.get(lastIndex) != 0 ){
            ans.clear();
            return;
        }
        else{
            int max = arr.get(lastIndex);
            if(k % max == 0){
                k = k/max;
                ans.add(max);
                solve(lastIndex, k, arr, ans);
            }
            else {
                solve(lastIndex-1, k, arr, ans);
            }

        }










        }





        }



