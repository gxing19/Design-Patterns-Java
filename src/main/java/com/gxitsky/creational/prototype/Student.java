package com.gxitsky.creational.prototype;

public class Student implements Cloneable{

    private Integer grade;

    public Student(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    public Student setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
