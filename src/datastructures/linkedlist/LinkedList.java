package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {

    }

    public LinkedList(int value) {
        var newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void append(int value) {
        var newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Integer removeLastNode(){
        var temp = head;
        var pre = head;
        if (length == 0){
            return null;
        }
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp.value;
    }

    public void prepend(int value){
        var newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            var temp = head;
            head = newNode;
            head.next = temp;
        }
        length++;
    }

    public void print() {
        System.out.println("Printing Linked List:");
        System.out.println("Head -> " + getHead());
        System.out.println("Tail -> " + getTail());
        System.out.println("Length -> " + getLength());
        var tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }


    }

    public Integer getHead(){
        if (head != null){
            return head.value;
        }else
            return null;
    }

    public Integer getTail(){
        if (tail != null){
            return tail.value;
        }else
            return null;
    }

    public Integer getLength(){
        return length;
    }
}
