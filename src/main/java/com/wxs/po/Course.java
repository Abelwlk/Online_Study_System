package com.wxs.po;

public class Course {
    private Integer id;

    private String name;

    private Integer teacherId;

    private Integer period;

    private Integer price;

    private Integer videoId;

    private CourseVideo courseVideo;

    public CourseVideo getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherId=" + teacherId +
                ", period=" + period +
                ", price=" + price +
                ", videoId=" + videoId +
                ", courseVideo=" + courseVideo +
                '}';
    }
}