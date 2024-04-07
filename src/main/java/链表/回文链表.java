package 链表;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为
 * 回文链表
 * 。如果是，返回 true ；否则，返回 false 。
 * 示例 1：
 * 输入：head = [1,2,2,1]
 * 输出：true
 * 示例 2：
 * 输入：head = [1,2]
 * 输出：false
 * */
public class 回文链表 {

    /**
     * 回文字串，回文问题就是利用数组的双指针
     * */
    public boolean checkPalindrome(ListNode head){
        List<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }
        int right = 0;
        int left = arr.size() -1;
        while(right < left){
            if(arr.get(right) != arr.get(left)){
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}
