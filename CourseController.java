
package com.javalikes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/course")
    public String getCourseDetails() {
        return "Welcome to Java Likes - Full Stack Course!";
    }
}
