package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class InterCombate implements Initializable{

    @FXML
    private Button btnAtaque1;

    @FXML
    private Button btnAtaque2;

    @FXML
    private Button btnAtaque3;

    @FXML
    private Button btnAtaque4;

    @FXML
    private Button btnRetirarse;

    @FXML
    private Text textRecuadro;

    @FXML
    private Text textNombrePoRival;

    @FXML
    private Text textNivelRival;

    @FXML
    private Text textMiNivel;

    @FXML
    private Text textNombrePo;

    @FXML
    private Text textMiVidalActual;

    @FXML
    private Text textMiVidaMax;

    @FXML
    private Text textVidaActualRi;

    @FXML
    private Text textVidaMaxRi;


    @FXML
    private ImageView imgMiPokemon;

    @FXML
    private ImageView imgPokemonRival;

    //Botones
    @FXML
    private void ataque1(ActionEvent event){
    }

    @FXML
    private void ataque2(ActionEvent event){
    }

    @FXML
    private void ataque3(ActionEvent event){
    }

    @FXML
    private void ataque4(ActionEvent event){
    }

    @FXML
    private void retirarse(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/menuElegir.FXML"));
        Parent root = loader.load();
        InterElegir controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        stage.close();

    }

    //Texto
    @FXML
    private void textoCombate(ActionEvent event){
    }

    @FXML
    private void nombrePoRival(ActionEvent event){
    }

    @FXML
    private void nivelRival(ActionEvent event){
    }

    @FXML
    private void miNivel(ActionEvent event){
    }

    @FXML
    private void nombreMiPokemon(ActionEvent event){
    }

    @FXML
    private void miVidaActual(ActionEvent event){
    }

    @FXML
    private void miVidaMax(ActionEvent event){
    }

    @FXML
    private void vidaRival(ActionEvent event){
    }
    
    @FXML
    private void vidaRivalMax(ActionEvent event){
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    } 
}
