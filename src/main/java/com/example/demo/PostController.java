package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/posts")
public class PostController {

    List<Post> postList = new ArrayList<>(
           List.of(
                   new Post(1L,"Hello"),
                   new Post(2L,"Programing")
           )
    );

    @GetMapping("")
    List<Post> findAll(){
        return postList;
    }
}
