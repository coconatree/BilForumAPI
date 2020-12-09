package com.forum.Controllers;

import com.forum.PojoClasses.Post;
import com.forum.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/search")
public class SearchController
{
    @GetMapping(
            value = "/allForums/{QUERY}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )

    public void getSearchQuery(@PathVariable(value = "QUERY") String QUERY)
    {
        System.out.println(QUERY);
    }
}
