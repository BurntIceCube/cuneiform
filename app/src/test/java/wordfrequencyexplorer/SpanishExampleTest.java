package wordfrequencyexplorer;
import wordfrequencyexplorer.Spanish.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpanishExampleTest {

    @Test
    public void createNewSpanishExampleWithHablar_Expects_getURINotNull() {
        Example newSpanishExample = new SpanishExample("hablar");
        assertNotNull(newSpanishExample.getURI());
    }

    @Test
    public void createNewSpanishExampleWithHablarCreatesNewWebScraper_Expects_WebScraperNotNull() {
        Example newSpanishExample = new SpanishExample("habler");
        assertNotNull(newSpanishExample.webScraper);
    }

    @Test
    public void createNewSpanishExampleWithHablarPopulateExamples_Expects_getExamples_lang_AND_getExamples_ENNotNull() {
        Example newSpanishExample = new SpanishExample("hablar");
        assertNotNull(newSpanishExample.getExamples_lang());
        assertNotNull(newSpanishExample.getExamples_EN());
    }
}
