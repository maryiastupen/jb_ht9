package com.epam.java_basics.ht9;

import java.util.Date;

public class ScientificMagazine extends Magazine {
    private String researchField;

    public ScientificMagazine(Date dateOfAppearanceInTheLibrary, int id, String title, int releaseNumber, Date releaseDate, String researchField) {
        super(dateOfAppearanceInTheLibrary, id, title, releaseNumber, releaseDate);
        this.researchField = researchField;
    }

    @Override
    public int getReleaseNumber() {
        return super.getReleaseNumber();
    }

    @Override
    public Date getReleaseDate() {
        return super.getReleaseDate();
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + "Research field is \'" + researchField + "\'\n";
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public String getResearchField() {
        return researchField;
    }
}
