public interface QueueADT<T>
{
    public void enqueue(T element);

    public T dequeue();

    public T front();

    public boolean isEmpty();

    public int size();

    public String toString();

}
