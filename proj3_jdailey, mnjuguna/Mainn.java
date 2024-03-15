import java.util.Scanner;

/**
 * the class contains the main method that is resposible 
 * for reading the expression from the user
 * and calling the calculate postfix  method
 * to evaluate 
 */

public class Mainn {

  /**
  * Prints out the commanad lines
  * PostFix expression
  * and the results 
  */  
 
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System .out.println("This is a postfix calculator");
   System.out.println("Enter an expression");
   String expression = input.nextLine();

   System.out.println(expression);
   System.out.println(calculatePostfix(expression));
 }
 


 /**
  * Calculates the answer to the postfix expression and return the result as a Number.
  * @param expression a String of the postfix expression to be evaluated.
  * if character is an operand- pushed onto the stack
  * character operator, top two opearands popped off
  * operator is applied to them
  * @return the result of the postfix expression as a Number at the top of the stack.
  */
 public static int calculatePostfix(String expression) {

  //create a stack
   Stack2 stack = new Stack2();

   // Scan all characters one by one 
   for (int i = 0; i < expression.length(); i++) {
     char c = expression.charAt(i);

     // If the scanned character is an operand (number here), 
            // push it to the stack. 
     if (Character.isDigit(c)) {
       stack.push(c - '0');

       //  If the scanned character is an operator, pop two
            // elements from stack apply the operator 
     } else {
       int a = stack.pop();
       int b = stack.pop();
       switch(c) {
         case '+':
           stack.push(a + b);
           break;
         case '-':
           stack.push(b - a);
           break;
         case '*':
           stack.push(a * b);
           break;
         case '/':
           stack.push(b / a);
           break;
       }
     }
   }
   return stack.pop();
 }
}