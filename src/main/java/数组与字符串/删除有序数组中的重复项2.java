package 数组与字符串;
/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 示例 1：
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前七个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
 * */
public class 删除有序数组中的重复项2 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDulplicates(nums));
        System.out.println(nums);
    }

    /**
    * 使用双指针
    * */
    static int removeDulplicates(int[] nums){
        int n = nums.length;
        if(n <=2){
            return n;
        }
        //快慢指针从第三个元素开始遍历
        int slow=2,fast=2;
        while(fast < n){
            if(nums[slow-2] != nums[fast]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
