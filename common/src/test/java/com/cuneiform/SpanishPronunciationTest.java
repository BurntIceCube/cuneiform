package com.cuneiform;
import com.cuneiform.Spanish.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpanishPronunciationTest {
    @Test
    public void createNewSpanishPronounciationWithHablar_Expects_getURINotNull() {
        Pronunciation newSpanishPronunciation = new SpanishPronunciation("hablar");
        assertNotNull(newSpanishPronunciation.getURI());
    }

    @Test
    public void createNewWebScraperWithHablarURIParseAudioByClass_Expects_HtmlOfFirstAudioElementNotEmpty() {
        WebScraper webScraper = new WebScraper("https://www.spanishdict.com/pronunciation/hablar");
        String audioClass = webScraper.getDoc().getElementsByClass("xCXIE7uZ").get(0).html();
        assertNotEquals("", audioClass);
    }

    @Test
    public void createNewSpanishPronounciationWithHablar_Expects_spa_AND_ipa_AND_audioPathNotNull() {
        Pronunciation newSpanishPronunciation = new SpanishPronunciation("hablar");
        assertNotNull(newSpanishPronunciation.getSpa());
        assertNotNull(newSpanishPronunciation.getIpa());
        assertNotNull(newSpanishPronunciation.getAudio());
    }
}
