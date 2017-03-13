package org.bll;
import org.dal.interfaces.DAL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BLL {
    public static void main(String [] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        DAL dal = (DAL)ctx.getBean("MySqlDAL");
        dal.Query();
    }
}
