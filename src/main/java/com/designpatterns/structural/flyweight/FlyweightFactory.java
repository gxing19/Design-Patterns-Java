package com.designpatterns.structural.flyweight;

import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author gxing
 * @desc 享元工厂
 * @date 2021/7/13
 */
public class FlyweightFactory {

    private static HashMap<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();

    public static Flyweight getFlyweight(String key) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Flyweight flyweight = flyweightMap.get(key);
        if (!Objects.isNull(flyweight)) {
            return flyweight;
        } else {
            Reflections reflections = new Reflections("com.designpatterns.structural.flyweight");
            Set<Class<? extends Flyweight>> clazzs = reflections.getSubTypesOf(Flyweight.class);
            Iterator<Class<? extends Flyweight>> iterator = clazzs.iterator();
            while (iterator.hasNext()){
                Class<? extends Flyweight> clazz = iterator.next();
                KeyAnnotation annotation = clazz.getAnnotation(KeyAnnotation.class);
                String key1 = annotation.key();
                if (key.equals(key1)) {
                    Constructor<? extends Flyweight> constructor = clazz.getConstructor(String.class);
                    flyweight = constructor.newInstance(key);
                    flyweightMap.put(key, flyweight);
                }
            }


//            Class<?>[] interfaces = Flyweight.class.getDeclaredClasses();
            /*for (int i = 0; i < clazzs.size(); i++) {
                Class<?> aClass = clazzs[i];
                KeyAnnotation annotation = aClass.getAnnotation(KeyAnnotation.class);
                String key1 = annotation.key();
                if (key.equals(key1)) {
                    flyweightMap.put(key, (Flyweight) aClass.newInstance());
                }
            }*/
            return flyweight;
        }
    }
}
