/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services.questions;

import com.dht.pojo.Category;
import com.dht.pojo.Level;
import com.dht.pojo.Question;
import com.dht.pojo.QuestionQueryBuilder;
import com.dht.services.QueryServicesBase;
import com.dht.utils.MyConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuestionServices extends QueryServicesBase<Question> implements QuestionServicesBase {
    private QuestionQueryBuilder query;

    public QuestionServices() {
    }

    public QuestionServices(QuestionQueryBuilder query) {
        this.query = query;
    }
    @Override
    public PreparedStatement getStm() throws SQLException {
        return this.query.build();
    }

    @Override
    public Question getObject(ResultSet rs) throws SQLException {
        return new Question.Builder().setContent(rs.getString("content")).setId(rs.getInt("id")).build();
    }
    
//    @Override
//    public List<Question> list() throws SQLException {
//        PreparedStatement stm = this.query.build();
//        
//        ResultSet rs = stm.executeQuery();
//        
//        List<Question> questions = new ArrayList<>();
//        while (rs.next()) {
//            int id = rs.getInt("id");
//            String content = rs.getString("content");
//
//            questions.add(new Question.Builder().setContent(content).setId(id).build());
//        }
//        
//        return questions;
//    }
//
//    /**
//     * @param query the query to set
//     */
    public void setQuery(QuestionQueryBuilder query) {
        this.query = query;
    }

    
}
