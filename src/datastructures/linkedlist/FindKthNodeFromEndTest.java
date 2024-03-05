package datastructures.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FindKthNodeFromEndTest {

    private LinkedList linkedList = null;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
    }

    @Test
    void findKthNodeFromEnd_FromLinkedList_ReturnsNull() {
        assertEquals(6, linkedList.getLength());
        assertNull(linkedList.findKthNodeFromEnd(7));
    }

    @Test
    void findKthNodeFromEnd_FromLinkedList_ReturnsKthNodeFromEnd() {
        //assertEquals(5, linkedList.findKthNodeFromEnd(2));
        //assertEquals(4, linkedList.findKthNodeFromEnd(3));
        assertEquals(3, linkedList.findKthNodeFromEnd(4));
    }


}
