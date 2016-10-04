package com.comparator;

import java.util.Comparator;

/**
 * Created by user on 09.06.2016.
 */
public class UserBirthdayComparator implements Comparator<User>{
    public int compare(User o1, User o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
