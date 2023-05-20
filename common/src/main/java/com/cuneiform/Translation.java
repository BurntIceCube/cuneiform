package com.cuneiform;

public abstract class Translation {
    protected String translation_URI;
    protected String translation;

    protected String word;
    protected WebScraper webScraper;

    public String getURI() { return translation_URI + word; }
    public String getTranslation() { return this.translation; }
}