public interface Stack<T> {
    /**
     * @param t
     * @return
     */
    public Stack<T> push(T t);

    /**
     * @return
     */
    public Stack<T> pop();

    /**
     * @return
     */
    public T head();

    /**
     * @return
     */
    public boolean isEmpty();
}