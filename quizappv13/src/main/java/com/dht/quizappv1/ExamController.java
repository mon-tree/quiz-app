/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dht.quizappv1;

import com.dht.pojo.Question;
import com.dht.services.exams.ExamStrategy;
import com.dht.services.exams.ExamTypes;
import com.dht.services.exams.SpecificExam;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class ExamController implements Initializable {
    @FXML ComboBox<ExamTypes> cbExamTypes;
    @FXML TextField txtNum;
    @FXML ListView<Question> lvQuestions;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.cbExamTypes.setItems(FXCollections.observableArrayList(ExamTypes.values()));
    }    
    
    public void start(ActionEvent e){
        if(this.cbExamTypes.getSelectionModel().getSelectedItem() == ExamTypes.SPECIFIC) {
            ExamStrategy s = new SpecificExam(this.txtNum.getText());
            try {
                this.lvQuestions.setItems(FXCollections.observableList(s.getQuestions()));
            } catch (SQLException ex) {
                Logger.getLogger(ExamController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
