
/**
 * satck implementation in java
 */
public class Stack2{
	private int[] intStack; //store elements of stack
	private int top; // represent top of the stack

	/**
	 * creating a stack
	 */

	public Stack2(){
		intStack = new int[100];
		top = 0;
	}


	/**
	 */

	public Stack2(int size){
		intStack = new int[size];
		top = 0;

	}


	/**
	 * Adds onto the top of the stack
	 */

	public void push(int c){
		intStack[top] = c; 
		top = top + 1; 
	}


	/**
	 * removes the top of the stack
	 * @return the top of the stack
	 */

	public int pop(){
		top = top - 1; 
		return intStack[top]; 
	}

	/**
	 * Checks what is on top of the stack
	 * @return the value of the top of the stack
	 */

	public int peek(){
		//System.out.println(top);
		// System.out.println(top);
		 // if(top > 0){
		 // 	return charStack[top - 1];
		 // }
		 // return '\u0000';
		if (isEmpty()) {
			return '\u0000';
			}
			return intStack[top - 1];

	}


	/**
	 * Checks if the stack is empty
	 * @return true if empty ,otherwise false
	 */

	public boolean isEmpty(){
		return top <= 0; 
	}


	/**
	 * @return integer size of the stack
	 */

	public int getSize(){
		return top; 
	}

	/*public static void main(String args[]){
		Stack stack = new Stack();
		String str = "abc";
		System.out.println(stack.isEmpty());
		stack.push(str.charAt(0));
		stack.push(str.charAt(1));
		stack.push(str.charAt(2));
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
	*/
	}






