package app.dataStructures.singleLinkedList;

import app.dataStructures.list.MyList;

import java.util.NoSuchElementException;

//TODO just prototype
public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int nodeCount;

    @Override
    public T get(int index) {
        if (index < 0 || index >= nodeCount) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int indexCount = 0;
        Node<T> value = head;
        while(index != indexCount){
            value = value.getNext();
            indexCount++;
        }
        return value.getValue();
    }

    @Override
    public void add(T value) {
        if (tail == null) {
            tail = new Node<>(value);
            head = tail;
        } else {
            Node<T> newNode = new Node<>(value);
            tail.setNext(newNode);
            tail = newNode;
        }
        nodeCount++;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {

        return null;
    }

    private class Iterator<T> {

        private Node<T> currentNode;

        boolean hasNext(){
            return currentNode != tail;
        }

        T next(){
            if(hasNext()){
                return currentNode.getNext().getValue();
            }
            throw new NoSuchElementException();
        }

    }

    private class Node<T> {

        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNext(){
            return next;
        }

        public T getValue() {
            return value;
        }
    }
}
