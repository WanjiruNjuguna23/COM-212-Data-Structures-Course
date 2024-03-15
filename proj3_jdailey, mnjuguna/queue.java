
/**
 * Queue implementation in java
 * using linked list
 */

public class Queue<T> {
	
	//inner class for Linked List nodes
	class Node {
		T data;
		Node next;
		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	//pointers for head, tail
	private Node head;
	private Node tail;
	//size of the list
	private int size;
	
	/**
	 * add at the end of the list
	 */
	public void enqueue(T data) {
		Node node = new Node(data, null);
		if (isEmpty()) {
			//set as head and tail
			this.head = node;
			this.tail = node;
		} else {
			//add after tail, set as tail
			this.tail.next = node;
			this.tail = node;
		}
		//increment size
		size++;
	}

	/**
	 * show data at the front of the list
	 */
	public T peek() {
		if (isEmpty())
			return null;
		return this.head.data;
	}

	/**
	 * remove and return the front of the list
	 */
	public T dequeue() {
		if (isEmpty())
			return null;

		//get data
		T data = this.head.data;;

		//point head to the next node
		this.head = this.head.next;
		//list becomes empty, tail set to null
		if (this.head == null)
			this.tail = null;
		//decrement size
		size--;
		return data;
	}
	
	/**
	 * Checks whether queue is empty 
	 */
	public boolean isEmpty() {
		return size == 0;
	}


	/**
	 * test all the methods of Queue
	 */
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		
		for (int i=0; i<10; i++)
			q.enqueue(i);
		
		while (!q.isEmpty()) {
			System.out.println(q.peek() + " " + q.dequeue());
		}
		
	}

}
