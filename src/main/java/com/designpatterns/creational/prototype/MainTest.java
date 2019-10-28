package com.designpatterns.creational.prototype;

public class MainTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Kitty", 21).setStudent(new Student(3));
        User cloneUser = (User) user.clone();

        System.out.println(user == cloneUser);
    }
}
