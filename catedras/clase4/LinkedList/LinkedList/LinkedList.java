package LinkedList;

public class LinkedList {
    public class Node {
        int value;
        Node next;

        Node(int x) {
            this.value = x;
        }
    }
    
    Node head;

    public void InsertFirst(int x) {
        Node temp = new Node(x);
        temp.next = this.head;
        this.head = temp;
    }

    public void InsertLast(int x) {
        Node temp = new Node(x);

        if (this.head == null) {
            this.head = temp;
            return;
        }

        Node aux = this.head;
        while(aux.next != null) {
            aux = aux.next;
        }

        aux.next = temp;
    }

    // if i is greater than large of the list, x will be inserted at last position
    public void InsertAt(int i, int x) {
        Node temp = new Node(x);
        
        //insert first case
        if(this.head == null || i == 0) {
            temp.next = this.head;
            this.head = temp;
            return;
        }

        //insert at i position case
        int pos = 0;
        Node prev = null;
        Node aux = this.head;
        while(aux != null) {
            if (pos == i) {
                prev.next = temp;
                temp.next = aux;
                return;
            }
            prev = aux;
            aux = aux.next;
            pos++;
        }

        // insert last case
        prev.next = temp;
    }
}
