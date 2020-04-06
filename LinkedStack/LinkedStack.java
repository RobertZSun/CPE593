public class LinkedStack<T> implements StackADT<T>
{
    private LinearNode<T> top;
    private int count;
    private String stackString;

    public LinkedStack() {
        top = null;
        count = 0;
    }

    public void push(T elem) {
        LinearNode<T> temp = new LinearNode<T>(elem);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public T pop() {
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    public T peek() {
        return top.getElement();
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int size() {
        return count;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        stackString = "";
        LinearNode<T> temp = top;
        while (temp != null) {
           stackString += temp.getElement() + " ";
           temp = temp.getNext();
        }
        return stackString;
    }
}
