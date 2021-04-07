package com.five.monkey.vi.vhr.common.utils.link;

import java.util.Objects;

import com.five.monkey.vi.vhr.common.utils.link.node.ListNode;

/**
 * @author jim
 * @date 2021/4/7 16:22
 */
public class LinkedListUtils {

	/**
	 * 获取环节点，不存在环时返回null
	 * @param head 单向链表头节点
	 * @return null或者环节点
	 */
	public static ListNode<?> circleNode(ListNode<?> head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if (fast == slow) {
				ListNode slow2 = head;
				while (slow2 != slow) {
					slow2 = slow2.getNext();
					slow = slow.getNext();
				}
				return slow2;
			}
		}
		return null;
	}

	/**
	 * 获取链表倒数第k个节点，如果链表长度小于k则返回null
	 * @param pHead 单向链表头节点
	 * @param k 数值。当k大于链表长度或小于等于0时，返回null
	 * @return null或者倒数第k个节点
	 */
	public static <T> ListNode<T> findKth(ListNode<T> pHead, int k) {
		ListNode<T> former = pHead;
		while (k > 0) {
			if (former == null) {
				return null;
			}
			former = former.getNext();
			k--;
		}
		ListNode<T> latter = pHead;
		while (former != null) {
			former = former.getNext();
			latter = latter.getNext();
		}
		return latter;
	}

	/**
	 * 将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序
	 * @param l1 链表1升序排列
	 * @param l2 链表2升序排列
	 * @return 升序排列的新链表头节点
	 */
	public static <T extends Comparable> ListNode<T> mergeTwoLists(ListNode<T> l1, ListNode<T> l2) {
		ListNode<T> head = new ListNode<>();
		ListNode<T> current = head;
		while (l1 != null && l2 != null) {
			if (l1.getData().compareTo(l2.getData()) <= 0) {
				current.setNext(l1);
				l1 = l1.getNext();
			} else {
				current.setNext(l2);
				l2 = l2.getNext();
			}
			current = current.getNext();
		}
		while (l1 != null) {
			current.setNext(l1);
			current = current.getNext();
			l1 = l1.getNext();
		}
		while (l2 != null) {
			current.setNext(l2);
			current = current.getNext();
			l2 = l2.getNext();
		}
		return head.getNext();
	}

	/**
	 * 给定一个链表，删除链表的倒数第n个节点并返回链表的头指针
	 * @param head 单向链表头节点
	 * @param n 数值。当n大于等于链表长度时，删除头节点；当n小于等于0时，不删除节点
	 * @return 删除之后的新链表的头指针，可能为null
	 */
	public static <T> ListNode<T> removeNthFromEnd(ListNode<T> head, int n) {
		ListNode<T> newHead = head;
		if (n > 0 && Objects.nonNull(head)) {
			ListNode<T> preNode = findKth(head, n + 1);
			if (Objects.nonNull(preNode) && Objects.nonNull(preNode.getNext())) {
				preNode.setNext(preNode.getNext().getNext());
			} else if (Objects.isNull(preNode)) {
				newHead = head.getNext();
			}
		}
		return newHead;
	}
}
