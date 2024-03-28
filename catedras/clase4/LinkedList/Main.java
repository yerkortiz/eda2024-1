import GenericSinglyLinkedList.*;

public class Main {
    public static void main(String[] args) {
        GenericSinglyLinkedList<Integer> genericll = new GenericSinglyLinkedList<Integer>();
        genericll.InsertFirst(4);
        genericll.InsertFirst(6);
        genericll.InsertFirst(7);
        genericll.InsertFirst(8);
        genericll.Print();
        genericll.InsertLast(1);
        genericll.Print();
    }
}
