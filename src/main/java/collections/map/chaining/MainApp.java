package collections.map.chaining;

public class MainApp {

    public static void main(String[] args) {

        HashTable<Integer, String> map = new HashTable<Integer,String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");

        System.out.println(map.remove(1));
        System.out.println(map.remove(4));

        System.out.println(map.get(5));

        System.out.println(map.getSize());

    }

}
