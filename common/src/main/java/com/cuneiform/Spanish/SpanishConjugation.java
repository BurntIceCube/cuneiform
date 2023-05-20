package com.cuneiform.Spanish;
import java.util.ArrayList;

import com.cuneiform.*;

public class SpanishConjugation extends Conjugation {

    protected String present_participle;
    protected String past_participle;

    protected String present_yo;
    protected String present_tu;
    protected String present_ud;
    protected String present_nosotros;
    protected String present_uds;

    protected String preterite_yo;
    protected String preterite_tu;
    protected String preterite_ud;
    protected String preterite_nosotros;
    protected String preterite_uds;

    protected String imperfect_yo;
    protected String imperfect_tu;
    protected String imperfect_ud;
    protected String imperfect_nosotros;
    protected String imperfect_uds;

    protected String conditional_yo;
    protected String conditional_tu;
    protected String conditional_ud;
    protected String conditional_nosotros;
    protected String conditional_uds;

    protected String future_yo;
    protected String future_tu;
    protected String future_ud;
    protected String future_nosotros;
    protected String future_uds;

    protected String present_subjunctive_yo;
    protected String present_subjunctive_tu;
    protected String present_subjunctive_ud;
    protected String present_subjunctive_nosotros;
    protected String present_subjunctive_uds;

    protected String imperfect_subjunctive_yo;
    protected String imperfect_subjunctive_tu;
    protected String imperfect_subjunctive_ud;
    protected String imperfect_subjunctive_nosotros;
    protected String imperfect_subjunctive_uds;

    protected String imperative_affirmative_tu;
    protected String imperative_affirmative_ud;
    protected String imperative_affirmative_nosotros;
    protected String imperative_affirmative_uds;

    protected String imperative_negative_tu;
    protected String imperative_negative_ud;
    protected String imperative_negative_nosotros;
    protected String imperative_negative_uds;

    public SpanishConjugation(String word) {
        this.word = word;
        conjugation_URI = "https://www.spanishdict.com/conjugate/";

        webScraper = new WebScraper(getURI());

        // i REALLY hope they dont change the website

        present_participle = webScraper.getDoc().getElementsByClass("WVvCPjEU").get(0).text();
        past_participle = webScraper.getDoc().getElementsByClass("WVvCPjEU").get(1).text();

        present_yo = webScraper.getDoc().getElementsByClass("RkfLftwO").get(0).text();
        preterite_yo = webScraper.getDoc().getElementsByClass("RkfLftwO").get(1).text();
        imperfect_yo = webScraper.getDoc().getElementsByClass("RkfLftwO").get(2).text();
        conditional_yo = webScraper.getDoc().getElementsByClass("RkfLftwO").get(3).text();
        future_yo = webScraper.getDoc().getElementsByClass("RkfLftwO").get(4).text();

        present_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(5).text();
        preterite_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(6).text();
        imperfect_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(7).text();
        conditional_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(8).text();
        future_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(9).text();

        present_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(10).text();
        preterite_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(11).text();
        imperfect_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(12).text();
        conditional_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(13).text();
        future_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(14).text();

        present_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(15).text();
        preterite_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(16).text();
        imperfect_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(17).text();
        conditional_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(18).text();
        future_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(19).text();

        present_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(25).text();
        preterite_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(26).text();
        imperfect_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(27).text();
        conditional_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(28).text();
        future_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(29).text();

        present_subjunctive_yo = webScraper.getDoc().getElementsByClass("RkfLftwO").get(30).text();
        imperfect_subjunctive_yo = webScraper.getDoc().getElementsByClass("RkfLftwO").get(31).text();
        present_subjunctive_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(33).text();
        imperfect_subjunctive_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(34).text();
        present_subjunctive_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(36).text();
        imperfect_subjunctive_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(37).text();
        present_subjunctive_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(39).text();
        imperfect_subjunctive_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(40).text();
        present_subjunctive_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(45).text();
        imperfect_subjunctive_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(46).text();

        imperative_affirmative_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(48).text();
        imperative_negative_tu = webScraper.getDoc().getElementsByClass("RkfLftwO").get(49).text();
        imperative_affirmative_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(50).text();
        imperative_negative_ud = webScraper.getDoc().getElementsByClass("RkfLftwO").get(51).text();
        imperative_affirmative_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(52).text();
        imperative_negative_nosotros = webScraper.getDoc().getElementsByClass("RkfLftwO").get(53).text();
        imperative_affirmative_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(56).text();
        imperative_negative_uds = webScraper.getDoc().getElementsByClass("RkfLftwO").get(57).text();
    }

