package com.cdg;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean contains = StringUtils.contains("안녕하세요", "요");
        System.out.println(contains);

        String differ = StringUtils.difference("123456","129456");
        System.out.println(differ);

        String getDigit = StringUtils.getDigits("123ddwad456");
        System.out.println(getDigit);

        System.out.println(StringUtils.defaultString(null));

        String remove = StringUtils.remove("가나가다라가가마바사","가");
        System.out.println(remove);



    }
}
