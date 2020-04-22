package com.orbyun.iterator;

/**
 * @author chenjixin
 * @date 2019-11-26 15:53
 */
public class MyCollection implements Collection {

    public String string[] = {"A", "B", "C", "D", "E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
