/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author cesar
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    private button btnClick;
    @FXML
    private void ClicouBotao(ActionEvent event) {
       Locale loc = Locale.getDefault();
     lblMensagem.setText(loc.getDisplayName());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private static class button {

        public button() {
        }
    }
    
}
