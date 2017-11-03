package com.shuai.userapigateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * 过滤器处理异常信息
 *
 * @author shuaion 2017/10/24
 **/
@Component
public class ThrowFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(ThrowFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        logger.info("here is ThrowFilter");
        RequestContext requestContext = RequestContext.getCurrentContext();
        try {
            doSome();
        }catch (Exception e){
            requestContext.set("error.status-code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            requestContext.set("error.exception",e);
        }
        return null;
    }

    protected void doSome() {
        int i = 1/0;
    }
}
