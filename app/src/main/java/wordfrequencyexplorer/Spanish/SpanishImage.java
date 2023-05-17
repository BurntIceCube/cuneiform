package wordfrequencyexplorer.Spanish;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import wordfrequencyexplorer.*;

public class SpanishImage extends Image {
    public SpanishImage(String word) {
        this.word = word;
        images_URI = "https://www.spanishdict.com/translate/";
        webScraper = new WebScraper(getURI());      
        
        Elements images = webScraper.getDoc().getElementsByClass("feGz0xPq");
        for (Element e : images) {
            imagePaths.add(e.getElementsByTag("img").attr("src"));
        }
    }
}