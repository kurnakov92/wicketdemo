package com.kurnakov.wicketdemo.config;

import org.apache.wicket.protocol.http.WicketFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value = "/*", initParams = {
        @WebInitParam(name = "applicationClassName", value = "com.kurnakov.wicketdemo.config.WicketApplication"),
        @WebInitParam(name = "filterMappingUrlPattern", value = "/*")})
public class ProjectFilter extends WicketFilter{
}
