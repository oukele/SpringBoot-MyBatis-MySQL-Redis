package com.example.demo.model;

public class Student {
    private Integer id;

    private String numbercode;

    private String stuname;

    private String stusex;

    private Integer stuage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumbercode() {
        return numbercode;
    }

    public void setNumbercode(String numbercode) {
        this.numbercode = numbercode == null ? null : numbercode.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex == null ? null : stusex.trim();
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", numbercode='" + numbercode + '\'' +
                ", stuname='" + stuname + '\'' +
                ", stusex='" + stusex + '\'' +
                ", stuage=" + stuage +
                '}';
    }
}