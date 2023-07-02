import java.util.LinkedList;

public class MyHashMapImplementation {
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

        }

        private int n; // total number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) { // N is the capacity/size of the buckets array
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // to generate hashcode/bucket index
        private int HashFun(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        // Traverse the ll and looks for a node with key,if found it returns it's index
        // otherwise it returns null
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        // size method which returns the number of entries in map
        public int size() {
            return n;
        }

        // insert/update
        public void put(K key, V value) {
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) { // key doesn't exist,we have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else { // update case
                Node curNode = currBucket.get(ei);
                curNode.value = value;
            }
        }

        public V get(K key) {
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) { // key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            } else { // key doesn't exist
                return null;
            }
        }

        public V remove(K key) {
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) { // key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        // put insertion behavior
        mp.put("a", 5);
        mp.put("b", 10);
        mp.put("c", 15);
        System.out.println("Testing size:" + mp.size()); // 3
        // put updation behavior
        mp.put("c", 30);
        System.out.println("Testing size:" + mp.size()); // 3
        // Testing get
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("nik")); //null
        //testing remove
        System.out.println(mp.remove("c")); //30
        System.out.println(mp.remove("c")); //null
        System.out.println("testing size:"+mp.size());



    }
}