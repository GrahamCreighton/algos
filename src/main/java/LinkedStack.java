public class LinkedStack<E> {
    private SinglyLinkedList list = new SinglyLinkedList<>();
    public LinkedStack() {}
    public int size() { return list.size(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public void push(E element) { list.addFirst(element); }
}
