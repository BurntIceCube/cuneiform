package wordfrequencyexplorer;
import wordfrequencyexplorer.Spanish.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpanishWordTest {
    
    @Test
    public void createNewSpanishWordHablar_Expects_getWordReturnsHablar() {
        Word newSpanishWord = new SpanishWord("hablar");
        assertEquals("hablar", newSpanishWord.getWord());
    }

    @Test
    public void createNewSpanishWordSer_Expects_getWordReturnsSer() {
        Word newSpanishWord = new SpanishWord("ser");
        assertEquals("ser", newSpanishWord.getWord());
    } 
    
    @Test
    public void createNewSpanishWordWithHablar_Expects_getExamplesNotNull() {
        Word newSpanishWord = new SpanishWord("hablar");
        assertNotNull(newSpanishWord.getExample());
    }

    @Test
    public void createNewSpanishWordWithSer_Expects_getExamplesNotNull() {
        Word newSpanishWord = new SpanishWord("ser");
        assertNotNull(newSpanishWord.getExample());
    }

    @Test
    public void createNewSpanishWordWithSer_Expects_getRandomExampleNotNull() {
        Word newSpanishWord = new SpanishWord("ser");
        assertNotNull(newSpanishWord.getRandomExample());
    }

    @Test
    public void createNewSpanishWordWithHablar_Expects_getImageNotNull() {
        Word newSpanishWord = new SpanishWord("hablar");
        assertNotNull(newSpanishWord.getImage());
    }

    @Test
    public void createNewSpanishWordWithSer_Expects_getImageNotNull() {
        Word newSpanishWord = new SpanishWord("ser");
        assertNotNull(newSpanishWord.getImage());
    }

    @Test
    public void createNewSpanishWordWithSer_Expects_getRandomImageNotEmpty() {
        Word newSpanishWord = new SpanishWord("ser");
        assertNotEquals("", newSpanishWord.getRandomImage());
    }
    
    @Test
    public void createNewSpanishWordWithHablar_Expects_getTranslationNotNull() {
        Word newSpanishWord = new SpanishWord("hablar");
        assertNotNull(newSpanishWord.getTranslation());
    }

    @Test
    public void createNewSpanishWordWithSer_Expects_getTranslationNotNull() {
        Word newSpanishWord = new SpanishWord("ser");
        assertNotNull(newSpanishWord.getTranslation());
    }

    @Test
    public void createNewSpanishWordWithHablar_Expects_getPronunciationNotNull() {
        Word newSpanishWord = new SpanishWord("hablar");
        assertNotNull(newSpanishWord.getPronunciation());
    }

    @Test
    public void createNewSpanishWordWithSer_Expects_getPronunciationNotNull() {
        Word newSpanishWord = new SpanishWord("ser");
        assertNotNull(newSpanishWord.getPronunciation());
    }

}
