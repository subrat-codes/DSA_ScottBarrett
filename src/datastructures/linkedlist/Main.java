package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        //testAppend();

        testRemoveLastNode();


    }

    private static void testAppend() {
        var linkedList = new LinkedList(5);
        print(linkedList);
        linkedList.append(8);
        linkedList.append(2);
        linkedList.append(10);
    }

    private static void testRemoveLastNode() {
        var linkedList = new LinkedList(5);
        print(linkedList);
        linkedList.append(8);
        linkedList.append(2);
        linkedList.append(10);

        var removedVal = linkedList.removeLastNode();
        System.out.println("removedVal = " + removedVal);

    }

    private static void print(LinkedList linkedList) {
        linkedList.print();
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
    }
}
