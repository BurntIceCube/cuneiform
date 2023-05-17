package wordfrequencyexplorer.Spanish;
import wordfrequencyexplorer.*;

public class SpanishWord extends Word{
    public SpanishWord(String word) {
        this.word = word;
        examples = new SpanishExample(this.getWord());
        translation = new SpanishTranslation(this.getWord());
        images = new SpanishImage(this.getWord());
        pronunciation = new SpanishPronunciation(getWord());
    }
}
