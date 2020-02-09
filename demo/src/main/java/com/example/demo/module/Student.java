package com.example.demo.module;

public class Student {
    private String name=null;
    private String grade=null;
    private String subject=null;
    private String mark=null;

    public String getName() {
        return name;
    }

    public Student(String name, String grade, String subject, String mark) {
        this.name = name;
        this.grade = grade;
        this.subject = subject;
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
