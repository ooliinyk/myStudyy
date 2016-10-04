package com.codeWars.validPhoneNumber;

import com.codewars.completed.validPhoneNumber.Kata;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17.06.2016.
 */
public class KataTest {

    @Test
    public void tests() {
        assertEquals(true, Kata.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, Kata.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, Kata.validPhoneNumber("(098) 123 4567"));
//        assertEquals(true, Kata.validPhoneNumber("+38(066)1234567"));
    }
}
