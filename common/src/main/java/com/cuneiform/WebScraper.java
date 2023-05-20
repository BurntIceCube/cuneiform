package com.cuneiform;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScraper {
    
    private String URI;
    private Document doc;

    public WebScraper(String URI) {
        this.URI = URI;
        readWebPage();
    }

    public void readWebPage() {
        try {
            this.doc = Jsoup.connect(URI).get();
        } catch ( Exception e ) {
            this.doc = null;
            e.printStackTrace();
        }
    }

    public Document getDoc() {
        return doc;
    }
}