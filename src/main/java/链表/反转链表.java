package 链表;
/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * 示例 1：
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * */
public class 反转链表 {

    /**
     * 依次改变每个节点的指针方向
     *
     *
     * */
    public ListNode reverseListNode(ListNode head){
        ListNode prev = null;//反转链表需要null的模拟头前节点
        ListNode curr = head;
        while(curr != null){
            //next后面的先保存不动,下一次遍历使用
            ListNode next = curr.next;
            //把当前元素的next指针反转，其实每次只是把指针方向反转这么一步
            curr.next = prev;
            //为下一次遍历准备
            prev = curr;//下一次遍历的前节点就是当前节点
            curr = next;//迭代条件
        }
        return prev;
    }
}
