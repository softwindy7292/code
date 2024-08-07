package day_2024_08_07;

class IntLinkedList{
	int num;
	IntLinkedList link;
	
	public IntLinkedList(int num) {
		this.num = num;
	}
}

public class LinkedListMain {

	public static void main(String[] args) {
		IntLinkedList l1 = new IntLinkedList(1);
		IntLinkedList l2 = new IntLinkedList(1);
		IntLinkedList l3 = new IntLinkedList(1);
		
		l1.link = l2;
		l2.link = l3;
	}

}
