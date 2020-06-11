package com.wxs.service;

import com.wxs.po.Course;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CourseVideoService {
    int saveVideo(Course course, MultipartFile video) throws IOException;
}
