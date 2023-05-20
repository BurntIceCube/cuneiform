package com.cuneiform;
import com.cuneiform.Spanish.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpanishConjugationTest {

    @Test
    public void createNewSpanishConjugationWithHablar_Expects_getURINotNull() {
        Conjugation newSpanishConjugation = new SpanishConjugation("hablar");
        assertNotNull(newSpanishConjugation.getURI());
    }

    @Test
    public void createNewSpanishConjugationWithHablarCreatesNewWebScraper_Expects_WebScraperNotNull() {
        Conjugation newSpanishConjugation = new SpanishConjugation("habler");
        assertNotNull(newSpanishConjugation.webScraper);
    }

    @Test
    public void createNewSpanishConjugationWithHablar_Expects_allConjugationsReturnTheirConjugations() {
        Conjugation newSpanishConjugation = new SpanishConjugation("hablar");
        assertEquals("hablando", ((SpanishConjugation) newSpanishConjugation).getPresent_participle());
        assertEquals("hablado", ((SpanishConjugation) newSpanishConjugation).getPast_participle());

        assertEquals("hablo", ((SpanishConjugation) newSpanishConjugation).getPresent_yo());
        assertEquals("hablé", ((SpanishConjugation) newSpanishConjugation).getPreterite_yo());
        assertEquals("hablaba", ((SpanishConjugation) newSpanishConjugation).getImperfect_yo());
        assertEquals("hablaría", ((SpanishConjugation) newSpanishConjugation).getConditional_yo());
        assertEquals("hablaré", ((SpanishConjugation) newSpanishConjugation).getFuture_yo());

        assertEquals("hablas", ((SpanishConjugation) newSpanishConjugation).getPresent_tu());
        assertEquals("hablaste", ((SpanishConjugation) newSpanishConjugation).getPreterite_tu());
        assertEquals("hablabas", ((SpanishConjugation) newSpanishConjugation).getImperfect_tu());
        assertEquals("hablarías", ((SpanishConjugation) newSpanishConjugation).getConditional_tu());
        assertEquals("hablarás", ((SpanishConjugation) newSpanishConjugation).getFuture_tu());

        assertEquals("habla", ((SpanishConjugation) newSpanishConjugation).getPresent_ud());
        assertEquals("habló", ((SpanishConjugation) newSpanishConjugation).getPreterite_ud());
        assertEquals("hablaba", ((SpanishConjugation) newSpanishConjugation).getImperfect_ud());
        assertEquals("hablaría", ((SpanishConjugation) newSpanishConjugation).getConditional_ud());
        assertEquals("hablará", ((SpanishConjugation) newSpanishConjugation).getFuture_ud());

        assertEquals("hablamos", ((SpanishConjugation) newSpanishConjugation).getPresent_nosotros());
        assertEquals("hablamos", ((SpanishConjugation) newSpanishConjugation).getPreterite_nosotros());
        assertEquals("hablábamos", ((SpanishConjugation) newSpanishConjugation).getImperfect_nosotros());
        assertEquals("hablaríamos", ((SpanishConjugation) newSpanishConjugation).getConditional_nosotros());
        assertEquals("hablaremos", ((SpanishConjugation) newSpanishConjugation).getFuture_nosotros());

        assertEquals("hablan", ((SpanishConjugation) newSpanishConjugation).getPresent_uds());
        assertEquals("hablaron", ((SpanishConjugation) newSpanishConjugation).getPreterite_uds());
        assertEquals("hablaban", ((SpanishConjugation) newSpanishConjugation).getImperfect_uds());
        assertEquals("hablarían", ((SpanishConjugation) newSpanishConjugation).getConditional_uds());
        assertEquals("hablarán", ((SpanishConjugation) newSpanishConjugation).getFuture_uds());

        assertEquals("hable", ((SpanishConjugation) newSpanishConjugation).getPresent_subjunctive_yo());
        assertEquals("hables", ((SpanishConjugation) newSpanishConjugation).getPresent_subjunctive_tu());
        assertEquals("hable", ((SpanishConjugation) newSpanishConjugation).getPresent_subjunctive_ud());
        assertEquals("hablemos", ((SpanishConjugation) newSpanishConjugation).getPresent_subjunctive_nosotros());
        assertEquals("hablen", ((SpanishConjugation) newSpanishConjugation).getPresent_subjunctive_uds());

        assertEquals("habla", ((SpanishConjugation) newSpanishConjugation).getImperative_affirmative_tu());
        assertEquals("no hables", ((SpanishConjugation) newSpanishConjugation).getImperative_negative_tu());
        assertEquals("hable", ((SpanishConjugation) newSpanishConjugation).getImperative_affirmative_ud());
        assertEquals("no hable", ((SpanishConjugation) newSpanishConjugation).getImperative_negative_ud());
        assertEquals("hablemos", ((SpanishConjugation) newSpanishConjugation).getImperative_affirmative_nosotros());
        assertEquals("no hablemos", ((SpanishConjugation) newSpanishConjugation).getImperative_negative_nosotros());
        assertEquals("hablen", ((SpanishConjugation) newSpanishConjugation).getImperative_affirmative_uds());
        assertEquals("no hablen", ((SpanishConjugation) newSpanishConjugation).getImperative_negative_uds());
    }
}
