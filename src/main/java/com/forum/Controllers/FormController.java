package com.forum.Controllers;

import com.forum.PojoClasses.Forum;
import com.forum.Services.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forum")
public class FormController
{
    @Autowired
    ForumService forumService;

    @GetMapping("get/{ID}")
    public String getForum(@PathVariable(value = "ID") String ID)
    {
        try
        {
            return forumService.getForum(ID);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "Error";
    }
}
