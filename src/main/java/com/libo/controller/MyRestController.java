package com.libo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class MyRestController {

    @RequestMapping(value="/{user}", method=RequestMethod.GET)
    public String getUser(@PathVariable Long user) {
        return String.valueOf(user);
    }

    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
    List<String> getUserCustomers(@PathVariable Long user) {
    	List<String> list = new ArrayList<String>();
    	list.add("hello");
    	return list;
    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long user) {
    	return "hello";
    }

}
