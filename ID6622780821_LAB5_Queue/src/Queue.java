import org.w3c.dom.Node;

/**
 * A generic queue implementation using a singly linked list.
 *
 * @param <T> the type of elements stored in the queue
 */
public class Queue<T> {
    /** The underlying singly linked list for the queue. */
    SList<T> list = new SList<T>();

    /** Default constructor to initialize an empty queue. */
    Queue() {
    }

    /**
     * Enqueues an element into the queue.
     *
     * @param element the element to enqueue
     */
    void enqueue(T element) {
        // Exercise 1a
        list.addLast(element);
    }

    /**
     * Dequeues an element from the queue.
     *
     * @return the dequeued element
     */
    T dequeue() {

        return list.removeFirst(); // Exercise 1b
    }

    /**
     * Gets the element at the front of the queue without removing it.
     *
     * @return the element at the front of the queue
     */
    T queuefront() {
        return list.first.element; // Exercise 1c
    }

    /**
     * Gets the element at the rear of the queue without removing it.
     *
     * @return the element at the rear of the queue
     */
    T queuerear() {
        return list.last.element; // Exercise 1d
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Creates a copy of this queue.
     *
     * @return a new queue containing the same elements as this queue
     */
    Queue<T> copyQueue() { // Exercise 2
        Queue<T> Q2 = new Queue<T>();
        Queue<T> tmpQueue = new Queue<T>();
        T tmpValue;
        // Add your code here
        while(!list.isEmpty()){
            tmpValue = dequeue();
            Q2.enqueue(tmpValue);
            tmpQueue.enqueue(tmpValue);
        }
        while (!tmpQueue.isEmpty()){
            enqueue(tmpQueue.dequeue());
        }
        return Q2;
    }

    /**
     * Checks if this queue is identical to another queue in terms of content and
     * sequence.
     *
     * @param Q2 the queue to compare with
     * @return true if the queues are identical, false otherwise
     */
    boolean isIdentical(Queue<T> Q2) {
        Queue<T> tmpThis = copyQueue();
        Queue<T> tmpQ2 = Q2.copyQueue();
        while(!tmpThis.isEmpty()){
            if(tmpThis.dequeue()!= tmpQ2.dequeue()){
                return false;
            }

        }
        return true; // Exercise 3
    }

    /**
     * Prints the elements of the queue horizontally. Handles potential
     *
     */
    void printHorizontal() {
        SNode<T> walker = list.first;
        while (walker != null) {
            System.out.print(walker.element + " ");
            walker = walker.next;
        }

    }

    public int getSize() {
        return list.getSize();
    }


}