package stacksAndQueues;

import java.util.LinkedList;

public class LinkedListStack<E> {
	private LinkedList<E> root;

	public LinkedListStack() {
		root = new LinkedList<E>();
	}

	public boolean empty() {
		return root.isEmpty();
	}

	public E peek() {
		if (empty())
			return null;
		return root.getFirst();
	}

	public E pop() {
		if (empty())
			return null;
		return root.removeLast();
	}

	public E push(E item) {
		root.add(item);
		return item;
	}
}
