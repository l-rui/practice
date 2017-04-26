package practice.algorithm;

import java.util.Arrays;

/**
 * Created by l-rui on 2017/4/26.
 */
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        int ret = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                ret++;
                i++;
                j++;
            }else if (g[i] > s[j]) {
                j++;
            }
        }
        return ret;
    }

}
