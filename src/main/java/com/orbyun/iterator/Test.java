package com.orbyun.iterator;

/**
 * @author chenjixin
 * @date 2019-11-26 16:05
 */
public class Test {
    public static void main(String[] args) {
        Collection collection=new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
