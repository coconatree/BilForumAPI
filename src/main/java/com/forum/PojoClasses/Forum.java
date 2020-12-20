package com.forum.PojoClasses;

import org.springframework.stereotype.Component;

@Component
public class Forum
{
    private String id;
    private String name;

    /**************************************************************************/

    public String getId() { return this.id; }

    public String getName()
    {
        return this.name;
    }

    /**************************************************************************/

    public void setId(String id) { this.id = id; }

    public void setName(String name)
    {
        this.name = name;
    }
}
