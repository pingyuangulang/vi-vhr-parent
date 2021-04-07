package com.five.monkey.vi.vhr.common.utils.link.node;

/**
 * @author jim
 * @date 2021/4/7 16:20
 */
public class ListNode<T> {

	private T			data;

	private ListNode<T>	next;

	public ListNode() {
		this(null);
	}

	public ListNode(T data) {
		this(data, null);
	}

	public ListNode(T data, ListNode<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}
}
