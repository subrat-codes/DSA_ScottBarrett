package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTest {

    @Test
    void removeFirst_FromLinkedList_WithZeroElement() {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getLength());
        var removedNode = linkedList.removeFirst();
        assertNull(removedNode);
        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());
        assertEquals(0, linkedList.getLength());
        linkedList.print();
    }

    @Test
    void removeFirst_FromLinkedList_WithOneElement() {
        LinkedList linkedList = new LinkedList(5);
        assertEquals(1, linkedList.getLength());
        linkedList.print();

        var removedNode = linkedList.removeFirst();
        linkedList.print();

        assertNotNull(removedNode);
        assertEquals(5, removedNode);
        assertEquals(0, linkedList.getLength());
        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());

    }

    @Test
    void removeFirst_FromLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(52);
        linkedList.append(30);
        linkedList.append(99);
        linkedList.append(13);
        assertEquals(6, linkedList.getLength());
        linkedList.print();

        var removedNode = linkedList.removeFirst();
        linkedList.print();

        assertNotNull(removedNode);
        assertEquals(5, removedNode);
        assertEquals(5, linkedList.getLength());
        assertEquals(23, linkedList.getHead());
        assertEquals(13, linkedList.getTail());



        removedNode = linkedList.removeFirst();
        linkedList.print();

        assertNotNull(removedNode);
        assertEquals(23, removedNode);
        assertEquals(4, linkedList.getLength());
        assertEquals(52, linkedList.getHead());
        assertEquals(13, linkedList.getTail());

    }
}