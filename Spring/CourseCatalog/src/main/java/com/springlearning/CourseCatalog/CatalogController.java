package com.springlearning.CourseCatalog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CatalogController {
    @RequestMapping("/")
    public String getCatalogHome() {
        String courseAppMessage = "";
        String courseAppUrl = "http://localhost:8080";
        RestTemplate restTemplate = new RestTemplate();
        courseAppMessage = restTemplate.getForObject(courseAppUrl, String.class);
        return("Hi, this is the course catalog! " + courseAppMessage);
    }

    @RequestMapping("/catalog")
    public String getCatalog() {
        String courses = null;
        String coursesUrl = "http://localhost:8080/courses";
        RestTemplate restTemplate = new RestTemplate();
        courses = restTemplate.getForObject(coursesUrl, String.class);
        return("List of courses available: " + courses);
    }

    @RequestMapping("first_course")
    public Course firstCourse() {
        Course firstCourse = null;
        String firstCourseUrl = "http://localhost:8080/courses/1";
        RestTemplate restTemplate = new RestTemplate();
        firstCourse = restTemplate.getForObject(firstCourseUrl, Course.class);
        return firstCourse;
    }
}
