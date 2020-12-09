package com.forum.Controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.forum.PojoClasses.Post;
import com.forum.Services.PostService;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/post")
public class PostController
{
    @Autowired
    PostService postService;

    @GetMapping(
            value = "/getAll",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
            )

    public ArrayList<Post> getAllPosts()
    {
        try
        {
            return postService.getAllPosts();
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
            System.out.println(exc.getMessage());
        }
        return null;
    }

    @GetMapping("/get/{ID}")
    public Post getPost(@PathVariable(value="ID") String ID)
    {
        try
        {
            Post post = postService.getPost(ID);

            if(post != null)
            {
                return post;
            }
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
            System.out.println(exc.getMessage());
        }
        return null;
    }

    @PostMapping(
            value = "/post",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
            )

    public ResponseEntity<Post> addPost(@RequestBody Post post)
    {
        Post returnValue = new Post();

        returnValue.setId(post.getId());
        returnValue.setViews(post.getViews());
        returnValue.setVotes(post.getVotes());
        returnValue.setTitle(post.getTitle());
        returnValue.setContent(post.getContent());
        returnValue.setAuthor(post.getAuthor());
        returnValue.setDate(post.getDate());

        try
        {
            System.out.println(postService.addPost(post));
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return new ResponseEntity<Post>(returnValue, HttpStatus.OK);
    }

    @PutMapping("/put")
    public String addPost(@ModelAttribute Post post, Model model)
    {
        return "result";
    }

    @DeleteMapping("/delete")
    public void deletePost(HttpServletRequest request)
    {

    }
}
