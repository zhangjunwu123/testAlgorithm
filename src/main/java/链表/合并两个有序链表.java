package 链表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * */
public class 合并两个有序链表 {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println(mergeTwoList1(list1, list2));
    }


    /**
     * 方法1：新链表存储比较两个链表得值，迭代法
     * */
    public static ListNode mergeTwoList1(ListNode list1, ListNode list2){
        //新建一个链表，使用头节点得前节点
        ListNode listNodeNew = new ListNode(-1);
        ListNode prevHead = listNodeNew;//暂存头节点
        //只有当两个链表都没遍历完得时候，循环才有意义，否认因为是有序链表，直接吧剩余部分添加到next中即可
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                listNodeNew.next = list1;
                list1 = list1.next;
            }else{
                listNodeNew.next = list2;
                list2 = list2.next;
            }
            listNodeNew = listNodeNew.next;
        }
        listNodeNew.next = list1==null? list2 : list1;

        return prevHead.next;
    }

    /**
     * 方法2：使用数组
     * */
//    public static ListNode mergeTwoList2(ListNode list1, ListNode list2){
//        if(list1 == null) return list2;
//        if(list2 == null) return list1;
//        List<Integer> list = new ArrayList<Integer>();
//        while(list1 != null){
//            list.add(list1.val);
//            list1 = list1.next;
//        }
//        while(list2 != null){
//            list.add(list2.val);
//            list2 = list2.next;
//        }
//        Object[] arr = list.toArray();
//        Arrays.sort(arr);
//        ListNode newList = new ListNode(arr[0]);
//        for(int j =1; j< arr.length; j++){
//            newList.next.val = arr[j];
//        }
//        return newList;
//    }
}
