public class LinkedStackDriver
{
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        System.out.println("Print the stack");
        System.out.println(stack.toString());
        System.out.println("Is the stack empty?");
        System.out.println(stack.isEmpty());
        System.out.println("How many elements are on the stack?");
        System.out.println(stack.size());
        System.out.println("Add 1, 2, and 3 to the stack");
        stack.push(new Integer(1));
        stack.push(new Integer(2));
        stack.push(new Integer(3));
        System.out.println("Print the stack");
        System.out.println(stack.toString());
        System.out.println("Is the stack empty?");
        System.out.println(stack.isEmpty());
        System.out.println("How many elements are on the stack?");
        System.out.println(stack.size());
        System.out.println("Pop the topmost element off of the stack.");
        System.out.println(stack.pop());
        System.out.println("Peek at the topmost element");
        System.out.println(stack.peek());
        System.out.println("Print the stack");
        System.out.println(stack.toString());
        System.out.println("Is the stack empty?");
        System.out.println(stack.isEmpty());
        System.out.println("How many elements are on the stack?");
        System.out.println(stack.size());
        
    }
}
