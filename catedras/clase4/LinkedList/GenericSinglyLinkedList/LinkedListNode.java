package GenericSinglyLinkedList;

public class LinkedListNode<T> {
    public T value;
    public LinkedListNode<T> next;

    LinkedListNode(T value) {
        this.value = value;
    }

    LinkedListNode(T value, LinkedListNode<T> next) {
        this.value = value;
        this.next = next;
    }
}
