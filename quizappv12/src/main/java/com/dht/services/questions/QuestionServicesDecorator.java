/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.questions;

import com.dht.pojo.Question;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuestionServicesDecorator extends QuestionServicesBase{
    private QuestionServicesBase service;
    
    public QuestionServicesDecorator(QuestionServicesBase service){
        this.service = service;
    }

    @Override
    public List<Question> getQuestions() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