    public String getPresent_participle() {
        return this.present_participle;
    }

    public String getPast_participle() {
        return this.past_participle;
    }

    public String getPresent_yo() {
        return this.present_yo;
    }

    public String getPresent_tu() {
        return this.present_tu;
    }

    public String getPresent_ud() {
        return this.present_ud;
    }

    public String getPresent_nosotros() {
        return this.present_nosotros;
    }

    public String getPresent_uds() {
        return this.present_uds;
    }

    public String getPreterite_yo() {
        return this.preterite_yo;
    }

    public String getPreterite_tu() {
        return this.preterite_tu;
    }

    public String getPreterite_ud() {
        return this.preterite_ud;
    }

    public String getPreterite_nosotros() {
        return this.preterite_nosotros;
    }

    public String getPreterite_uds() {
        return this.preterite_uds;
    }

    public String getImperfect_yo() {
        return this.imperfect_yo;
    }

    public String getImperfect_tu() {
        return this.imperfect_tu;
    }

    public String getImperfect_ud() {
        return this.imperfect_ud;
    }

    public String getImperfect_nosotros() {
        return this.imperfect_nosotros;
    }

    public String getImperfect_uds() {
        return this.imperfect_uds;
    }

    public String getConditional_yo() {
        return this.conditional_yo;
    }

    public String getConditional_tu() {
        return this.conditional_tu;
    }

    public String getConditional_ud() {
        return this.conditional_ud;
    }

    public String getConditional_nosotros() {
        return this.conditional_nosotros;
    }

    public String getConditional_uds() {
        return this.conditional_uds;
    }

    public String getFuture_yo() {
        return this.future_yo;
    }

    public String getFuture_tu() {
        return this.future_tu;
    }

    public String getFuture_ud() {
        return this.future_ud;
    }

    public String getFuture_nosotros() {
        return this.future_nosotros;
    }

    public String getFuture_uds() {
        return this.future_uds;
    }

    public String getPresent_subjunctive_yo() {
        return this.present_subjunctive_yo;
    }

    public String getPresent_subjunctive_tu() {
        return this.present_subjunctive_tu;
    }

    public String getPresent_subjunctive_ud() {
        return this.present_subjunctive_ud;
    }

    public String getPresent_subjunctive_nosotros() {
        return this.present_subjunctive_nosotros;
    }

    public String getPresent_subjunctive_uds() {
        return this.present_subjunctive_uds;
    }

    public String getImperfect_subjunctive_yo() {
        return this.imperfect_subjunctive_yo;
    }

    public String getImperfect_subjunctive_tu() {
        return this.imperfect_subjunctive_tu;
    }

    public String getImperfect_subjunctive_ud() {
        return this.imperfect_subjunctive_ud;
    }

    public String getImperfect_subjunctive_nosotros() {
        return this.imperfect_subjunctive_nosotros;
    }

    public String getImperfect_subjunctive_uds() {
        return this.imperfect_subjunctive_uds;
    }

    public String getImperative_affirmative_tu() {
        return this.imperative_affirmative_tu;
    }

    public String getImperative_affirmative_ud() {
        return this.imperative_affirmative_ud;
    }

    public String getImperative_affirmative_nosotros() {
        return this.imperative_affirmative_nosotros;
    }

    public String getImperative_affirmative_uds() {
        return this.imperative_affirmative_uds;
    }

    public String getImperative_negative_tu() {
        return this.imperative_negative_tu;
    }

