package stacksAndQueues;

import java.util.ArrayList;

public class ArrayListStack<E> {
	private ArrayList<E> stack;
	private int top;

	public ArrayListStack() {
		stack = new ArrayList<E>();
		top = 0;
	}

	public boolean empty() {
		return stack.isEmpty();
	}

	public E peek() {
		if (empty())
			return null;
		return stack.get(top);
	}

	public E pop() {
		if (empty())
			return null;
		E element = stack.remove(top);
		top--;
		return element;
	}

	public E push(E item) {
		stack.add(item);
		top++;
		return item;
	}
}
