import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int mid = 49;
        int c = 1;
        int loop = mid;
        for (int i = 2; i <= 9 ; i++) {
            while (loop > 1) {
                c += 1;
                loop = loop / i;
            }
            loop = mid;
        }
        System.out.println(c);


    }
}
