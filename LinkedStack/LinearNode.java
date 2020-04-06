public class LinearNode<T>
{
    T element;
    LinearNode<T> next;

    public LinearNode() {
        element = null;
        next = null;
    }

    public LinearNode(T elem) {
        element = elem;
        next = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T elem) {
        element = elem;
    }

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext(LinearNode<T> node) {
        next = node;
    }

}
