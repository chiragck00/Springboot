package com.springboot.learning.hateoas;

import org.springframework.hateoas.Link;

import java.util.ArrayList;
import java.util.List;

public class HateoasLink {
    private List<Link> links = new ArrayList<>();

    public void addLinks(Link data){
        links.add(data);
    }

    public List<Link> getLinks() {
        return links;
    }
}
