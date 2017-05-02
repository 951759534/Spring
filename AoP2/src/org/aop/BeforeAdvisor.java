package org.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by K550jk on 2017/5/2.
 */
public class BeforeAdvisor implements MethodBeforeAdvice{
    @Override
    public void before(Method method,Object[] objects,Object o){
        System.out.println("before advice");
    }
}
