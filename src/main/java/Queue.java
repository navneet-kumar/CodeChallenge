public interface Queue<T> {

    /**
     * @param t
     * @return
     */
    public Queue<T> enQueue(T t);

    /**
     * Removes the element at the beginning of the immutable queue, and returns the new queue.
     *
     * @return
     */
    public Queue<T> deQueue();

    /**
     * @return
     */
    public T head();

    /**
     * @return
     */
    public boolean isEmpty();
}