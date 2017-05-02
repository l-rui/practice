package practice.algorithm;

/**
 * Created by lirui on 2017/5/2.
 * You are a product manager and currently leading a team to develop a new product. Unfortunately,
 * the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * 您是产品经理，目前领导一个团队开发新产品。 不幸的是，最新版本的产品未能通过质量检查。
 * 由于每个版本是基于以前的版本开发的，所以在坏版本之后的所有版本也是不好的。
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int low=1, high=n;

        while(low<high) {
            int mid=low + (high-low)/2;
            if(isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean isBadVersion(int mid){
        return true;
    }
}
