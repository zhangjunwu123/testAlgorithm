package 链表;

import java.util.HashSet;
import java.util.Set;
/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * 图示两个链表在节点 c1 开始相交：
 * 题目数据 保证 整个链式结构中不存在环。
 * 注意，函数返回结果后，链表必须 保持其原始结构
 * */
public class 判断两个链表相交 {

    /**
     * 使用HashSet来判断相交
     * */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB){
        Set<ListNode> set = new HashSet<>();
        if(headA != null && headB != null){
            ListNode nodeA = headA;
            while(nodeA != null){
                set.add(nodeA);
                nodeA = nodeA.next;
            }
            ListNode nodeB = headB;
            while(nodeB != null){
                if(set.contains(nodeB)){
                    return nodeB;
                }
                nodeB = nodeB.next;
            }
        }

        return null;
    }


}
