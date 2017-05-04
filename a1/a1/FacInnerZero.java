import java.math.BigInteger;

/**
 * Created by poon. on 5/2/2017 AD.
 */
public class FacInnerZero {
    public static void main(String[] args) {
        int test = zeroInsideFac(1024);
        System.out.println(test);
    }
    public static int zeroInsideFac(int n){
        int count = 0;
        boolean seen = false;
        String num = fac(n).toString();
        for (int i = num.length()-1; i >= 0; i--) {
            if (num.charAt(i) != '0')
                seen = true;
            else if(seen && num.charAt(i) == '0'){
                count++;
            }
        }

        return count;
    }
    public static BigInteger fac(int n){
        BigInteger ans,temp;
        if (n == 0){
            ans = new BigInteger("1");
            return ans;
        }
        ans = new BigInteger(Integer.toString(n));
        for (int i = 1; i < n; i++) {
            temp = new BigInteger(Integer.toString(i));
            ans = ans.multiply(temp);
        }
        return ans;
    }
}
