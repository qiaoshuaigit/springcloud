package com.shuai.userapigatewaydynamicfilter;

import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableConfigurationProperties({FilterConfig.class})
@SpringBootApplication
public class UserApiGatewayDynamicFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApiGatewayDynamicFilterApplication.class, args);
	}
	@Bean
	public FilterLoader filterLoader(FilterConfig filterConfig){
		FilterLoader filterLoader = FilterLoader.getInstance();
		filterLoader.setCompiler(new GroovyCompiler());

		FilterFileManager.setFilenameFilter(new GroovyFileFilter());
		try {
			FilterFileManager.init(filterConfig.getInterval(),
                    filterConfig.getRoot()+"/pre",
                    filterConfig.getRoot()+"/post");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filterLoader;
	}
}