    public String getImperative_negative_ud() {
        return this.imperative_negative_ud;
    }

    public String getImperative_negative_nosotros() {
        return this.imperative_negative_nosotros;
    }

    public String getImperative_negative_uds() {
        return this.imperative_negative_uds;
    }

    public ArrayList<ArrayList<String>> getConjugationsAsList() {
        ArrayList<String> present = new ArrayList<String>();
            present.add(getPresent_yo());
            present.add(getPresent_tu());
            present.add(getPresent_ud());
            present.add(getPresent_nosotros());
            present.add(getPresent_uds());

        ArrayList<String> preterite = new ArrayList<String>();
            preterite.add(getPreterite_yo());
            preterite.add(getPreterite_tu());
            preterite.add(getPreterite_ud());
            preterite.add(getPreterite_nosotros());
            preterite.add(getPreterite_uds());

        ArrayList<String> imperfect = new ArrayList<String>();
            imperfect.add(getImperfect_yo());
            imperfect.add(getImperfect_tu());
            imperfect.add(getImperfect_ud());
            imperfect.add(getImperfect_nosotros());
            imperfect.add(getImperfect_uds());

        ArrayList<String> conditional = new ArrayList<String>();
            conditional.add(getConditional_yo());
            conditional.add(getConditional_tu());
            conditional.add(getConditional_uds());
            conditional.add(getConditional_nosotros());
            conditional.add(getConditional_uds());

        ArrayList<String> future = new ArrayList<String>();
            future.add(getFuture_yo());
            future.add(getFuture_tu());
            future.add(getFuture_ud());
            future.add(getFuture_nosotros());
            future.add(getFuture_uds());

        ArrayList<String> present_subjunctive = new ArrayList<String>();
            present_subjunctive.add(getPresent_subjunctive_yo());
            present_subjunctive.add(getPresent_subjunctive_tu());
            present_subjunctive.add(getPresent_subjunctive_ud());
            present_subjunctive.add(getPresent_subjunctive_nosotros());
            present_subjunctive.add(getPresent_subjunctive_uds());

        ArrayList<String> imperfect_subjunctive = new ArrayList<String>();
            imperfect_subjunctive.add(getImperfect_subjunctive_yo());
            imperfect_subjunctive.add(getImperfect_subjunctive_tu());
            imperfect_subjunctive.add(getImperfect_subjunctive_ud());
            imperfect_subjunctive.add(getImperfect_subjunctive_nosotros());
            imperfect_subjunctive.add(getImperfect_subjunctive_uds());

        ArrayList<String> indicative_affirmative = new ArrayList<String>();
            indicative_affirmative.add(getImperative_affirmative_tu());
            indicative_affirmative.add(getImperative_affirmative_ud());
            indicative_affirmative.add(getImperative_affirmative_nosotros());
            indicative_affirmative.add(getImperative_affirmative_uds());

        ArrayList<String> indicative_negative = new ArrayList<String>();
            indicative_negative.add(getImperative_negative_tu());
            indicative_negative.add(getImperative_negative_ud());
            indicative_negative.add(getImperative_negative_nosotros());
            indicative_negative.add(getImperative_negative_uds());

        ArrayList<ArrayList<String>> allConjugations = new ArrayList<ArrayList<String>>();
        allConjugations.add(present);
        allConjugations.add(preterite);
        allConjugations.add(imperfect);
        allConjugations.add(conditional);
        allConjugations.add(future);
        allConjugations.add(present_subjunctive);
        allConjugations.add(imperfect_subjunctive);
        allConjugations.add(indicative_affirmative);
        allConjugations.add(indicative_negative);
        return allConjugations;
}

@Override
public String getRandomConjugation() {
    int randNumOuter = (int) (Math.random() * (getConjugationsAsList().size()));
    int randNumInner = (int) (Math.random() * (getConjugationsAsList().get(randNumOuter).size()));
        return getConjugationsAsList().get(randNumOuter).get(randNumInner);
    }
}