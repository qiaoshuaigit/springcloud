package com.shuai.userapigatewaydynamicfilter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author shuaion 2017/10/27
 * 加载自定义属性配置文件类
 **/
@ConfigurationProperties("zuul.filter")
public class FilterConfig {

    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
