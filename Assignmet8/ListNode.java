package itc155;

public class ListNode {
	public int data;
	public ListNode next;

// data stored in this node
// link to next node in the list
// post: constructs a node with data 0 and null link
	public ListNode() {
		this(0, null);
	}

// post: constructs a node with given data and null link
	public ListNode(int data) {
		this(data, null);
	}

// post: constructs a node with given data and given link
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;

	}
}