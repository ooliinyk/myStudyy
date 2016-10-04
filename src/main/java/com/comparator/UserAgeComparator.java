package com.comparator;

import java.util.Comparator;

/**
 * Created by user on 09.06.2016.
 */
public class UserAgeComparator implements Comparator<User> {


    public int compare(User user1, User user2){
        return user1.getAge()-user2.getAge();
    }
}
