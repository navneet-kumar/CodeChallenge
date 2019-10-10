public class IQueue<T> implements Queue<T> {

    private final Stack<T> f;
    private final Stack<T> b;

    private IQueue(Stack<T> f, Stack<T> b) {
        if (f == null || f.isEmpty()) {
            f = IStack.getEmptyStack();
            while (b != null) {
                f = f.push(b.head());
                b = b.pop();
            }
        }
        this.f = f;
        this.b = b;
    }

    public static Queue getInstance() {
        return EmptyQueue.getInstance();
    }

    /**
     * @param t
     * @return
     */
    @Override
    public Queue<T> enQueue(T t) {
        return new IQueue<T>(f, b.push(t));
    }

    /**
     * Removes the element at the beginning of the immutable queue, and returns the new queue.
     *
     * @return
     */
    @Override
    public Queue<T> deQueue() {
        return new IQueue<T>(f.pop(), b);
    }

    /**
     * @return
     */
    @Override
    public T head() {
        return f.head();
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        return f.isEmpty();
    }

    private static final class EmptyQueue<T> implements Queue<T> {

        private final static EmptyQueue EMPTY = new EmptyQueue();

        private EmptyQueue() {
        }

        public static Queue getInstance() {
            return EMPTY;
        }

        /**
         * @param t
         * @return
         */
        @Override
        public Queue<T> enQueue(T t) {
            return new IQueue<T>(IStack.getEmptyStack().push(t), IStack.getEmptyStack());
        }

        /**
         * Removes the element at the beginning of the immutable queue, and returns the new queue.
         *
         * @return
         */
        @Override
        public Queue<T> deQueue() {
            throw new UnsupportedOperationException("Can not remove from an Empty Queue");
        }

        /**
         * @return
         */
        @Override
        public T head() {
            throw new UnsupportedOperationException("Queue is empty");
        }

        /**
         * @return
         */
        @Override
        public boolean isEmpty() {
            return true;
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            while (this.isEmpty()) {
                s.append(this.head()).append(" -> ");
            }
            return s.toString();
        }
    }
}
