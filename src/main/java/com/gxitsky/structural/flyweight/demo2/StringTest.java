package com.gxitsky.structural.flyweight.demo2;

/**
 * @author gxing
 * @desc TODO
 * @date 2021/11/2
 */
public class StringTest {

    public static void main(String[] args) {
//        hello();
        world();
    }

    public static void world() {
        String s1 = "HelloWorld";
        String s2 = "HelloWorld";
        String s3 = "Hello" + "World";
        String s4 = "Hello" + new String("World");
        String s5 = new String("HelloWorld");
        String s6 = s5.intern();
        String s7 = "Hello";
        String s8 = "World";
        String s9 = s7 + s8;

        System.out.println(s1 == s2);    //true
        System.out.println(s1 == s3);    //true
        System.out.println(s1 == s4);    //false
        System.out.println(s1 == s9);    //false
        System.out.println(s4 == s5);    //false
        System.out.println(s1 == s6);    //true
    }

    public static void hello() {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;

        // JDK8
        System.out.println(s1 == s2);    //true,
        System.out.println(s1 == s3);    //false, s3重新在堆中申请了一块内存地址
        System.out.println(s1 == s4);    //false, s4是hel 和 new String("lo")两个对象相加,结果在堆中
        System.out.println(s1 == s9);    //false,
        System.out.println(s4 == s5);    //false
        System.out.println(s1 == s6);    //true,

    }

}
