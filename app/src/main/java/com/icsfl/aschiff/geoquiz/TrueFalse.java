package com.icsfl.aschiff.geoquiz;

/**
 * Created by aschiff on 8/11/2014.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse() {
        this(0, true);
    }
    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
    //test blah

    /**
     * @return {int}
     */
    public int getQuestion() {
        return mQuestion;
    }

    /**
     * @param question set mQuestion to question.
     */
    public void setQuestion(int question) {
        mQuestion = question;
    }

    /**
     * @return {boolean}
     */
    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    /**
     * @param trueQuestion
     */
    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}