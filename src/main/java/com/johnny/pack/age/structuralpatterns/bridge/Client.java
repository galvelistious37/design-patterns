package com.johnny.pack.age.structuralpatterns.bridge;

public class Client {
    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(40);
        collection.offer(99);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());

        FifoCollection<Integer> arrCollection = new Queue<>(new ArrayLinkedList<>());
        arrCollection.offer(10);
        arrCollection.offer(40);
        arrCollection.offer(99);

        System.out.println(arrCollection.poll());
        System.out.println(arrCollection.poll());
        System.out.println(arrCollection.poll());
        System.out.println(arrCollection.poll());
    }
}
