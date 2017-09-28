package by.it;

import java.util.regex.Pattern;

public class WhatString {

    public static final String PHONE_NUMBER_REGEX = "80(29|17|33|44)[ -][0-9]{3}([ -][0-9]{2}){2}";
    public static final String EMAIL_REGEX = "^[-\\w.]+@([A-z0-9][-A-z0-9]+\\.)+[A-z]{2,4}$";
    public static final String SURNAME_REGEX = "^[a-zA-Zа-яёА-ЯЁ\\s\\-]+$";
    public static final String SOCIAL_SECURITY_NUMBER_REGEX = "\\d+";

//test

    public static String what(String str) {//test2
        if (Pattern.matches(PHONE_NUMBER_REGEX, str)){
            return "Строка является номером телефона!!!";
        }
        if (Pattern.matches(EMAIL_REGEX, str)){
            return "Строка является e-mail !!!";
        }
        if (Pattern.matches(SURNAME_REGEX, str)){
            return "Строка является Фамилией!!!";
        }
        if (Pattern.matches(SOCIAL_SECURITY_NUMBER_REGEX, str)){
            return "Строка является номером социального страхования!!!";
        }
        if (str ==""){
            return "Вы ни чего не ввели!!!";
        }
        else {
            return "Неизвестная строка";
        }
    }

}
