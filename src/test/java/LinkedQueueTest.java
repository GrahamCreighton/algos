import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {
    private LinkedQueue<Integer> queue;

    @BeforeEach
    void setup() {
        queue = new LinkedQueue<>();
    }


    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void enqueue() {
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertEquals(1, queue.size());
    }

    @Test
    void first() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.first());
    }

    @Test
    void dequeue() {
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.dequeue());
        assertTrue(queue.isEmpty());
    }
}