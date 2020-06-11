package com.wxs.po;

public class CourseVideo {
    private Integer id;
    private String name;
    private String filepath;

    public CourseVideo() {
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
        this.name = name;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        return "CourseVideo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", filepath='" + filepath + '\'' +
                '}';
    }
}
