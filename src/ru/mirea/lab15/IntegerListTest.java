package ru.mirea.lab15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListTest {

    IntegerList arr = new IntegerList(10);

    @Test
    void size() {
        for (int i = 0; i < 10; i++){
            arr.add(i);
        }
        int s = arr.size();
        assertEquals(10, s);
    }

    @Test
    void get() {
        for (int i = 1; i < 11; i++){
            arr.add(i);
        }
        assertEquals(2, arr.get(1));
    }

    @Test
    void search() {
        for (int i = 1; i < 11; i++){
            arr.add(i);
        }
        assertEquals(3, arr.search(4));
    }

    @Test
    void set() {
        for (int i = 1; i < 11; i++){
            arr.add(i);
        }
        arr.set(2, 101);
        assertEquals(101, arr.get(2));
    }

    @Test
    void remove() {
        for (int i = 0; i < 4; i++){
            arr.add(i);
        }
        arr.remove(2);
        int[] ex = {0, 1, 3};
        assertEquals(3, arr.get(2));
    }

    @Test
    void max() {
        for (int i = 0; i < 10; i++){
            arr.add(i);
        }
        arr.set(4, 321);
        assertEquals(321, arr.max());
    }

    @Test
    void min() {
        for (int i = 0; i < 10; i++){
            arr.add(i);
        }
        arr.set(6, -21);
        assertEquals(-21, arr.min());
    }

    @Test
    void avg() {
        for (int i =1; i < 11; i++){
            arr.add(i);
        }
        assertEquals(5.5, arr.avg());
    }
}