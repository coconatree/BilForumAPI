package com.forum.PojoClasses;

import org.springframework.stereotype.Component;

@Component
public class ID
{
    int data;

    @Override
    public String toString()
    {
        return "ID{" +
                "data=" + data +
                '}';
    }

    public int getData() {
        return data;
    }
}
