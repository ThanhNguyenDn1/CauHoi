package com.example.cauhoi.model;

import java.util.ArrayList;

public class CauHoi {
     public String Content;
   public int Id;
    public String [] ListAnswers;
   public String AnswersCorrect;

    public CauHoi(String content, int id, String[] listAnswers, String answersCorrect) {
        Content = content;
        Id = id;
        ListAnswers = listAnswers;
        AnswersCorrect = answersCorrect;
    }

}
