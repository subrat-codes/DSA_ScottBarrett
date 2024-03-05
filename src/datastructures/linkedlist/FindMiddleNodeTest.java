package datastructures.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindMiddleNodeTest {

    private LinkedList linkedList = null;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
    }

    @Test
    void findMiddleNode_FromLinkedList_WithOddNoOfElement() {
        assertEquals(5, linkedList.getLength());
        assertEquals(3, linkedList.findMiddleNode());
    }

    @Test
    void findMiddleNode_FromLinkedList_WithEvenNoOfElement() {
        linkedList.append(6);

        assertEquals(6, linkedList.getLength());
        assertEquals(4, linkedList.findMiddleNode());
    }


}
