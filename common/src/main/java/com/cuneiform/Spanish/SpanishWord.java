package com.cuneiform.Spanish;
import com.cuneiform.*;

public class SpanishWord extends Word{
    public SpanishWord(String word) {
        this.word = word;
        example = new SpanishExample(this.getWord());
        translation = new SpanishTranslation(this.getWord());
        images = new SpanishImage(this.getWord());
        pronunciation = new SpanishPronunciation(getWord());
        conjugations = new SpanishConjugation(getWord());
    }
}
