package com.graphqltutorial.demo;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class HelloQuery implements GraphQLQueryResolver{
    public String hello() {
        return "Hello World!";
    }

    public String greeting(String name) {
        return String.format("Hello, %s", name);
    }
}
