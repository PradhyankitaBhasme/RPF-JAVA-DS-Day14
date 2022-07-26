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
    public void append(K key){
        Node<K> node=new Node<>(key);
        if (head == null) {
            this.head=node;
            this.tail=node;
        }else {
            this.tail.setNext(node);
            this.tail=node;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
    }
}
