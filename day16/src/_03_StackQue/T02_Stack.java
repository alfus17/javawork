package _03_StackQue;

import java.util.Stack;

class Money {
	private int value;
	
	public Money(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Money [value=" + value + "]";
	}
	
	
}

public class T02_Stack {

	public static void main(String[] args) {
		Stack<Money> monStack = new Stack<Money>();
		
		monStack.push(new Money(10000));
		monStack.push(new Money(5000));
		monStack.push(new Money(30));
		monStack.push(new Money(400));
		monStack.push(new Money(1000));
		
		System.out.println("스택의 크기 : "+ monStack.size());
		
		while (!monStack.isEmpty()) {
			Money mon = monStack.pop();
			System.out.println(mon);
		}
	}

}
