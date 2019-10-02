package de.comparus.opensource.longmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @param <V>
 *     Завершите разработку класса LongMapImpl, который реализует карту с ключами типа long.
 *     - это должна быть хеш-таблица (например, HashMap).
 *     - он не должен использовать какие-либо известные реализации Map;
 *     - он должен использовать как можно меньше памяти и иметь адекватную производительность;
 *     - главная цель - увидеть ваш стиль кода и тестовый стиль.
 */

public class LongMapImpl<V> implements LongMap<V> {

    public V put(long key, V value) {
        return null;
    }

    public V get(long key) {
        return null;
    }

    public V remove(long key) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(long key) {
        return false;
    }

    public boolean containsValue(V value) {
        return false;
    }

    public long[] keys() {
        return null;
    }

    public V[] values() {
        return null;
    }

    public long size() {
        return 0;
    }

    public void clear() {

    }
}
