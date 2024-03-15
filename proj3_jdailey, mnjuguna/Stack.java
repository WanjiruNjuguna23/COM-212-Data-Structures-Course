/**
 * Stack class
 */ 

public class Stack{
	private char[] charStack; 
	private int top; 

	public Stack(){
		charStack = new char[100];
		top = 0;
	}

	public Stack(int size){
		charStack = new char[size];
		top = 0;

	}

	public void push(char c){
		charStack[top] = c; 
		top = top + 1; 
	}

	public char pop(){
		top = top - 1; 
		return charStack[top]; 
	}

	public char peek(){
		if (isEmpty()) {
			return '\u0000';
			}
			return charStack[top - 1];

	}

	public boolean isEmpty(){
		return top <= 0; 
	}

	public int getSize(){
		return top; 
	}
}






