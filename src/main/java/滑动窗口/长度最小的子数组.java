package 滑动窗口;
/**
 * 209. 长度最小的子数组
 * 中等
 * 相关标签
 * 相关企业
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其总和大于等于 target 的长度最小的 连续
 * 子数组
 *  [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * 示例 2：
 *
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * 示例 3：
 *
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 *
 * */
public class 长度最小的子数组 {

    /**
     * 暴力破解，双层遍历，O（n^2）
     * */
    public int minSubArrayLength1(int target, int[] arr){
        if(arr.length ==0){
            return 0;
        }
        int length = arr.length;
        int min = Integer.MAX_VALUE;
        //经典的双层遍历
        for(int i=0; i< length; i++){
            int sum = 0;//每次比较当前元素与其他元素组合，需要清零
            for(int j=i; j< length; j++){
                sum = sum + arr[j];
                if(sum >= target){
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }
        return min;
    }

    /**
     * 滑动窗口,O(n)
     * 这里窗口的阈值就是target
     * */
    public int minSubArrayLength2(int target, int[] nums){
        int length = nums.length;
        if(length ==0){
            return 0;
        }
        int start=0,end=0,sum=0;
        int ans = Integer.MAX_VALUE;
        while(end < length){//第一层：外层遍历就是一个全局的遍历
            sum = sum + nums[end];
            while(sum >= target){//第二层：阈值判断循环
                ans = Math.min(ans, end-start+1);
                sum = sum - nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE? 0 : ans;
    }


}
