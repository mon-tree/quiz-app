/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.exams;

import com.dht.pojo.Question;
import com.dht.pojo.QuestionQueryBuilder;
import com.dht.utils.Configs;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class FixedExam implements ExamStrategy{

    @Override
    public List<Question> getQuestions() throws SQLException {
        List<Question> questions = new ArrayList<>();
        
        for(int i = 0; i< Configs.RATES.length; i++){
            QuestionQueryBuilder q = new QuestionQueryBuilder().withLevel()
        }
    }
    
}
