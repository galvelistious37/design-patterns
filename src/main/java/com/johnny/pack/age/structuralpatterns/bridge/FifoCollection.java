package com.johnny.pack.age.structuralpatterns.bridge;

public interface FifoCollection<T> {
    // Add element to collection
    void offer(T element);
    // Removes & returns first element from collection
    T poll();
}
