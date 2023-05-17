package wordfrequencyexplorer;

import java.util.ArrayList;

public abstract class Example {
    protected String examples_URI;
    protected ArrayList<String> examples_lang = new ArrayList<>();
    protected ArrayList<String> examples_EN = new ArrayList<>();
    
    protected String word;
    protected WebScraper webScraper;

    protected abstract void populateExamples();

    public ArrayList<String> getExamples_lang() { return examples_lang; }
    public ArrayList<String> getExamples_EN() { return examples_EN; }
    public String getURI() { return examples_URI + word; }

}
