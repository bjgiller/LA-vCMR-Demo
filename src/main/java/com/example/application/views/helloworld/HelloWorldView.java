package com.example.application.views.helloworld;

import com.example.application.business.ExcelReader;
import com.example.application.business.User;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.data.selection.SingleSelect;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;import com.example.application.views.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.klaudeta.PaginatedGrid;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;


@Route(value = "hello", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Upload Data")
@CssImport("styles/views/helloworld/hello-world-view.css")
public class HelloWorldView extends HorizontalLayout {

    PaginatedGrid<User> grid;

    @Autowired
    public HelloWorldView(ExcelReader excelReader) {
        setId("hello-world-view");
        setVerticalComponentAlignment(Alignment.END);

        grid = new PaginatedGrid<>();
        grid.setSizeFull();
        grid.addColumn(User::getLastName).setHeader("Last Name").setSortable(true);
        grid.addColumn(User::getFirstName).setHeader("First Name").setSortable(true);
        grid.addColumn(User::getSex).setHeader("Sex").setSortable(true);
        grid.addColumn(User::getReportedRace).setHeader("Race").setSortable(true);
        grid.addColumn(User::getEthnicity).setHeader("Ethnicity").setSortable(true);
        grid.addColumn(User::getStreetAddress).setHeader("Street Address").setSortable(true);
        grid.addColumn(User::getCity).setHeader("City").setSortable(true);
        grid.addColumn(User::getState).setHeader("State").setSortable(true);
        grid.addColumn(User::getZip).setHeader("Zip").setSortable(true);
        grid.addColumn(User::getEmail).setHeader("Email").setSortable(true);
        grid.addColumn(User::getHomeTelephone).setHeader("Home Phone").setSortable(true);
        grid.addColumn(User::getCeullarPhonePager).setHeader("Cell Phone").setSortable(true);
        grid.setSelectionMode(Grid.SelectionMode.SINGLE);
        // Sets the max number of items to be rendered on the grid for each page
        grid.setPageSize(8);

        // Sets how many pages should be visible on the pagination before and/or after the current selected page
        grid.setPaginatorSize(5);
        SingleSelect<Grid<User>, User> userSelect =  grid.asSingleSelect();
        Div div = new Div();
        div.add(grid);

        MemoryBuffer memoryBuffer = new MemoryBuffer();

        Upload upload = new Upload(memoryBuffer);
        upload.addFinishedListener(e -> {
            InputStream inputStream = memoryBuffer.getInputStream();
            List<User> users = new User().createUsers(excelReader.readExcell(inputStream));
            grid.setItems(users);
        });
        add(upload, div);
    }

}
