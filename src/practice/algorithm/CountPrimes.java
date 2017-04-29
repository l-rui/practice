package practice.algorithm;

/**
 * Created by l-rui on 2017/4/29.
 * Count the number of prime numbers less than a non-negative number, n.
 * 计算小于非负数的质数数，n。
 */
public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] a = new boolean[n];
        for(int i=2; i*i<n; i++) {
            if(!a[i]) {
                for(int j=i; i*j<n; j++) {
                    a[i*j] = true;
                }
            }
        }
        int c=0;
        for(int i=2; i<n; i++) {
            if(!a[i]) ++c;
        }
        return c;
    }

}
