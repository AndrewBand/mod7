package hw9.experim;

import hw9.MyHashMap;

import java.util.Arrays;

 class Main {
   static   class Key {
        private String k;

        public Key(String k) {
            this.k = k;
        }

        public String getK() {
            return k;
        }

//        public void setK(String k) {
//            this.k = k;
//        }
    }
    public static void main(String[] args) {
        MyLinkedList link = new MyLinkedList();
        link.add(0);
        link.add(1);
        link.add(2);
//        link.remove(2);
        System.out.println("link.size() = " + link.size());
        System.out.println("link.get(0) = " + link.get(0));
        System.out.println("link = " + link);
        System.out.println("link.toString() = " + link.toString());

        Key k1 = new Key("1");
        Key k2 = new Key("1");
        System.out.println("k1.getK() = " + k1.getK());
        System.out.println("-----------MyHashMap-----------------");
        MyHashMap hh = new MyHashMap();
        hh.put(1, "a");
        hh.put(1, "c");
        hh.put(2, "v");
        hh.put(4, "B");

        System.out.println("hh.remove(1) = " + hh.remove(3));
        System.out.println("hh.get(1) = " + hh.get(1));
        System.out.println("hh.get(2) = " + hh.get(2));
        System.out.println("hh.get(3) = " + hh.get(4));

    }
}
