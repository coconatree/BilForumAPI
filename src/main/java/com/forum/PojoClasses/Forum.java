package com.forum.PojoClasses;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Forum
{
    private String id;
    private String name;

    private ArrayList<Post> postList;

    /**************************************************************************/

    public String getId() { return this.id; }

    public String getName()
    {
        return this.name;
    }

    public ArrayList<Post> getPostList()
    {
        return this.postList;
    }

    /**************************************************************************/

    public void setId(String id) { this.id = id; }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPostList(ArrayList<Post> postList)
    {
        this.postList = postList;
    }
}
