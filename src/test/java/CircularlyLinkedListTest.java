import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularlyLinkedListTest {
    private CircularlyLinkedList<Integer> list;

    @BeforeEach
    void setup() {
        list = new CircularlyLinkedList<>();
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void addFirst() {
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.first());
    }

    @Test
    void addLast() {
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        assertEquals(3, list.last());
    }

    @Test
    void rotate() {
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        assertEquals(1, list.first());
        assertEquals(3, list.last());
        list.rotate();
        assertEquals(2, list.first());
        assertEquals( 1, list.last());
        list.rotate();
        assertEquals(3, list.first());
        assertEquals( 2, list.last());
    }

    @Test
    void removeFirst() {
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        assertEquals(1, list.first());
        list.removeFirst();
        assertEquals(2, list.first());
    }
}