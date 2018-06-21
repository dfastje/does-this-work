package com.byelkawolf.doesthiswork.controllers;

import com.byelkawolf.doesthiswork.services.RestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dfast on 7/11/2017.
 */
@Controller
@RequestMapping("/interview")
public class RestDemoController {

    @Autowired
    RestDemoService restDemoService;

    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public @ResponseBody String demo1() {
        return "Hello World";
    }

    @RequestMapping(value = "/demo2", method = RequestMethod.GET)
    public ResponseEntity<String> demo2() {
        return ResponseEntity.ok().build();
    }


}
