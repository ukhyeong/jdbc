package org.zerock.myapp.test;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainController implements Initializable {
    
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Text text1;
    @FXML private Text text2; 			

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    } // initialize
    
    @FXML
    public void btn1Method(ActionEvent e) {
    	log.trace("Back button cliked");
    } // btn1Method
    
    @FXML
    public void btn2Method(ActionEvent e) {
    	log.trace("Home button cliked");
    } // btn2Method
    
    @FXML
    public void btn3Method(ActionEvent e) {
    	log.trace("correction button clicked");
    } // btn3Method

} // end class
