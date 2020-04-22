package com.orbyun.substitution;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenjixin
 * @date 2019-11-25 14:05
 */
public class Son extends Father{
    public Collection doSomething(Map map){
        System.out.println("子类被执行");
        return map.values();
    }

}
