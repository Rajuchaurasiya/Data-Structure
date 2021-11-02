package Ds_presticws;

public class LinkedList {
	private Node head = null;
	public void insert(int data) {
		if(head==null) {
			head = new Node(data);
		}
		else {
			Node temp = head;
			while(temp.next!=null)temp=temp.next;
			temp.next = new Node(data);
		}
	}
	
	public void removeFromEnd() {
		if(head==null) {
			return;
		}
		else {
			if(head.next==null)head=null;
			Node temp = head;
			while(temp.next.next!=null)temp=temp.next;
			temp.next = null;
		}
	}

	@Override
	public String toString() {
		String str = "";
		if(head==null)return "";
		str = head.data+"";
		Node temp = head.next;
		while(temp!=null) {
			str = str + " ->"+temp.data;
			temp=temp.next;
		}
		return "["+str+"]";
	}
	
	
}

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next = null;
	}
}