/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.montree.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class AlertSingleton {
    private static AlertSingleton instance;
    private final Alert alert;
    private AlertSingleton(){
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("quizapp");
        alert.setHeaderText("quizapp");
    }
    
    public static AlertSingleton getInstance(){
        if(instance == null){
            instance = new AlertSingleton();
        }
        return instance;
    }
    public void show(String content){
        this.alert.setContentText(content);
        this.alert.show();
    }
}
