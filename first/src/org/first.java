package org;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by K550jk on 2017/3/3.
 */
public class first {
    @Test public void first(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
    }
}
