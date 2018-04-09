package com.kurnakov.wicketdemo.page;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {

    public HomePage(PageParameters parameters) {
        super(parameters);

        this.add(new Label("helloMessage", "Hello WicketWorld!"));

    }


}
