public class DoublyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        Node(E e, Node<E> p, Node<E> n) {
            element = e;
            next = n;
            prev = p;
        }

        E getElement() { return element; }
        Node<E> getNext() { return next; }
        void setNext(Node<E> n) { next = n; }
        Node<E> getPrev() { return prev; }
        void setPrev(Node<E> p) { prev = p; }
    }

    private final Node<E> header;
    private final Node<E> trailer;
    private int size = 0;
    public DoublyLinkedList() {
       header =  new Node<E>(null, null, null);
       trailer = new Node<E>(null, header, null);
       header.setNext(trailer);
    };

    public int size() { return size; }
    public boolean isEmpty() { return size == 0;}
    public E first() { return header.getNext().getElement(); }
    public E last() { return trailer.getPrev().getElement(); }

    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newNode = new Node(e, predecessor, successor);
        predecessor.setNext(newNode);
        successor.setPrev(newNode);
        size++;
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public E removeFirst() {
        if (isEmpty()) { return null; }
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        return remove(trailer.getPrev());
    }
}
