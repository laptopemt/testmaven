package com.mglazier.mavendemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleClass {

    @RequestMapping("/")
    public String sendMessage()
    {
        return "This is a response from sendMessage()";
    }
}
