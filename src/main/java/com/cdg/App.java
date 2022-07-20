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
        System.out.println(contains );
    }
}
