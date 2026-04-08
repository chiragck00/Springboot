package com.springboot.learning.hateoas;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerH {

    @GetMapping("/get")
    public ResponseEntity<UserResponse> getUser(@RequestParam int id, @RequestParam String name){
        UserResponse output = new UserResponse();
        output.setId(id);
        output.setName(name);
        output.setMessage("Fetched");

        Link curr = WebMvcLinkBuilder.linkTo(ControllerH.class)
                .slash("delete-user")
                .slash(id)
                .withRel("delete")
                .withType("DELETE");
        output.addLinks(curr);

        curr = WebMvcLinkBuilder.linkTo(ControllerH.class)
                .slash("fetch-user")
                .slash(id)
                .withSelfRel()
                .withType("GET");
        output.addLinks(curr);

        return ResponseEntity.status(HttpStatus.OK).body(output);
    }

    @GetMapping("/post")
    public ResponseEntity<Object> postUser(@RequestParam int id, @RequestParam String name){
        UserResponse output = new UserResponse();
        output.setId(id);
        output.setName(name);
        output.setMessage("Posted");

        Link curr = Link.of("/api/delete-user" + id).withType("DELETE").withRel("delete");
        output.addLinks(curr);

        curr = Link.of("/api/fetch-user" + id).withType("GET").withSelfRel();
        output.addLinks(curr);
        System.out.println(output.toString());
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}
