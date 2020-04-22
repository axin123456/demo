package com.orbyun.LoggerProxy;

import java.lang.reflect.Method;

public interface MyLogger {
    /** 纪录进入方法时间 **/
    public void saveIntoMethodTime(Method method);

    /** 纪录退出方法时间**/
    public void saveOutMethodTime(Method method);
}
