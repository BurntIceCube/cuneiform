package wordfrequencyexplorer;

public abstract class Word {

    protected String word;
    protected Example examples;
    protected Translation translation;
    protected Image images;
    protected Pronunciation pronunciation;

    public String getWord() { return this.word; }
    public Example getExample() { return examples; }
    public Translation getTranslation() { return translation; }
    public Image getImage() { return images; }
    public Pronunciation getPronunciation() { return pronunciation; }

    public String[] getRandomExample() {
        int randNum = (int) (Math.random() * (examples.examples_lang.size()));
        return new String[]{ examples.getExamples_lang().get(randNum), examples.getExamples_EN().get(randNum) };
    }
    public String getRandomImage() {
        int randNum = (int) (Math.random() * (images.imagePaths.size()));
        return images.imagePaths.get(randNum);
    }
}