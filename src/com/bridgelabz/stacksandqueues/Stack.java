package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<K> {
    LinkedList<K> linkedList;
    public Stack() {
        this.linkedList=new LinkedList<>();
    }

    void push(K key){
        linkedList.add(key);
    }
    void print(){
        linkedList.print();
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.print();
    }
}
