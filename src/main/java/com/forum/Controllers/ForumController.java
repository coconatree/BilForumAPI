package com.forum.Controllers;

import com.forum.PojoClasses.Forum;
import com.forum.Services.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/forum")
public class ForumController
{
    @Autowired
    ForumService forumService;

    @GetMapping("get/{ID}")
    public Forum getForum(@PathVariable(value = "ID") String ID)
    {
        try
        {
            return forumService.getForum(ID);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("getAll")
    public ArrayList<Forum> getAllForum()
    {
        try
        {
            return forumService.getAllForum();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
