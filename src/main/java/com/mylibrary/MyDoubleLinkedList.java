package com.mylibrary;

public class MyDoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
        return null;
    }

    public T searchFromTail(T isData) {
        if (this.head != null) {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
        return null;
    }

    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> myDoubleLinkedList = new MyDoubleLinkedList<Integer>();

        myDoubleLinkedList.addNode(2);
        myDoubleLinkedList.addNode(4);
        myDoubleLinkedList.addNode(7);
        myDoubleLinkedList.addNode(9);
        myDoubleLinkedList.addNode(22);

        myDoubleLinkedList.printAll();

        System.out.println(myDoubleLinkedList.searchFromHead(2));
        System.out.println(myDoubleLinkedList.searchFromHead(8));
    }
}
