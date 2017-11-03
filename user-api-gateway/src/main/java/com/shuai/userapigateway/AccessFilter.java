package com.shuai.userapigateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author shuaion 2017/10/24
 **/
public class AccessFilter extends ZuulFilter{

    private Logger logger = LoggerFactory.getLogger(ZuulFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String accessToken = request.getParameter("accessToken");
        if(accessToken==null){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            requestContext.setResponseBody("accessToken is empty!");
            logger.info("accesstoken is empty");
            return null;
        }
        logger.info("accesstoken="+accessToken);
        return null;
    }
}
