package com.remoteconfig.example1.demo.config;

import org.springframework.core.env.EnumerablePropertySource;

import java.util.Map;

public class MyPropertySource extends EnumerablePropertySource<Map<String,String>> {

    public MyPropertySource(String name, Map source) {
        super(name, source);
    }

    //获取所有的配置名字
    @Override
    public String[] getPropertyNames() {
        return source.keySet().toArray(new String[source.size()]);
    }

    //根据配置返回对应的属性
    @Override
    public Object getProperty(String name) {
        return source.get(name);
    }
}