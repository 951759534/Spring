package org.aop;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by K550jk on 2017/5/2.
 */
 class MyAdvisor extends StaticMethodMatcherPointcutAdvisor {
     @Override
     public boolean matches(Method method,Class<?> aClass){
       boolean ret = false;
       ret = method.getName().equals("remove");
       return ret;
     }
     public ClassFilter getClassFilter(){
       return  new ClassFilter() {
        @Override
        public boolean matches(Class<?> clazz) {
          boolean ret = false;
          ret = clazz.getSimpleName().equals("Service");
          return ret;
        }
       };
     }
}
