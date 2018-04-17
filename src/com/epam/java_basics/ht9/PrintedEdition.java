package com.epam.java_basics.ht9;

import java.util.Date;

public class PrintedEdition {
    private Date dateOfAppearanceInTheLibrary;
    private int id;
    private String title;

    public PrintedEdition(Date dateOfAppearanceInTheLibrary, int id) {
        this.dateOfAppearanceInTheLibrary = dateOfAppearanceInTheLibrary;
        this.id = id;
    }

    public PrintedEdition(Date dateOfAppearanceInTheLibrary, int id, String title) {
        this.dateOfAppearanceInTheLibrary = dateOfAppearanceInTheLibrary;
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAllInfo() {
        return "Title is \'" + title + "\'\nDate of appearance is \'" + dateOfAppearanceInTheLibrary +
                "\'\nId is \'" + id + "\'\n";
    }
}
