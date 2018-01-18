package com.company;

public class MyLinkedList {




    private class Entry<T> {
        private T value;
        private Entry<T> next;
        private Entry<T> previous;

        public Entry(T value, Entry<T> next, Entry<T> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

}
