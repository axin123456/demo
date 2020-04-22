package com.orbyun.substitution;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author chenjixin
 * @date 2019-11-25 14:04
 */
public class Father {
    public Collection doSomething(HashMap map){
        System.out.println("父类别执行");
        return map.values();
    }
}
