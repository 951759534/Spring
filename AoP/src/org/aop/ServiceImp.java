package org.aop;

/**
 * Created by K550jk on 2017/5/1.
 */
public class ServiceImp implements Service{
    private TopicDao topicDao =new TopicDao();
    private ForumDao forumDao = new ForumDao();

    @Override
    public void removeTopic() {
        topicDao.remove();
    }

    @Override
    public void createForum() {
        forumDao.create();
    }
}
