package com.workintech.fswebs17d1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class silinecek {
    @Value("${course.name}")
    private String courseName;
    @Value("${project.developer.fullname}")
    private String projectDeveloperFullname;
}
