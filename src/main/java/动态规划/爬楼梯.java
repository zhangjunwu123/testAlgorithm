package 动态规划;
/**
 * 70. 爬楼梯
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 *
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 解释：有两种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶
 * 2. 2 阶
 * 示例 2：
 *
 * 输入：n = 3
 * 输出：3
 * 解释：有三种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶 + 1 阶
 * 2. 1 阶 + 2 阶
 * 3. 2 阶 + 1 阶
 *
 * */
public class 爬楼梯 {

    /**
     * 应为每次只能爬1步或者2步，所以符合斐波那契数列
     * 但是这种递归的方式很容易超时
     * */
    public int climbStairs(int n){
        if(n <= 2){
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }


}
