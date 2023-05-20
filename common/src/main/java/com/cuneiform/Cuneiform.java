package com.cuneiform;
import com.cuneiform.Spanish.*;

public class Cuneiform {
    public static void main(String[] args) {
        Word newSpanishWord = new SpanishWord("hablar");
        System.out.println(newSpanishWord.getTranslation().getTranslation());
    }
}
