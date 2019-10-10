public class Main {
    public static void main(String[] args) {
        Queue<String> q = IQueue.getInstance();

        q = q.enQueue("This");
        System.out.println(q);

        q = q.enQueue("is");
        System.out.println(q);

        q = q.enQueue("immutable");
        System.out.println(q);

        q = q.enQueue("Queue");
        System.out.println(q);

        q = q.enQueue(null);
        System.out.println(q);

        System.out.println(q.head());

        q = q.deQueue();
        System.out.println(q);

        q = q.deQueue();
        System.out.println(q);

        q = q.deQueue();
        System.out.println(q);

        q = q.deQueue();
        System.out.println(q);

        System.out.println("Is queue empty ? " + q.isEmpty());

        q = q.deQueue();
        System.out.println(q);
        System.out.println("Is queue empty ? " + q.isEmpty());
    }
}
