package practice.algorithm;

/**
 * Created by l-rui on 2017/3/10.
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.Find the median of the two sorted arrays.
 * 有两个已经排好序的数组nums1和nums2，长度分别为m和n，找出两个排序数组的中位数。
 * 思路：
 * 1、在两个排序数组中查找中位数，其实就是要找出两个数组组合起来之后的第k=(m+n)/2个元素；
 * 2、每个数组设置一个偏移量，每次都比较数组中第 offset+k/2-1 个元素；
 * 3、如果num1 < num2，则将nums1的offset挪动k/2个位置，反之，则将挪动nums2的offset，且k-k/2；
 * 4、边界值：
 * (1).当某一数组的offset大于数组长度时，返回另外一个数组中第(offset+k-1)个值；
 * (2).如果k为1，返回两个数组当前offset对应值中小的一个；
 */
public class MedianOf2SortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;

        int m = nums2.length;

        if ((n + m) % 2 == 0) {
            return (find(nums1, nums2, 0, 0, (n + m) / 2) + find(nums1, nums2, 0, 0, (n + m) / 2 + 1)) / 2.0;
        } else {
            return find(nums1, nums2, 0, 0, (n + m) / 2 + 1);
        }
    }


    private double find(int[] nums1, int[] nums2, int offset1, int offset2, int k) {

        if (offset1 >= nums1.length) {
            return nums2[offset2 + k - 1];
        }
        if (offset2 >= nums2.length) {
            return nums1[offset1 + k - 1];
        }
        if (k == 1) {
            return nums1[offset1] < nums2[offset2] ? nums1[offset1] : nums2[offset2];
        }

        /**
         * 当某一个数组本次取值时的offset大于数组长度，则说明该数组的offset已经不需要在移动，所以直接给出int的最大值，
         * 使得接下来的判断中递归移动另一个数组的offset，直到满足上面三个退出条件中的一个，结束递归。
         */
        int num1 = offset1 + k / 2 - 1 < nums1.length ? nums1[offset1 + k / 2 - 1] : Integer.MAX_VALUE;
        int num2 = offset2 + k / 2 - 1 < nums2.length ? nums2[offset2 + k / 2 - 1] : Integer.MAX_VALUE;

        if (num1 < num2) {
            return find(nums1, nums2, offset1 + k / 2, offset2, k - k / 2);
        } else {
            return find(nums1, nums2, offset1, offset2 + k / 2, k - k / 2);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {2,3,4,5,6};
        MedianOf2SortedArrays mo2sa = new MedianOf2SortedArrays();
        System.out.println(mo2sa.findMedianSortedArrays(nums1, nums2));
    }

}
