//package hw9.experim;
//import java.util.Arrays;
//import java.util.Objects;
//
//public class MyHashMap {
//    private Node[] hashtable;
//
//    //length of hashtable array
//    private int multiplier = 20;
//    private int counter;
//
//
//    /**
//     * create HashTable with hashtable.length = 20
//     */
//    public MyHashMap() {
//        this.hashtable = new Node[multiplier];
//    }
//
//    /**
//     * @param multiplier length of hashtable
//     */
//    public MyHashMap(int multiplier) {
//        this.hashtable = new Node[multiplier];
//    }
//
//    /**
//     * @param key   key of a pair of elements
//     * @param value value of a pair of elements
//     * @return this hashTable
//     */
//    public MyHashMap put(Object key, Object value) {
//        incrissHashtable();
//        Node newNode = new Node(key, value);
//        Node temp = new Node (key, value);
////        Node start = hashtable[indexFor(newNode.hashCode())];
//        System.out.println(indexFor(newNode.hashCode()));
//        System.out.println("start = " + (newNode.key));
//        System.out.println("hashtable = " + Arrays.toString(hashtable));
//        //if hashtable doesn't have elements with key.hash saving element in the first element hashtable[hash]
//        boolean checkEquals = false;
//            for(Object h: hashtable){
//                if (h.equals(newNode)) {
//                    checkEquals = true;
//                                   }
//            }
//
//        if (checkEquals) {
//            hashtable[counter]= (Node) newNode.key;
//            hashtable[indexFor(newNode.hashCode())] = newNode;
//            counter++;
//        } else {
//            //if hashtable already have elements with key.hash looking to element with key.equal(key) and rewrite it
//            while (start.next == null || start.equals(newNode)) {
//                if (start.equals(newNode)) {
//                    temp = start;
//                    start.value = newNode.value;
//                    start.next=temp.next;
//                    counter++;
//                    return this;
//                }else{
//                    incrissHashtable();
//                    newNode.next = start.next;
//                    start = newNode;
//                    start.next = newNode;
//                    counter++;
//                    return this;
//                }
//            }
//            //if hashtable[hash] doesn't have elements with key.equal(key) saving element in the end of hashtable[hash]
//            counter++;
//        }
//        return this;
//    }
//private void incrissHashtable() {
//    if (counter >= multiplier) {
//        int numINcr = (int) (multiplier * 2);
//        Node[] newHashtable = new Node  [numINcr];
//        for (int i = 0; i < multiplier; i++) {
//            newHashtable[i] = hashtable[i];
//        }
//        hashtable = newHashtable;
//    }
//}
//    /**
//     * @param key key of element to remove
//     * @return this hashTable
//     */
//    public MyHashMap remove(Object key) {
//        Node newNode = new Node(Object key, null);
//        Node start = hashtable[indexFor(newNode.hashCode())];
//        //if hashtable[key.hash] if null, return
//        if (start == null) {
//            return this;
//        } else {
//            //if hashtable[key.hash].equal(key) delete it
//            if (start.equals(newNode)) {
//                hashtable[indexFor(newNode.hashCode())] = start.next;
//                counter--;
//            }
//            //loking to element.equal(key) and delete it
//            else {
//                while (start.next != null) {
//                    if (start.next.equals(newNode)) {
//                        start.next = start.next.next;
//                        counter--;
//                        return this;
//                    }
//                    start = start.next;
//                }
//            }
//        }
//        return this;
//
//    }
//
//    /**
//     * delete all element from hashtable
//     *
//     * @return this hashTable
//     */
//    public MyHashMap clear() {
//        Arrays.fill(hashtable, null);
//        counter = 0;
//        return this;
//    }
//
//    /**
//     * @return count of element in hashTable
//     */
//    public int size() {
//        return counter;
//    }
//
//    /**
//     * @param key key of a pair of elements
//     * @return value of a pair of elements. If key nor exist in table, return null
//     */
//    public Object get(Object key) {
//        Node newNode = new Node(key, null);
//        Node start = hashtable[indexFor(newNode.hashCode())];
//        //If key nor exist in table, return null
//        if (start == null) {
//            return null;
//        } else {
//            if (start.equals(newNode)) {
//                return start.value;
//            } else {
//                while (start.next != null) {
//                    start = start.next;
//                    if (start.equals(newNode)) {
//                        return start.value;
//                    }
//                }
//            }
//        }
//        return null;
//    }
//
//    /**
//     * @param hash transform hash of object to index of hashTable array
//     * @return int in diapason from 0 to multiplier
//     */
//    private int indexFor(int hash) {
//        while (hash > multiplier - 1) {
//            hash -= multiplier;
//        }
//        return hash;
//    }
//
//    class Node {
//        private final Object key;
//        private Object value;
//        private Node next;
//
//        private Node(Object key, Object value) {
//            this.key = key;
//            this.value = value;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Node node = (Node) o;
//            return key.equals(node.key);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(key);
//        }
//    }
//}