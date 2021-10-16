package com.mylibrary;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    public ArrayList enqueue(T item) {
        queue.add(item);
        return queue;
    }

    public ArrayList dequeue() {
        if(queue.isEmpty()){
            return null;
        }
        queue.remove(0);
        return queue;
    }

    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<Integer>();
        System.out.println(mq.enqueue(1));
        System.out.println(mq.enqueue(2));
        System.out.println(mq.enqueue(3));
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}