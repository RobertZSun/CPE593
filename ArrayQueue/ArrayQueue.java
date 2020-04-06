public class ArrayQueue<T> implements QueueADT<T>
{
    private T[] queue;
    private static final int DEFAULT_CAPACITY = 2;
    private int front, rear, count;
    private String queueString;

    public ArrayQueue() {
	this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayQueue(int initial_capacity) {
	queue = (T[])(new Object[initial_capacity]);
	front = rear = count = 0;
    }

    public void enqueue(T element) {
	if (size() == queue.length) {
	    expandCapacity();
	}
	queue[rear] = element;
	rear = (rear+1) % queue.length;
	count++;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
	T[] temp = (T[])(new Object[queue.length * 2]);
	for (int i=0; i<count; i++) {
	    temp[i] = queue[front];
	    front = (front+1) % queue.length;
	}
	queue = temp;
    front = 0;
    rear = count;
    }

    public T dequeue() {
	T result = queue[front];
	queue[front] = null;
    front = (front+1) % queue.length;
	count--;
	return result;
    }

    public T front() {
	return queue[front];
    }

    public boolean isEmpty() {
	return (count == 0);
    }

    public int size() {
	return count;
    }

    public String toString() {
	if (count == 0) {
	    return "[]";
	}
	queueString = "";
	int temp = front;
	for (int i=0; i<count; i++) {
    	    queueString += queue[temp] + " ";
	    temp = (temp+1) % queue.length;    
	}
    return queueString;
    }


}
