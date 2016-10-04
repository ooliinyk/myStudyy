package com.comparatorTet;

import com.comparator.User;
import com.comparator.UserAgeComparator;
import com.comparator.UserBirthdayComparator;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 09.06.2016.
 */
public class UserComaratorTest {
    private Set<User> users;

    @Before
    public void setUp() throws Exception {
        // Инициализируем наш список и указываем наш компаратор
        // который будет выполнять фильтрацию элементов и их положение в списке
        users = new TreeSet<User>(new UserBirthdayComparator());
    }
    @Test
    public void test() throws Exception{
        User user1 =new User("Name1","surname1", 18,new Date(),12);
        Thread.sleep(100);
        User user2 =new User("Name2","surname2", 11,new Date(),1112);
        Thread.sleep(100);
        User user3 =new User("Name3","surname3", 123,new Date(),123);
        Thread.sleep(100);
        User user4 =new User("Name4","surname4", 12,new Date(),333);
        Thread.sleep(100);
        User user5 =new User("Name5","surname5", 33,new Date(),133);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        for (User user : users){
            System.out.println(user);
        }
    }

}
