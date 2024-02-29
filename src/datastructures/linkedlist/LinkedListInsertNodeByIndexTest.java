package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListInsertNodeByIndexTest {

    @Test
    void insert_ByIndex_FromLinkedList_WithZeroElement() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getLength());

        assertFalse(linkedList.insert(-1, 23));
        assertTrue(linkedList.insert(0, 25));
        // 25 and length = 1
        assertEquals(25, linkedList.get(0).value);
        assertEquals(1, linkedList.getLength());
        assertEquals(25, linkedList.getHead());
        assertEquals(25, linkedList.getTail());

        assertTrue(linkedList.insert(1, 44));
        // 25, 44 and length = 2
        assertEquals(25, linkedList.get(0).value);
        assertEquals(44, linkedList.get(1).value);
        assertEquals(2, linkedList.getLength());
        assertEquals(25, linkedList.getHead());
        assertEquals(44, linkedList.getTail());

    }

    @Test
    void insert_ByIndex_FromLinkedList_WithOneElement() {
        LinkedList linkedList = new LinkedList(5);
        assertEquals(1, linkedList.getLength());

        assertFalse(linkedList.insert(-1, 23));

        assertEquals(5, linkedList.get(0).value);
        assertTrue(linkedList.insert(0, 25));
        // 25, 5 and length = 2
        assertEquals(25, linkedList.get(0).value);
        assertEquals(5, linkedList.get(1).value);
        assertEquals(2, linkedList.getLength());
        assertEquals(25, linkedList.getHead());
        assertEquals(5, linkedList.getTail());
    }

    @Test
    void insert_ByIndex_ReturnsFalse_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(40);
        assertEquals(5, linkedList.getLength());

        assertFalse(linkedList.insert(-1, 21));
        assertFalse(linkedList.insert(6, 21));
        assertFalse(linkedList.insert(7, 21));
    }

    @Test
    void insert_ByIndex_AtBeginning_ReturnsTrue_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(40);
        assertEquals(5, linkedList.getLength());

        assertEquals(5, linkedList.get(0).value);
        assertTrue(linkedList.insert(0, 65));
        // 65, 5, 23, 10, 42, 40 and length 6
        assertEquals(65, linkedList.get(0).value);
        assertEquals(5, linkedList.get(1).value);
        assertEquals(6, linkedList.getLength());
        assertEquals(65, linkedList.getHead());
        assertEquals(40, linkedList.getTail());
    }

    @Test
    void insert_ByIndex_InMiddle_ReturnsTrue_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(40);
        assertEquals(5, linkedList.getLength());

        assertEquals(42, linkedList.get(3).value);
        assertTrue(linkedList.insert(3 , 65));
        // 5, 23, 10, 65, 42, 40 and length 6
        assertEquals(65, linkedList.get(3).value);
        assertEquals(42, linkedList.get(4).value);
        assertEquals(6, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(40, linkedList.getTail());
    }

    @Test
    void insert_ByIndex_InEnd_ReturnsTrue_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(10);
        linkedList.append(42);
        linkedList.append(40);
        assertEquals(5, linkedList.getLength());

        assertNull(linkedList.get(5));
        assertTrue(linkedList.insert(5 , 65));
        // 5, 23, 10, 42, 40, 65 and length 6
        assertEquals(65, linkedList.get(5).value);
        assertEquals(40, linkedList.get(4).value);
        assertEquals(6, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(65, linkedList.getTail());
    }
}
