package com.kurnakov.wicketdemo.config;

import com.kurnakov.wicketdemo.page.HomePage;
import org.apache.wicket.Page;
import org.apache.wicket.core.util.file.WebApplicationPath;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {

    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

    @Override
    public void init()
    {
        getResourceSettings().getResourceFinders().add(
                new WebApplicationPath(getServletContext(), "com/kurnakov/wicketdemo/page/"));
    }
}
