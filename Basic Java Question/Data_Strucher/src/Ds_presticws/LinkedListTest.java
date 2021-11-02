package Ds_presticws;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(5);
		linkedList.insert(10);
		linkedList.insert(2);
		linkedList.insert(6);
		linkedList.insert(-9);
		System.out.println(linkedList);
		linkedList.removeFromEnd();
		System.out.println(linkedList);
		linkedList.removeFromEnd();
		System.out.println(linkedList);
		linkedList.removeFromEnd();
		System.out.println(linkedList);
	}

}
