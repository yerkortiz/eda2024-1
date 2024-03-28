package GenericSinglyLinkedList;

public class GenericSinglyLinkedList<T> {
    LinkedListNode<T> head;

    // O(1)
    public void InsertFirst(T element) {
        LinkedListNode<T> temp = new LinkedListNode<T> (element);
        temp.next = head;
        this.head = temp;
    }

    //O(N)
    public void InsertLast(T element){
        LinkedListNode<T> temp = new LinkedListNode<T>(element);
        if (this.head == null) {
            this.head = temp;
            return;
        }

        LinkedListNode<T> aux = this.head;
        while(aux.next != null) {
            aux = aux.next;
        }
        aux.next = temp;
    }

    public void Print() {
        LinkedListNode<T> aux = this.head;
        while(aux != null) {
            System.out.println(aux.value);
            aux = aux.next;
        }
    }
}
