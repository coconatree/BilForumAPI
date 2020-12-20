package com.forum.Controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.forum.PojoClasses.User;
import com.forum.Services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @GetMapping(value = "/getAll")
    public ArrayList<User> getAllUsers()
    {
        try
        {
            return registerService.getAllUsers();
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
            System.out.println(exc.getMessage());
        }
        return null;
    }
    @PutMapping("/addUser")
    public ResponseEntity<User> addPost(@RequestBody String data)
    {
        ObjectMapper mapper = new ObjectMapper();

        User user = null;

        try
        {
            user = mapper.readValue(data, new TypeReference<User>(){});
            registerService.addUser(user);
        }
        catch (IOException | ExecutionException | InterruptedException e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
