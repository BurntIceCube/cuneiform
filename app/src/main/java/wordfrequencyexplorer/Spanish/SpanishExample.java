package wordfrequencyexplorer.Spanish;
import wordfrequencyexplorer.*;

import org.jsoup.nodes.Element;


public class SpanishExample extends Example {
    public SpanishExample(String word) {
        this.word = word;
        examples_URI = "https://www.spanishdict.com/examples/";
    
        // only fetches the first page of results
        // consider looping through getURI() + "?lang=es&page=[PAGE_NUMBER]" for more examples
        webScraper = new WebScraper(getURI());                        
        populateExamples();

    }

    @Override
    protected void populateExamples() {
        Element table = webScraper.getDoc().getElementsByClass("pczAfAy5").first();
        if (table != null) {
            for (Element e : table.child(0).children()) {
                examples_lang.add(e.child(0).text());
                examples_EN.add(e.child(1).text());
            }
        }
    }
}