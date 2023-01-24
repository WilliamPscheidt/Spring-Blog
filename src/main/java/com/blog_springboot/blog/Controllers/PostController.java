package com.blog_springboot.blog.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog_springboot.blog.Controllers.Utils.DelPosts;
import com.blog_springboot.blog.Controllers.Utils.GetPosts;
import com.blog_springboot.blog.Controllers.Utils.PostPosts;
import com.blog_springboot.blog.Controllers.Utils.PutPosts;

@RestController
public class PostController {
    
    @GetMapping(value="/posts")
    public ResponseEntity<GetPosts> getPosts(@RequestBody GetPosts getPosts) {
        return new ResponseEntity<>(getPosts, HttpStatus.OK);
    }

    @PostMapping(value="/posts")
    public ResponseEntity<String> postPosts(@RequestBody PostPosts postPosts) {
        return new ResponseEntity<>("Post created", HttpStatus.CREATED);
    }

    @PutMapping(value="/posts")
    public ResponseEntity<String> putPosts(@RequestBody PutPosts putPosts) {
        return new ResponseEntity<>("Post updated", HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value="/posts")
    public ResponseEntity<String> delPosts(@RequestBody DelPosts delPosts) {
        return new ResponseEntity<>("Post deleted", HttpStatus.NO_CONTENT);
    }
}
