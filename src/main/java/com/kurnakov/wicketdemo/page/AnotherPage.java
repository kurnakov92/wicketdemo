package com.kurnakov.wicketdemo.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class AnotherPage extends WebPage {

    public AnotherPage(PageParameters parameters) {
        super(parameters);
        this.add(new Label("anotherMessage", "It's another page"));
    }
}
