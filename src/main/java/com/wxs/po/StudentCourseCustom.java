package com.wxs.po;

public class StudentCourseCustom extends StudentCourse{
    private Course course;

    private String teacherName;

    private String studentName;

    private String courseVideoPath;

    public String getCourseVideoPath() {
        return courseVideoPath;
    }

    public void setCourseVideoPath(String courseVideoPath) {
        this.courseVideoPath = courseVideoPath;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
