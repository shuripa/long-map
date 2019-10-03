package de.comparus.opensource.longmap;


import java.util.LinkedList;


/**
 * @param <V>
 *     - завершите разработку класса LongMapImpl, который реализует карту с ключами типа long.
 *     - это должна быть хеш-таблица (например, HashMap).
 *     - он не должен использовать какие-либо известные реализации Map;
 *     - он должен использовать как можно меньше памяти и иметь адекватную производительность;
 *     - главная цель - увидеть ваш стиль кода и тестовый стиль.
 */

public class LongMapImpl<V> implements LongMap<V> {



    private int N;                          //count elements
    private int pow;                        //power, size map array
    private double rat;                     //ratio between count elements and map power for increase map power

    private class EntryLong<V> {
        private long key;
        private V value;

        EntryLong(long key, V value){
            this.key = key;
            this.value = value;
        }

        public long getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            return null;
        }
    }

    private LinkedList<EntryLong> map[];    //table for map - array linked lists

    private int hash(Long key){
        int x;
        x = (int)(key ^ (key >>> 32));      //returns the result of the exclusive or first and last 32 bits of a standard machine representation of numbers
        x = (x & 0x7fffffff);               //masking sign
        x = x % pow;                        //distribution keys by the amount of power
        return x;
    }

    private void increaceMap(){

        //increase power
        //rewrite map
    }

    public LongMapImpl(){
        rat = 1.5;
        clear();
    }


    public V put(long key, V value) {
        EntryLong node = new EntryLong(key, value);
        if (containsKey(key)) {
            remove(key);
        } else {
            N++;
            if (pow > size() * rat){
                increaceMap();
            }
        }
        map[hash(key)].add(node);
        return get(key);
    }

    public V get(long key) {
        return null;
    }

    public V remove(long key) {
        return null;
    }

    public boolean isEmpty() {
        return (N==0);
    }

    public boolean containsKey(long key) {
        boolean result = false;
        int i = hash(key);
        for (EntryLong<V> el: map[i]) {
            if (el.key == key) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean containsValue(V value) {
        boolean result = false;
        for (int i = 0; i < pow; i++) {
            for (EntryLong<V> el : map[i]) {
                if (el.value == value) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public long[] keys() {
        int k = 0;
        long[] result = new long[N];
        for (int i = 0; i < pow; i++) {
            for (EntryLong<V> el : map[i]) {
                result[k] = el.getKey();
                k++;
            }
        }
        return result;
    }

    public V[] values() {
        int k = 0;
        Object[] result = new Object[N];
        for (int i = 0; i < pow; i++) {
            for (EntryLong<V> el : map[i]) {
                result[k] = el.getValue();
                k++;
            }
        }
        return (V[]) result;
    }

    public long size() {
        return N;
    }

    public void clear() {
        N = 0;
        pow = 4;
        map = new LinkedList[pow-1];
        for (int i = 0; i < pow; i++) {
            map[i] = new LinkedList<EntryLong>();
        }
    }

}
