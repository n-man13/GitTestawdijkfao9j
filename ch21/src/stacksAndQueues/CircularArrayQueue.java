package stacksAndQueues;

public class CircularArrayQueue {
	public CircularArrayQueue(int capacity) {
		elements=new Object[capacity]; 
		head=0;
		tail=0;
		size = 0;
	}
	public void add(Object x) throws Exception {
		if(!isFull()){
			elements[tail]=x;
			if (tail==size)
				tail=0;
			else
				tail+=1;
		}
		else
			throw new IllegalStateException("No Space, NOOOOOOOOOBBBBBB");
	}
	public Object remove() {
		Object element = null;
		if(!isEmpty()){
			element=elements[head];
			elements[head]=null;
			if (head==size)
				head=0;
			else
				tail+=1;
		}
		return element;
		//returns just removed
	}
	public int size() {
		return size;
	}
	private boolean isEmpty(){
		return size==0;
	}
	private boolean isFull(){
		return elements[tail]==null;
	}
	private int head;
	private int tail;
	private int size;
	private Object[] elements;
}
