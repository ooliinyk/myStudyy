package com.codewars.completed.validPhoneNumber;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 17.06.2016.
 */
public class Kata {
    public static boolean validPhoneNumber(String phoneNumber) {
        if(phoneNumber.matches("^[(]\\d{3}[)]\\s\\d{3}[-]\\d{4}$")) {
            return true;
        }
        return false;
//        Pattern pattern= Pattern.compile("^[(]\\d{3}[)]\\s\\d{3}[-]\\d{4}$");
//        Matcher matcher= pattern.matcher(phoneNumber);
//        return matcher.matches();

    }
}
//(123) 456-7890