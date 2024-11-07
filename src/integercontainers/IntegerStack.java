package integercontainers;
import java.util.ArrayList;

public class IntegerStack implements IStack<Integer> {
	
	private final ArrayList<Integer> stack = new ArrayList<>();
	
	public IntegerStack() {}

	@Override
	public void push(Integer i) {
		if(i == null){
			return;
		}
		stack.addFirst(i);
	}
	
	@Override
	public Integer pop() {
		if(stack.isEmpty()) {
			return null;
		}
		return stack.removeFirst();
	}
	
	@Override
	public Integer top() {
		if(stack.isEmpty()) {
			return null;
		}
		return stack.getFirst();
	}

	@Override
	public int size() {
		return stack.size();
	}

	@Override
	public boolean search(Integer i) {
		for(Integer integer : stack) {
			if(integer.intValue() == i) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		if(stack.isEmpty()) {
			return "Empty Stack";
		}
		return " " + stack;
	}
}
