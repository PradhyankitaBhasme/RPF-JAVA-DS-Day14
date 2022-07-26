package com.bridgelabz;

public class LinkedList<K> {
    private Node<K> head;
    private Node<K> tail;

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
    public void insert(K key){
        Node<K> node=new Node<>(key);
        node.setNext(tail);
        head.setNext(node);
    }
    public K pop(){
        K deleteData = head.getData();
        this.head=head.getNext();
        return deleteData;
    }
    public K popLast(){
        Node tempNode=head;
        while (!(tempNode.getNext().equals(tail))){
            tempNode=tempNode.getNext();
        }
        K deleteData = (K) tempNode.getNext().getData();
        this.tail=tempNode;
        return deleteData;
    }
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);

//        System.out.println(linkedList.pop());
        System.out.println(linkedList.popLast());
    }
}
