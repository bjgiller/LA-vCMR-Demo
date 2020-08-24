package com.example.application.views.about;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.views.main.MainView;

@Route(value = "about", layout = MainView.class)
@PageTitle("Errors")
@CssImport("styles/views/about/about-view.css")
public class AboutView extends Div {

    public AboutView() {
        setId("about-view");

    }

}
