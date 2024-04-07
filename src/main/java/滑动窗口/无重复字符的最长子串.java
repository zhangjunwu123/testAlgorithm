package 滑动窗口;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * 中等
 * 相关标签
 * 相关企业
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长
 * 子串
 *  的长度。
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 * */
public class 无重复字符的最长子串 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    /**
     * 窗口是一个索引区间，不局限与数组还是set
     * 阈值是重复
     * */
    static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>(n);
        int right=-1,ans=0;
        for(int left=0; left< n; left++){
            if(left != 0){//第一次直接放入set，后面每进行一次迭代都吧上一个元素删除，即左索引右移
                set.remove(s.charAt(left-1));
            }
            //对于元素i，它右边的元素只要不重复就一直放入窗口
            while(right+1 < n && !set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            //上面while循环结束，代表着右边碰到了循环元素，此时此次得到的最长不重复字串长度就是窗口长度  right - i +1
            ans = Math.max(ans, right -left + 1);
        }
        return ans;
    }



}
