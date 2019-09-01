package com.example.quizapp;

import java.util.ArrayList;

public class truefalse {
   private int mquestion;
   private boolean manswer;
   public truefalse(int questionid, boolean truefalse){
       mquestion = questionid;
       manswer=truefalse;

   }

    public int getMquestion() {
        return mquestion;
    }

    public void setMquestion(int mquestion) {
        this.mquestion = mquestion;
    }

    public boolean isManswer() {
        return manswer;
    }

    public void setManswer(boolean manswer) {
        this.manswer = manswer;
    }
}
