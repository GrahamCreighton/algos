import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    private SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void size() {
        assertEquals(0, list.size());
        list.addLast(1);
        assertEquals(1, list.size());
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
        list.addLast(2);
        assertFalse(list.isEmpty());
    }

    @Test
    void first() {
        assertNull(list.first());
        list.addLast(2);
        assertEquals(2, list.first());
    }

    @Test
    void last() {
        assertNull(list.last());
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.last());
    }

    @Test
    void addLast() {
        assertNull(list.last());
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, list.first());
        assertEquals(2, list.last());
    }

    @Test
    void removeFirst() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.size());
        assertEquals(1, list.first());
        list.removeFirst();
        assertEquals(2 , list.first());
        assertEquals(1, list.size());
    }
}