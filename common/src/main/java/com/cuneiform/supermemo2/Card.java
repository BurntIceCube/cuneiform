package com.cuneiform.supermemo2;
import com.cuneiform.*;

import java.util.Calendar;

public class Card {
    private int repetitionNum;
    private double easinessFactor;
    private int interval;

    private Calendar currentDate;
    private Calendar nextDate;

    private Word word;

    public Card(Word word) {
        this.word = word;
    }

    public void setUserGrade(int userGrade) {
        if (userGrade > 5) throw new Error("User cannot assign a value greater than 5");
        if (userGrade >= 3) correctResponse();
        else incorrectResponse();
        easinessFactor = easinessFactor + (0.1 - (5 - userGrade) * (0.08 + (5 - userGrade) * 0.02));
        if (easinessFactor < 1.3) easinessFactor = 1.3;
    }

    private void correctResponse() {
        switch (repetitionNum) {
            case 0: interval = 1; break;
            case 1: interval = 6; break;
            default: interval = (int) (interval * easinessFactor);
        }
        repetitionNum++;
    }

    private void incorrectResponse() {
        repetitionNum = 0;
        interval = 1;
    }

    public Calendar getDateOfFirstSeen() { return currentDate; }
    public Calendar getDateOfNextReview() { return nextDate; }
    public Word getWord() { return word; }
       
}
