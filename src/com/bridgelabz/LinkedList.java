package com.bridgelabz;

public class LinkedList<K> {
    private Node head;
    private Node tail;

    public void add(K key){
        Node<K> node=new Node<>(key);
        if (head == null) {
            this.head=node;
            this.tail=node;
        } else {
            node.setNext(head);
            head=node;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
    }
}
