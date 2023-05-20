package com.cuneiform;

import java.util.ArrayList;

public abstract class Conjugation {
    protected String conjugation_URI;
    
    protected String word;
    protected WebScraper webScraper;
    
    public abstract ArrayList<ArrayList<String>> getConjugationsAsList();
    public abstract String getRandomConjugation();

    public String getURI() { return conjugation_URI + word; }
}
