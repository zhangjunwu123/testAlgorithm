package 数组与字符串;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 已解答
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
 * 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * 示例 2：
 *
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 * 解释：需要合并 [1] 和 [] 。
 * 合并结果是 [1] 。
 * 示例 3：
 *
 * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
 * 输出：[1]
 * 解释：需要合并的数组是 [] 和 [1] 。
 * 合并结果是 [1] 。
 * 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
 * */
public class 合并两个有序数组 {

    public static void main(String[] args) {

    }
    /**
     * 利用API Arrays.sort
     * 先将nums2放入nums1的尾部
     * 此方法没有利用已有序的特点
     * */
    public void merge1(int[] nums1,int m, int[] nums2,int n){
        //1.将nums2的元素放入nums1的尾部
        //nums1尾部元素是m-1,放入的第一个元素= m-1 + i +1 = m +i
        for(int i=0; i< n; i++){
            nums1[m+i] = nums2[i];
        }
        //2。利用API进行排序
        Arrays.sort(nums1);
    }

    /**
     * 有序数组，利用双指针比较最左边元素插入新数组
     * */
    public void merge2(int[] nums1,int m, int[] nums2,int n){
        int p1=0,p2=0,sorted[]=new int[m+n];
        int cur = 0;
        while(p1 < m || p2 < n){
            //取两个数组从左边数的最小值
            if(p1 == m){
                cur = nums2[p2++];
            }else if(p2 == n){
                cur = nums1[p1++];
            }else if(nums1[p1] < nums2[p2]){
                cur = nums1[p1++];
            }else {
                cur = nums2[p2++];
            }
            //放入sorted数组中
            sorted[p1 + p2 -1] = cur;
        }

        for(int i=0; i <m + n; i++){
            nums1[i] = sorted[i];
        }

    }


}
