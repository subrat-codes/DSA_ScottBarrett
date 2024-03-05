package datastructures.linkedlist;

import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendTest {

    @Test
    void append_ToLinkedList_WithZeroElement() {
        LinkedList linkedList = new LinkedList();
        assertNotNull(linkedList);
        linkedList.append(23);
        linkedList.print();
        assertEquals(1, linkedList.getLength());
        assertEquals(23, linkedList.getHead());
        assertEquals(23, linkedList.getTail());
    }

    @Test
    void append_ToLinkedList_WithOnlyOneElement() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.print();
        assertEquals(2, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(23, linkedList.getTail());
    }

    @Test
    void append_ToLinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(23);
        linkedList.append(52);
        linkedList.append(30);
        linkedList.append(99);
        linkedList.append(13);
        linkedList.print();
        assertEquals(6, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(13, linkedList.getTail());
    }

}