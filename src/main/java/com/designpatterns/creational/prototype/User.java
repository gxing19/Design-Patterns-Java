package com.designpatterns.creational.prototype;

public class User implements Cloneable {

    private String name;
    private Integer age;

    private Student student;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public User setStudent(Student student) {
        this.student = student;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User result = (User) super.clone();
        if (result != null) {
            result.student = (Student) student.clone();
        }
        return result;
    }
}
