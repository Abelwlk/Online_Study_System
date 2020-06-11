package com.wxs.test;

import com.wxs.mapper.CourseMapper;
import com.wxs.mapper.CourseVideoMapper;
import com.wxs.po.Course;
import com.wxs.po.CourseVideo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件,需要用到的配置文件，如果是dao的话可以不用spring-service.xml
@ContextConfiguration({ "classpath:spring/applicationContext-*.xml"})
public class videoTest {

    @Autowired
    CourseVideoMapper courseVideoMapper;

    @Autowired
    CourseMapper courseMapper;

    @Test
    public void insertvideo(){
        CourseVideo courseVideo=new CourseVideo();
        courseVideo.setName("aa");
        courseVideo.setFilepath("aa");
        courseVideoMapper.addVideo(courseVideo);
        System.out.println(courseVideo.getId());
    }

    @Test
    public void insertCourse(){
        Course course=new Course();
        course.setVideoId(10);
        course.setName("aa");
        course.setTeacherId(25);
        course.setPeriod(2);
        course.setPrice(10);
        int insert = courseMapper.insert(course);
        System.out.println(insert);
    }

    @Test
    public void selectV(){
        Course course = courseMapper.selectByPrimaryKey(25);
        System.out.println(course);
    }
}
