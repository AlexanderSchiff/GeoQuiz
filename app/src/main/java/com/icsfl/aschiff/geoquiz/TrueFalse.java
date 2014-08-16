package com.icsfl.aschiff.geoquiz;

/**
 * Created by aschiff on 8/11/2014.
 */
public class TrueFalse {
    private int mQuestionIndex;
    private boolean mTrueQuestion;

    public TrueFalse() {
        this(0, true);
    }
    public TrueFalse(int questionIndex, boolean trueQuestion) {
        mQuestionIndex = questionIndex;
        mTrueQuestion = trueQuestion;
    }
    //test blah

    /**
     * @return {int}
     */
    public int getQuestionIndex() {
        return mQuestionIndex;
    }

    /**
     * @param questionIndex set mQuestionIndex to questionIndex.
     */
    public void setQuestionIndex(int questionIndex) {
        mQuestionIndex = questionIndex;
    }

    /**
     * @return {boolean}
     */
    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    /**
     * @param trueQuestion set mTrueQuestion to trueQuestion.
     */
    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}