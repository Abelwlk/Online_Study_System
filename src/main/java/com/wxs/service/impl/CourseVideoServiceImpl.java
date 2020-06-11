package com.wxs.service.impl;

import com.wxs.mapper.CourseVideoMapper;
import com.wxs.po.Course;
import com.wxs.po.CourseVideo;
import com.wxs.service.CourseVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class CourseVideoServiceImpl implements CourseVideoService {

    @Autowired
    private CourseVideoMapper courseVideoMapper;

    private static final String VIDEO_PATH="/video/";

    @Override
    public int saveVideo(Course course, MultipartFile video) throws IOException {

        String oldName  = video.getOriginalFilename();
        String extName = oldName.substring(oldName.lastIndexOf("."));

        String videoName=course.getName()+extName;
        String filepath=VIDEO_PATH+videoName;

        CourseVideo courseVideo=new CourseVideo();
        courseVideo.setName(videoName);
        courseVideo.setFilepath(filepath);

        video.transferTo(new File(filepath));

        courseVideoMapper.addVideo(courseVideo);
        return courseVideo.getId();
    }
}
