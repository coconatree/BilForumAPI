package com.forum.Controllers;

import com.forum.PojoClasses.Post;
import com.forum.PojoClasses.User;
import com.forum.Services.LoginService;
import com.forum.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/login")
public class LoginController
{
    @Autowired
    LoginService ls;

    @GetMapping(value = "/getUser/{USERNAME}/{PASSWORD_HASHED}")

    public User getTopTen(@PathVariable(value = "USERANME") String USERNAME, @PathVariable(value = "PASSWORD_HASHED") String PASSWORD_HASHED)
    {
        try
        {
            return ls.getUser(USERNAME, PASSWORD_HASHED);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
