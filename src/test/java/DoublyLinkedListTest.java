import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> list;

    @BeforeEach
    void setup() {
        list = new DoublyLinkedList<>();
    }

    @Test
    void isEmpty() {
        assert(list.isEmpty());
    }

    @Test
    void first() {
        assertNull(list.first());
    }
}