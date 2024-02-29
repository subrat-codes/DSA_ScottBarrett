package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListRemoveNodeByIndexTest {

    @Test
    void remove_ByIndex_FromLinkedList_WithZeroElement() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getLength());

        assertNull(linkedList.remove(-1));
        assertNull(linkedList.remove(0));
        assertNull(linkedList.remove(1));

    }

    @Test
    void remove_ByIndex_FromLinkedList_WithOneElement() {
        LinkedList linkedList = new LinkedList(5);
        assertEquals(1, linkedList.getLength());

        assertNull(linkedList.remove(-1));
        assertNull(linkedList.remove(1));

        assertEquals(5, linkedList.get(0).value);
        assertEquals(5, linkedList.remove(0));
        assertEquals(0, linkedList.getLength());
        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());
    }

    @Test
    void remove_ByIndex_FirstIndex_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(40);
        assertEquals(5, linkedList.getLength());

        assertNull(linkedList.remove(-1));
        assertNull(linkedList.remove(5));
        assertNull(linkedList.remove(6));

        assertEquals(5, linkedList.remove(0));
        assertEquals(4, linkedList.getLength());
        assertEquals(23, linkedList.getHead());
        assertEquals(40, linkedList.getTail());
    }

    @Test
    void insert_ByIndex_LastIndex_ReturnsTrue_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(40);
        assertEquals(5, linkedList.getLength());

        assertEquals(40, linkedList.remove(4));
        assertEquals(4, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(42, linkedList.getTail());
    }

    @Test
    void insert_ByIndex_InMiddle_ReturnsTrue_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(40);
        assertEquals(5, linkedList.getLength());

        assertEquals(10, linkedList.get(2).value);
        assertEquals(10, linkedList.remove(2));
        // 5, 23, 42, 40 and length 4
        assertEquals(42, linkedList.get(2).value);
        assertEquals(23, linkedList.get(1).value);
        assertEquals(4, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(40, linkedList.getTail());
    }

}
