package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetNodeByIndexTest {

    @Test
    void get_ByIndex_FromLinkedList_WithZeroElement() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getLength());

        assertNull(linkedList.get(-1));
        assertNull(linkedList.get(0));
        assertNull(linkedList.get(1));

    }

    @Test
    void get_ByIndex_FromLinkedList_WithOneElement() {
        LinkedList linkedList = new LinkedList(5);
        assertEquals(1, linkedList.getLength());

        assertNull(linkedList.get(-1));
        assertNotNull(linkedList.get(0));
        assertEquals(5, linkedList.get(0).value);
        assertNull(linkedList.get(1));

    }

    @Test
    void get_ByIndex_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(92);
        linkedList.append(40);
        linkedList.append(74);

        assertEquals(7, linkedList.getLength());
        assertNull(linkedList.get(7));
        assertNull(linkedList.get(-1));
        assertNull(linkedList.get(8));
        assertNotNull(linkedList.get(0));
        assertEquals(5, linkedList.get(0).value);
        assertNotNull(linkedList.get(1));
        assertEquals(23, linkedList.get(1).value);
        assertNotNull(linkedList.get(4));
        assertEquals(92, linkedList.get(4).value);
        assertNotNull(linkedList.get(6));
        assertEquals(74, linkedList.get(6).value);

    }
}
