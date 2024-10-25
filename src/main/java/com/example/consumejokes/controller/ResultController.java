package com.example.consumejokes.controller;

import com.example.consumejokes.model.Jod;
import com.example.consumejokes.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@RestController
public class ResultController {

    final RestTemplate restTemplate;

    public ResultController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * @return title of the Joke
     */
    @GetMapping("/un-endpoint-local-flaco")
    String jokeTitle(){

        Post[] results = restTemplate.getForEntity(
                "https://jsonplaceholder.typicode.com/posts", Post[].class).getBody();

//        for (Post result: results){
//
//        }

            if (results == null ) {
                throw new RuntimeException("No encontre nada");
            }

        return "llegaron todos los posts flacos";
    }
}
