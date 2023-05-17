package wordfrequencyexplorer;

import java.util.ArrayList;

public abstract class Image {
    protected String images_URI;
    protected ArrayList<String> imagePaths = new ArrayList<String>();

    protected String word;
    protected WebScraper webScraper;

    public String getURI() { return images_URI + word; }
    public ArrayList<String> getImages() { return imagePaths; }
}
