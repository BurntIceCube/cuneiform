package com.cuneiform;

public abstract class Word {

    protected String word;
    protected Example example;
    protected Translation translation;
    protected Image images;
    protected Pronunciation pronunciation;
    protected Conjugation conjugations;

    public String getWord() { return this.word; }
    public Example getExample() { return example; }
    public Translation getTranslation() { return translation; }
    public Image getImage() { return images; }
    public Pronunciation getPronunciation() { return pronunciation; }
    public Conjugation getConjugation() { return conjugations; }
}