package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    @Test
    void reverse_LinkedList_WithOneElement() {
        LinkedList linkedList = new LinkedList(5);
        assertEquals(1, linkedList.getLength());
        linkedList.reverse();
    }

    @Test
    void reverse_LinkedList_WithMultipleElements() {
        LinkedList linkedList = new LinkedList(5);
        linkedList.append(43);
        linkedList.append(92);
        linkedList.append(58);
        linkedList.append(81);

        assertEquals(5, linkedList.getLength());
        assertEquals(5, linkedList.getHead());
        assertEquals(81, linkedList.getTail());

        linkedList.reverse();

        assertEquals(5, linkedList.getLength());
        assertEquals(81, linkedList.getHead());
        assertEquals(5, linkedList.getTail());
        assertEquals(81, linkedList.get(0).value);
        assertEquals(58, linkedList.get(1).value);
        assertEquals(92, linkedList.get(2).value);
        assertEquals(43, linkedList.get(3).value);
        assertEquals(5, linkedList.get(4).value);


    }
}
