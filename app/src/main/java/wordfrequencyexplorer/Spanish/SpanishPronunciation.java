package wordfrequencyexplorer.Spanish;

import wordfrequencyexplorer.*;

public class SpanishPronunciation extends Pronunciation {
    public SpanishPronunciation(String word) {
        this.word = word;
        pronunciation_URI = "https://www.spanishdict.com/pronunciation/";
        webScraper = new WebScraper(getURI());      
        
        spa = webScraper.getDoc().getElementsByClass("AWGx23xG").get(0).text();
        ipa = webScraper.getDoc().getElementsByClass("AWGx23xG").get(1).text();
        audioPath = webScraper.getDoc().getElementsByClass("xCXIE7uZ").get(0)
                    .getElementsByTag("video")
                    .attr("src");
    }
}
