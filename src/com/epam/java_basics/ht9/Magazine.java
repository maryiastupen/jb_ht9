package com.epam.java_basics.ht9;

import java.util.Date;

public class Magazine extends PrintedEdition {
    private int releaseNumber;
    private Date releaseDate;

    public Magazine(Date dateOfAppearanceInTheLibrary, int id, Date releaseDate, int releaseNumber) {
        super(dateOfAppearanceInTheLibrary, id);
        this.releaseNumber = releaseNumber;
        this.releaseDate = releaseDate;
    }

    public Magazine(Date dateOfAppearanceInTheLibrary, int id, String title, int releaseNumber, Date releaseDate) {
        super(dateOfAppearanceInTheLibrary, id, title);
        this.releaseNumber = releaseNumber;
        this.releaseDate = releaseDate;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getAllInfo() {
        return super.getAllInfo() + "Release number is \'" + releaseNumber + "\'\nRelease date is \'" + releaseDate + "\'\n";
    }
}
