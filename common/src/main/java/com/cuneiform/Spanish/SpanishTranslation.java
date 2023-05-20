package com.cuneiform.Spanish;
import com.cuneiform.*;

public class SpanishTranslation extends Translation {
    public SpanishTranslation(String word) {
        this.word = word;
        translation_URI = "https://www.spanishdict.com/translate/";
        webScraper = new WebScraper(getURI());      
        
        translation = webScraper.getDoc().getElementsByClass("rJcwZIBc").get(0).text();
    }
}