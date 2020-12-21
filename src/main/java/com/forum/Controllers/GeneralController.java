package com.forum.Controllers;

import com.forum.PojoClasses.Post;
import com.forum.Services.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/general")
public class GeneralController
{
    @Autowired
    GeneralService gs;

    @GetMapping(value = "/createID/{NAME}")

    public String getID(@PathVariable(value = "NAME") String NAME)
    {
        try
        {
            return gs.createID(String.format("%s-", NAME));
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
            System.out.println(exc.getMessage());
        }
        return "ERROR";
    }

}
