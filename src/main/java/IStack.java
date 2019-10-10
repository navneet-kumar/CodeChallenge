public final class IStack<T> implements Stack<T> {
    private final T head;
    private final IStack<T> tail;

    private IStack(T head, IStack<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public final static Stack getEmptyStack() {
        return EmptyStack.getInstance();
    }


    @Override
    public Stack<T> push(T t) {
        return new IStack<T>(t, this);
    }

    @Override
    public final Stack<T> pop() {
        return tail;
    }

    @Override
    public final T head() {
        return head;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    /**
     * Represents an empty stack. This is a singleton.
     *
     * @param <T>
     * @author asifiqbal
     */
    private static final class EmptyStack<T> implements Stack<T> {

        private final static Stack EMPTY = new EmptyStack();

        public final static Stack getInstance() {
            return EMPTY;
        }

        @Override
        public Stack<T> push(T t) {
            return new IStack<T>(t, null);
        }

        @Override
        public final Stack<T> pop() {
            throw new UnsupportedOperationException("Stack is empty.");
        }

        @Override
        public final T head() {
            throw new UnsupportedOperationException("Stack is empty.");
        }

        @Override
        public final boolean isEmpty() {
            return true;
        }
    }
}
