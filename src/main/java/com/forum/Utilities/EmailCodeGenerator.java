package com.forum.Utilities;

public class EmailCodeGenerator
{
    public static String createEmailCode()
    {
          return Double.toString(Math.random() * 10000000).substring(0, 4);
    }

    public static void main(String[] args)
    {
        System.out.println(createEmailCode());
        System.out.println(createEmailCode());
        System.out.println(createEmailCode());
        System.out.println(createEmailCode());
        System.out.println(createEmailCode());
    }



}
