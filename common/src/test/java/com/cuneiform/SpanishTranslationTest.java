package com.cuneiform;
import com.cuneiform.Spanish.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpanishTranslationTest {

    @Test
    public void createNewSpanishTranslationWithHablar_Expects_getURINotNull() {
        Translation newSpanishTranslation = new SpanishTranslation("hablar");
        assertNotNull(newSpanishTranslation.getURI());
    }
    
    @Test
    public void createNewWebScraperWithHablarURI_Expects_getDocNotNull() {
        WebScraper webScraper = new WebScraper("https://www.spanishdict.com/translate/hablar");
        assertNotNull(webScraper.getDoc());
    }
    
    @Test
    public void createNewSpanishTranslationWithSer_Expects_getTranslationReturnsToBe() {
        Translation newSpanishTranslation = new SpanishTranslation("Ser");
        assertEquals("to be", newSpanishTranslation.getTranslation().toLowerCase());
    }
}
