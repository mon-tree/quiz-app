package com.montree.quizapp_2451052268;

import com.montree.utils.AlertSingleton;
import com.montree.utils.themes.Themes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{

    @FXML private ComboBox<Themes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Themes.values()));
    }
    
    public void manage(ActionEvent e){
        AlertSingleton.getInstance().show("manage");
    }
    public void practice(ActionEvent e){
        AlertSingleton.getInstance().show("practice");
    }
    public void exam(ActionEvent e){
        AlertSingleton.getInstance().show("exam");
    }
    public void changeTheme(ActionEvent e){
        switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style_light.css").toExternalForm());
                break;
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style_dark.css").toExternalForm());
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style.css").toExternalForm());
                break;
        }
    }
    
}
