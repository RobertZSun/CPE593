import java.util.Arrays;

public class ArrayStack<T> implements StackADT<T>
{
    private T[] stack;
    private int top;
    private static final int DEFAULT_SIZE = 2;
    private String stackString;

    public ArrayStack() {
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initial_size) {
        top = 0;
        stack = (T[])(new Object[initial_size]);
    }

    public void push(T element) {
        if (this.size() == stack.length) {
            expandCapacity();
        }
        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        T result = stack[top-1];
        stack[top-1] = null;
        top--;
        return result;
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        return stack[top-1];
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public int size() {
        return top;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        }
        stackString = "";
        for (int i=0; i<stack.length; i++) {
            if (stack[i] != null) {
                stackString += stack[i] + " ";
            }
        }
        return stackString;
    }

}
