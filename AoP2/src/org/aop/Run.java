package org.aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by K550jk on 2017/5/2.
 */
public class Run {
    public static void main(String[] args){
       /* AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Dao service = (Dao) ctx.getBean("service");
        service.create();
        service.remove("aa");*/
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new Service());
        pf.addAdvice(new BeforeAdvisor());
        MyAdvisor advisor = new MyAdvisor();
        advisor.setAdvice(new BeforeAdvisor());
        Dao service = (Dao)pf.getProxy();
        service.create();
        service.remove("aa");
    }
}
