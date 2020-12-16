package com.forum.Controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.forum.PojoClasses.Post;
import com.forum.Services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/post")
public class PostController
{
    @Autowired
    PostService postService;

    @GetMapping(value = "/getAll")

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

    @PutMapping("/addPost")
    public ResponseEntity<Post> addPost(@RequestBody String data)
    {
        ObjectMapper mapper = new ObjectMapper();

        Post post = null;

        try
        {
            post = mapper.readValue(data, new TypeReference<Post>(){});
            postService.putPost(post);
        }
        catch (IOException | ExecutionException | InterruptedException e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public void deletePost(HttpServletRequest request)
    {

    }
}
