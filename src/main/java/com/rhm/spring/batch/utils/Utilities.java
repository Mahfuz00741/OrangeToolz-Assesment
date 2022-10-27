package com.rhm.spring.batch.utils;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class Utilities {

    public boolean checkEmail(String email) {
        boolean res = false;
        String emailRegex = "^(.+)@(.+)[.](.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(email);
        if (emailMatcher.matches()) {
            res = true;
        }
        return res;
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        boolean res = false;
        String phoneRegex = "^(1\\s?)?(\\d{3}|\\(\\d{3}\\))[\\s\\-]?\\d{3}[\\s\\-]?\\d{4}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(phoneNumber);
        if (phoneMatcher.matches()) {
            res = true;
        }
        return res;
    }



}
