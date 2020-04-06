public class ArrayQueueDriver
{
    public static void main(String[] args) {
	ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
	System.out.println("Print the queue.");
	System.out.println(queue.toString());
	System.out.println("Is the queue empty?");
	System.out.println(queue.isEmpty());
	System.out.println("What is the size of the queue?");
	System.out.println(queue.size());
	System.out.println("Enqueue 1, 2, and 3.");
	queue.enqueue(new Integer(1));
	queue.enqueue(new Integer(2));
	queue.enqueue(new Integer(3));
	System.out.println("Print the queue.");
	System.out.println(queue.toString());
	System.out.println("Is the queue empty?");
	System.out.println(queue.isEmpty());
	System.out.println("What is the size of the queue?");
	System.out.println(queue.size());
	System.out.println("Dequeue the frontmost element.");
	System.out.println(queue.dequeue());
	System.out.println("What is the frontmost element?");
	System.out.println(queue.front());
	System.out.println("Print the queue.");
	System.out.println(queue.toString());
	System.out.println("Is the queue empty?");
	System.out.println(queue.isEmpty());
	System.out.println("What is the size of the queue?");
	System.out.println(queue.size());
	
    }

}
