package com.epam.java_basics.ht9;

import java.util.Date;

public class Launcher{

    public static void main(String[] args) {
        PrintedEdition scientificMagazine = new ScientificMagazine(
                new Date(5, 10, 2016), 56, "Around the world", 2598,
                new Date(5, 10, 2013), "Geography");

        Printer printer = new Printer();
        printer.print(scientificMagazine.getId(), scientificMagazine.getAllInfo());
        if (scientificMagazine instanceof ScientificMagazine) {
            ScientificMagazine scMagazine = (ScientificMagazine) scientificMagazine;
            printer.print(scMagazine.getResearchField(), scMagazine.getReleaseDate(), scMagazine.getReleaseNumber());
        }
    }
}
