package com.cuneiform;
import com.cuneiform.Spanish.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpanishImageTest {

    @Test
    public void createNewSpanishImageWithHablar_Expects_getURINotNull() {
        Image newSpanishImage = new SpanishImage("hablar");
        assertNotNull(newSpanishImage.getURI());
    }

    @Test
    public void createNewWebScraperWithHablarURIParseImagesByClass_Expects_HtmlOfFirstImageNotEmpty() {
        WebScraper webScraper = new WebScraper("https://www.spanishdict.com/translate/hablar");
        String imgClass = webScraper.getDoc().getElementsByClass("feGz0xPq").get(0).html();
        assertNotEquals("", imgClass);
    }    

    @Test
    public void createNewSpanishImageWithHablar_Expects_imagePathsNotNull() {
        SpanishImage newSpanishImage = new SpanishImage("hablar");
        assertNotNull(newSpanishImage.getImages());
    }
}