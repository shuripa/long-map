package test;

import static org.junit.Assert.*;

import de.comparus.opensource.longmap.LongMap;
import de.comparus.opensource.longmap.LongMapImpl;
import org.junit.*;

public class LongMapImplTest {
    LongMap<Integer> map;

    @Test
    public void put() {
        map = new LongMapImpl<>();
        assertTrue(map.put(0L, 0).getClass().equals(Integer.class));
        assertTrue(map.put(0L, 1) == 1);
    }

    @Test
    public void get() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void containsKey() {
        map.put(0L, 1);
        assertTrue(map.containsKey(0L));
    }

    @Test
    public void containsValue() {
    }

    @Test
    public void keys() {
    }

    @Test
    public void values() {
    }

    @Test
    public void size() {
    }

    @Test
    public void clear() {
    }
}