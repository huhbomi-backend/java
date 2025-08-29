package day09;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // ------------------- List -------------------
        System.out.println("=== List (순서O, 중복O) ===");
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");
        list.add("사과"); // 중복 허용
        System.out.println("ArrayList: " + list);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("A");
        System.out.println("LinkedList: " + linkedList);

        Vector<String> vector = new Vector<>();
        vector.add("X");
        vector.add("Y");
        vector.add("X");
        System.out.println("Vector: " + vector);


        // ------------------- Set -------------------
        System.out.println("\n=== Set (순서X, 중복X) ===");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("사과");
        hashSet.add("바나나");
        hashSet.add("사과"); // 중복 무시
        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("사과");
        linkedHashSet.add("바나나");
        linkedHashSet.add("사과");
        System.out.println("LinkedHashSet (입력순 유지): " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("cherry");
        System.out.println("TreeSet (정렬됨): " + treeSet);


        // ------------------- Queue -------------------
        System.out.println("\n=== Queue (FIFO 구조) ===");
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("ArrayDeque: " + queue);
        System.out.println("poll(): " + queue.poll()); // 1 제거
        System.out.println("남은 큐: " + queue);

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.offer(30);
        pQueue.offer(10);
        pQueue.offer(20);
        System.out.println("PriorityQueue (작은 값 우선): " + pQueue);
        System.out.println("poll(): " + pQueue.poll()); // 10 제거
        System.out.println("남은 큐: " + pQueue);


        // ------------------- Map -------------------
        System.out.println("\n=== Map (key-value 쌍) ===");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1000);
        hashMap.put("banana", 2000);
        hashMap.put("apple", 3000); // 같은 key 덮어쓰기
        System.out.println("HashMap: " + hashMap);
        System.out.println("check : "+hashMap.get("apple"));

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", 1000);
        linkedHashMap.put("banana", 2000);
        linkedHashMap.put("cherry", 3000);
        System.out.println("LinkedHashMap (입력순 유지): " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 2000);
        treeMap.put("apple", 1000);
        treeMap.put("cherry", 3000);
        System.out.println("TreeMap (정렬됨): " + treeMap);
    }
}
