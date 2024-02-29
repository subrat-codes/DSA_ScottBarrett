package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListSetNodeByIndexTest {

    @Test
    void set_ByIndex_FromLinkedList_WithZeroElement() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getLength());

        assertFalse(linkedList.set(-1, 23));
        assertFalse(linkedList.set(0, 25));
        assertFalse(linkedList.set(1, 42));
    }

    @Test
    void set_ByIndex_FromLinkedList_WithOneElement() {
        LinkedList linkedList = new LinkedList(5);
        assertEquals(1, linkedList.getLength());

        assertFalse(linkedList.set(-1, 23));
        assertEquals(5, linkedList.get(0).value);
        assertTrue(linkedList.set(0, 25));
        assertEquals(25, linkedList.get(0).value);
        assertFalse(linkedList.set(1, 21));

    }

    @Test
    void set_ByIndex_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(92);
        linkedList.append(40);
        linkedList.append(74);

        assertEquals(7, linkedList.getLength());
        assertFalse(linkedList.set(7, 21));
        assertFalse(linkedList.set(-1, 21));
        assertFalse(linkedList.set(8, 21));


        assertEquals(5, linkedList.get(0).value);
        assertTrue(linkedList.set(0, 65));
        assertEquals(65, linkedList.get(0).value);

        assertEquals(23, linkedList.get(1).value);
        assertTrue(linkedList.set(1, 76));
        assertEquals(76, linkedList.get(1).value);

        assertEquals(92, linkedList.get(4).value);
        assertTrue(linkedList.set(4, 24));
        assertEquals(24, linkedList.get(4).value);

        assertEquals(74, linkedList.get(6).value);
        assertTrue(linkedList.set(6, 91));
        assertEquals(91, linkedList.get(6).value);

    }
}
