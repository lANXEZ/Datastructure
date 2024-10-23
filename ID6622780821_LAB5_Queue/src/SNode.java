public class SNode<T> {
    /**
     * The data element stored in the node.
     */
    T element;

    /**
     * Reference to the next node in the linked list.
     */
    SNode<T> next;

    /**
     * Constructs a new node with the specified data element.
     *
     * @param element The data element to store in the node.
     */
    SNode(T element) {
        this.element = element;
        next = null;
    }

}