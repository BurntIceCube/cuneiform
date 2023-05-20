package com.cuneiform.Spanish;
import com.cuneiform.*;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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

    @Override
    public String getRandomImage() {
        int randNum = (int) (Math.random() * (imagePaths.size()));
        return imagePaths.get(randNum);
    }
}