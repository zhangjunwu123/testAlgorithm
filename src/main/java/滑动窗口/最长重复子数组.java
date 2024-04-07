package 滑动窗口;
/**
 *
 718. 最长重复子数组
 中等
 给两个整数数组 nums1 和 nums2 ，返回 两个数组中 公共的 、长度最长的子数组的长度 。
 示例 1：
 输入：nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
 输出：3
 解释：长度最长的公共子数组是 [3,2,1] 。
 示例 2：
 输入：nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
 输出：5
 提示：
 1 <= nums1.length, nums2.length <= 1000
 0 <= nums1[i], nums2[i] <= 100
 * */
public class 最长重复子数组 {
    public static void main(String[] args) {

    }
    static int findLongestRepeatLength(int[] nums1, int[] nums2){
        boolean isOneBigger = true;
        if(nums1.length < nums2.length){
            isOneBigger = false;
        }
        int left=0,right=0,ans=0;
        if(isOneBigger){//代表1号数组元素多
            for(int i=0; i< nums2.length; i++){

            }

        }
        return 0;
    }

}
