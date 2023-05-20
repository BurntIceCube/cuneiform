package com.cuneiform;

public abstract class Pronunciation {
    protected String pronunciation_URI;
    protected String audioPath;
    protected String spa;
    protected String ipa;
    
    protected String word;
    protected WebScraper webScraper;

    public String getAudio() { return audioPath; }
    public String getSpa() { return spa; }
    public String getIpa() { return ipa; }
    public String getURI() { return pronunciation_URI + word; }

}
