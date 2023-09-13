package com.christabel.thirdpartyapi.controller;

import com.christabel.thirdpartyapi.postService.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {
@Autowired
private PostService postService;
    @GetMapping("/getPosts")
    List<Map<String,Object>> getAllPosts()
    {
      return  postService.getPosts();
    };

    @GetMapping("/getPostsById/{id}")
    Map<String,Object> getPostsById(@PathVariable int id)
    {
        return  postService.getPostById(id);
    };

    @PostMapping ("/insertPosts")
    Map<String,Object> insertPosts(@RequestBody Map<String,Object>payload )
    {
        return  postService.insertPosts(payload);
    };

    @PutMapping ("/updatePosts/{id}")
    Map<String,Object> updatePosts(@RequestBody Map<String,Object>payload, @PathVariable int id  )
    {
        return  postService.updatePosts(payload, id);
    };

    @DeleteMapping ("/deletePosts/{id}")
    Map<String,Object> updatePosts(@PathVariable int id  )
    {
        return  postService.deletePosts(id);
    };
}
