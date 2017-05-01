package practice.algorithm;

/**
 * Created by l-rui on 2017/5/1.
 * For a web developer, it is very important to know how to design a web page's size. So, given a specific rectangular web page’s area,
 * your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
 * 1.The area of the rectangular web page you designed must equal to the given target area.
 * 2.The width W should not be larger than the length L, which means L >= W.
 * 3.The difference between length L and width W should be as small as possible.
 * 对于Web开发人员来说，了解如何设计网页的大小非常重要。 所以，给定一个特定的矩形网页区域，
 * 现在你的工作就是设计一个矩形的网页，其长度L和宽度W满足以下要求：
 * 1.您设计的矩形网页的面积必须等于给定的目标区域。
 * 2.宽度W不应大于长度L，这意味着L> = W。
 * 3.长度L和宽度W之间的差异应尽可能小。
 */
public class ConstructRectangle {

    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int w = 0;
        int l = 0;
        for(int i = 1;i <= (int)Math.sqrt(area);i++){
            if(area % i == 0){
                w = i;
                l = area / i;
            }
        }
        res[0] = l;
        res[1] = w;
        return res;
    }

}
