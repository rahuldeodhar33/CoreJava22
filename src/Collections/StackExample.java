package Collections;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(4);
		stk.push(2);
		stk.push(6);
		stk.push(12);
		//Use pop to remove the last element
		stk.pop();
		//use push to add the element at last
		stk.push(0);
		
		System.out.println(stk);
		System.out.println("Last element is " + stk.peek());
		//firstElemet is function of vector parent class and 
		//can be use to print 1st element from stack
		System.out.println("First element is " + stk.firstElement());
		
	}

}
