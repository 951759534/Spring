package org.aop;

/**
 * Created by K550jk on 2017/5/2.
 */
public class Service implements Dao {
    ForumDao fdao = new ForumDao();
    TopicDao tdao = new TopicDao();
    @Override
    public void create() {
        fdao.create();
    }

    @Override
    public void remove(String topic) {
            tdao.remove(topic);
    }
}
