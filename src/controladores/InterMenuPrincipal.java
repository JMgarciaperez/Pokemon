package controladores;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class InterMenuPrincipal implements Initializable {

    @FXML
    private Button btnStart;

    private Stage stage;

    @FXML
    private void empezarPartida(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/menuElegir.FXML"));
        Parent root = loader.load();
        InterElegir controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.show();
        this.stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    public void show(){
        stage.show();
    }
}