package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLastNodeTest {

    @Test
    void removeLast_FromLinkedList_WithZeroElement() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getLength());
        var removedNode = linkedList.removeLastNode();
        assertNull(removedNode);
        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());
        assertEquals(0, linkedList.getLength());

    }

    @Test
    void removeLast_FromLinkedList_WithOneElement() {
        LinkedList linkedList = new LinkedList(5);
        assertEquals(1, linkedList.getLength());
        linkedList.print();

        var removedNode = linkedList.removeLastNode();

        assertNotNull(removedNode);
        assertEquals(5, removedNode);
        assertEquals(0, linkedList.getLength());
        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());

    }

    @Test
    void removeLast_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(52);
        linkedList.append(30);
        linkedList.append(99);
        linkedList.append(13);
        assertEquals(6, linkedList.getLength());
        linkedList.print();

        var removedNode = linkedList.removeLastNode();
        linkedList.print();

        assertNotNull(removedNode);
        assertEquals(13, removedNode);
        assertEquals(5, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(99, linkedList.getTail());

        removedNode = linkedList.removeLastNode();
        linkedList.print();

        assertNotNull(removedNode);
        assertEquals(99, removedNode);
        assertEquals(4, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(30, linkedList.getTail());
    }
}