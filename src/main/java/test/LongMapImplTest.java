package test;

import static org.junit.Assert.*;

import de.comparus.opensource.longmap.LongMap;
import de.comparus.opensource.longmap.LongMapImpl;
import org.junit.*;

public class LongMapImplTest {
    LongMap<Integer> longMapInt = new LongMapImpl<>();

    @Test
    public void put() {
        assertTrue(longMapInt.put(0L, 0).getClass().equals(Integer.class));
        assertTrue(longMapInt.put(0L, 1) == 1);
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