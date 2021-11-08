package com.designpatterns.structural.proxy.cglib_dynamic2;

import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DynamicBean {

    private Object obj = null;
    private BeanMap beanMap = null;

    public DynamicBean() {
        super();
    }

    @SuppressWarnings("rawtypes")
    public DynamicBean(Map propertyMap) {
        //map转对象
        this.obj = generateBean(propertyMap);
        this.beanMap = BeanMap.create(this.obj);
        Set keySet = propertyMap.keySet();
        for (Iterator iterator = keySet.iterator(); iterator.hasNext(); ) {
            String key = (String) iterator.next();
            beanMap.put(key, propertyMap.get(key));
        }
    }

    /**
     * 创建具有属性的Bean
     *
     * @param propertyMap
     * @return
     */
    @SuppressWarnings("rawtypes")
    private Object generateBean(Map propertyMap) {
        BeanGenerator generator = new BeanGenerator();
        Set keySet = propertyMap.keySet();
        for (Iterator iterator = keySet.iterator(); iterator.hasNext(); ) {
            String key = (String) iterator.next();
            generator.addProperty(key, propertyMap.get(key).getClass());
        }
        Object object = generator.create();
        return object;
    }

    /**
     * 给Bean设置值
     *
     * @param key
     * @param value
     */
    public void setValue(Object key, Object value) {
        beanMap.put(key, value);
    }


    public Object getValue(String key) {
        return beanMap.get(key);
    }

    /**
     * 得到该实体bean对象
     *
     * @return
     */
    public Object getObject() {
        return this.obj;
    }

}
