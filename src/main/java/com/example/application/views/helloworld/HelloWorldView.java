package com.example.application.views.helloworld;

import com.example.application.business.ExcelReader;
import com.example.application.business.User;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;import com.example.application.views.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;


@Route(value = "hello", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Upload Data")
@CssImport("styles/views/helloworld/hello-world-view.css")
public class HelloWorldView extends HorizontalLayout {

    @Autowired
    public HelloWorldView(ExcelReader excelReader) {
        setId("hello-world-view");
        setVerticalComponentAlignment(Alignment.END);

        final Grid<User> grid = new Grid<>();
        grid.setSizeFull();
        grid.addColumn(User::getLastName).setHeader("Last Name");
        grid.addColumn(User::getFirstName).setHeader("First Name");
        grid.addColumn(User::getSex).setHeader("Sex");
        grid.addColumn(User::getReportedRace).setHeader("Race");
        grid.addColumn(User::getEthnicity).setHeader("Ethnicity");
        grid.addColumn(User::getStreetAddress).setHeader("Street Address");
        grid.addColumn(User::getCity).setHeader("City");
        grid.addColumn(User::getState).setHeader("State");
        grid.addColumn(User::getZip).setHeader("Zip");
        grid.addColumn(User::getEmail).setHeader("Email");
        grid.addColumn(User::getHomeTelephone).setHeader("Home Phone");
        grid.addColumn(User::getCeullarPhonePager).setHeader("Cell Phone");

        MemoryBuffer memoryBuffer = new MemoryBuffer();

        Upload upload = new Upload(memoryBuffer);
        upload.addFinishedListener(e -> {
            InputStream inputStream = memoryBuffer.getInputStream();
            System.out.println(excelReader.readExcell(inputStream));
        });
        add(upload);
    }

}
