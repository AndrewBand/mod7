package hw9.experim;

import java.util.LinkedList;

public class MyLinkedList {

    private Node firstNode;
    private Node lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new Node(firstNode, null, null);
        firstNode = new Node(null, null, lastNode);
    }

    //***************************************************************************************
    private static class Node {

        private Node prevNode;
        private Object item;
        private Node nextNode;

        Node(Node prevNode, Object item, Node nextNode) {
            this.prevNode = prevNode;
            this.item = item;
            this.nextNode = nextNode;
        }

        public Node getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(Node prevNode) {
            this.prevNode = prevNode;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }
    //************************ Это метод add() **********************************************
    public boolean add(Object o) {
        boolean rez = false;
//        Node prevNode = lastNode;
//        prevNode.setItem(o);
//        lastNode = new Node(prevNode, null, null);
//        prevNode.setNextNode(lastNode);
//        size++;
//        rez = true;
////        System.out.println("Добавили елемент. Всего елементов в арай листе: " + this.size);
//        return rez;

   // linkFirst(E e) {
         Node l = lastNode;
         Node newNode = new Node(l, o, null);
        lastNode = newNode;
        if (l == null)
            firstNode = newNode;
        else
            l.nextNode = newNode;
        size++;
        return rez;
    }
    //************************ Это метод remove() ******************************************
    public boolean remove(int index) {
        boolean rez = false;

        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        if (index==1){
            Node nodeToRemove = firstNode.getNextNode();

        } else {
            Node nodeToRemove = firstNode.getNextNode();
            for(int i=0; i < index; i++) {
                nodeToRemove = nodeToRemove.getNextNode();
            }

            nodeToRemove.getNextNode().setPrevNode(nodeToRemove.getPrevNode());
            nodeToRemove.getPrevNode().setNextNode(nodeToRemove.getNextNode());

            nodeToRemove = null;
        }
        size --;

        rez = true;

        return rez;
    }
    //************************ Это метод clear() ********************************************
    public void clear() {

        this.lastNode = new Node(firstNode, null, null);
        this.firstNode = new Node(null, null, lastNode);
        this.size = 0;

//        System.out.println("MyLinkedList обнулен !!!!!");
    }
    //************************ Это метод size() *********************************************
    public int size() {
        return (size);
    }
    //************************ Это метод get() **********************************************

    public Object get(int index) {
//        Node vihlop = firstNode;
//        for (int i=0; i<index; i++) {
//            vihlop = vihlop.getNextNode();
//        }
//        return vihlop.getItem();

        Node x = firstNode;
        for (int i = 0; i < index; i++)
            x = x.nextNode;
        return x.getItem();
    }
    //************************* Это метод toString() ****************************************

    @Override
    public String toString() {
        String S = "[ ";

//        if (this == null) {
//            S = "fuck";
//        }

        for(int i=0; i<this.size(); i++) {
            S += this.get(i) + " ";
        }
        return (S.trim() + " ]");
    }
}

