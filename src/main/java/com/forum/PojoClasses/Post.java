package com.forum.PojoClasses;

import org.springframework.stereotype.Component;

@Component
public class Post
{
    private String id;

    private int views;
    private int votes;

    /***********************************************************************************/

    private String title;
    private String content;

    private String author;
    private String date;

    /***********************************************************************************/

    @Override
    public String toString()
    {
        return String.format("Id: %s - Views: %d - Votes: %d - Title: %s - Content: %s - Author: %s - Date: %s",

                this.id,
                this.views,
                this.votes,
                this.title,
                this.content,
                this.author,
                this.date

                );
    }

    /***********************************************************************************/

    public String getId()
    {
        return id;
    }

    public int getViews()
    {
        return views;
    }

    public int getVotes()
    {
        return votes;
    }

    public String getTitle()
    {
        return title;
    }

    public String getContent()
    {
        return content;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getDate()
    {
        return date;
    }

    /***********************************************************************************/

    public void setId(String id)
    {
        this.id = id;
    }

    public void setViews(int views)
    {
        this.views = views;
    }

    public void setVotes(int votes)
    {
        this.votes = votes;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

}
