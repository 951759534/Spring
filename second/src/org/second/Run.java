package org.second;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by K550jk on 2017/3/13.
 */
public class Run {
    public static void main(String[] args){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Car car = (Car)ctx.getBean("car");
        car.printData();
        Car car1 = (Car)ctx.getBean("car1");
        car1.Run();
        Boss boss1 = (Boss)ctx.getBean("boss1");
        boss1.getCar().Run();     //抽象工厂模式
    }
}
