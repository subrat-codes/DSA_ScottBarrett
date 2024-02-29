package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LinkedListPrependTest {

    @Test
    void prepend_ToLinkedList_WithZeroElement() {
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(23);
        linkedList.print();
        assertEquals(1, linkedList.getLength());
        assertEquals(23, linkedList.getHead());
        assertEquals(23, linkedList.getTail());
    }

    @Test
    void prepend_ToLinkedList_WithOnlyOneElement() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.prepend(23);
        linkedList.print();
        assertEquals(2, linkedList.getLength());
        assertEquals(23, linkedList.getHead());
        assertEquals(5, linkedList.getTail());
    }

    @Test
    void prepend_ToLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(52);
        linkedList.append(30);
        linkedList.append(13);

        linkedList.prepend(78);

        linkedList.print();

        assertEquals(6, linkedList.getLength());
        assertEquals(78, linkedList.getHead());
        assertEquals(13, linkedList.getTail());
    }

}