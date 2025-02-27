/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_intelligent_shock;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.LoadException;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author mathn
 */
public class MinhasTomadasController implements Initializable {
    
    @FXML
    private Button btn_Close;
    
    @FXML
    private Button btn_Minimaze;
    
    private Stage stage;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.exit(0);     
    }
    
    private void closeButtonAction(){
        final Stage stage = (Stage) btn_Close.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void handleBtn_AddTomadaAction(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddTomada.fxml"));        
            Scene scene = new Scene(root);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
            closeButtonAction();
        }
        catch(LoadException e) {
            e.printStackTrace();
        }
    }
    
        @FXML
    private void handleBtn_MeuConsumoAction(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MeuConsumo.fxml"));        
            Scene scene = new Scene(root);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
            closeButtonAction();
        }
        catch(LoadException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void btnMinAction(ActionEvent event) {
        
        btn_Minimaze.setOnAction(e -> {
        ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true);
        });
    }
}
