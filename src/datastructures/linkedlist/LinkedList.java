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
        if (length == 0) return null;
        var temp = head;
        var pre = head;
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
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Integer removeFirst() {
        if (length == 0) return null;
        var temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        if (length == 0){
            tail = null;
        }
        return temp.value;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        var temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        var temp = get(index);
        if (temp == null) return false;
        temp.value = value;
        return true;
    }

    public boolean set1(int index, int value) {
        if (index < 0 || index >= length){
            return false;
        }
        var temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value){
        if (index < 0 || index > length){
            return false;
        }
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        var newNode = new Node(value);
        var temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Integer remove(int index) {
        if(index < 0 || index >= length){
            return null;
        }
        if (index == 0){
            return removeFirst();
        }
        if (index == length - 1){
            return removeLastNode();
        }
        var prev = get(index - 1);
        var temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp.value;
    }

    public void reverse() {
        var temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    // Leetcode starts
    public Integer findMiddleNode() {
        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.value;
    }

    public boolean hasLoop(){
        // TODO
        return false;
    }

    public Integer findKthNodeFromEnd(int k){
        var slow = head;
        var fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.value;
    }


    // Leetcode ends

    public void print() {
        System.out.println("Printing Linked List:");
        System.out.println("Head -> " + getHead());
        System.out.println("Tail -> " + getTail());
        System.out.println("Length -> " + getLength());
        System.out.println("----");
        var tempNode = head;
        while (tempNode != null){
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }

        System.out.println("-----------------------");
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
