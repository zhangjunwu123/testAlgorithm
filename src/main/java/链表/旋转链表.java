package 链表;
/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * 示例 1：
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 *
 * 输入：head = [0,1,2], k = 4
 * 输出：[2,0,1]
 * */
public class 旋转链表 {

    public static void main(String[] args) {
        ListNode curr = new ListNode(1);
        curr.next = new ListNode(2);
        curr.next.next = new ListNode(3);
        curr.next.next.next = new ListNode(4);
        curr.next.next.next.next = new ListNode(5);
        rotateListNode(curr, 2);
    }


    static ListNode  rotateListNode(ListNode head, int k){
        if(head == null || head.next == null || k == 0){
            return head;
        }
        //1.计算链表的长度
        ListNode curr = head;
        ListNode tail = null;
        int n = 0;
        while(curr != null){
            if(curr.next == null){
                tail = curr;
            }
            curr = curr.next;
            n++;

        }
        //将链表成环
        tail.next = head;

        //2.计算分段点 位置 = n - n%k
        int move = n - k%n;
        if(move == n){
            return head;
        }
        ListNode split = head;
        //注意这里，因为头节点之后开始算1个，所以少一步
        for(int i=1; i < move; i++){
            split = split.next;
        }
        //分段点的下一个节点就是新的头节点
        ListNode headNew = split.next;
        //将分段点的next置为null，代表变成尾部节点
        split.next = null;
        return headNew;
    }
}
