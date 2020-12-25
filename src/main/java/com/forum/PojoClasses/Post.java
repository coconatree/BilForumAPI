package com.forum.PojoClasses;

public class Post
{
    private String id;

    private String views;
    private String votes;

    /***********************************************************************************/

    private String title;
    private String content;

    private String author;
    private String date;

    private String tags;

    private String comments;
    private String answers;

    /***********************************************************************************/

    public Post()
    {

    };

    /***********************************************************************************/

    public Post(String id, String views, String votes, String title, String content, String author, String date, String tags, String comments, String answers)
    {
        this.id = id;
        this.views = views;
        this.votes = votes;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
        this.tags = tags;

        this.comments = comments;
        this.answers = answers;
    }

    /***********************************************************************************/

    @Override
    public String toString()
    {
        return String.format("Id: %s - Views: %s - Votes: %s - Title: %s - Content: %s - Author: %s - Date: %s Tags: %s - Comments: %s - Answers: %s",

                this.id,
                this.views,
                this.votes,
                this.title,
                this.content,
                this.author,
                this.date,
                this.tags,
                this.comments,
                this.answers
        );
    }

    /***********************************************************************************/

    public String getId()
    {
        return id;
    }

    public String getViews()
    {
        return views;
    }

    public String getVotes()
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

    public void setViews(String views)
    {
        this.views = views;
    }

    public void setVotes(String votes)
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

    /***********************************************************************************/

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
}
