package controladores;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pokemon.ClasePokemon;

public class InterCapturar implements Initializable{
    
    @FXML
    private Button btnGenerarPokemon;

    @FXML
    private Button btnLanzarPokeball;

    @FXML
    private Button btnVolverInicio;

    @FXML
    private ImageView imgPokemon;

    @FXML
    private Label lblCaptura;

    ClasePokemon pe = new ClasePokemon();

    @FXML
    public void generarPokemon(ActionEvent event){
        
        Connection conec;
        String url="jdbc:mysql://localhost:3306/pokemones";
        String login="root";
        String pass="";

        try{
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conec = DriverManager.getConnection(url, login, pass);
 
            System.out.println("Conexión establecida");
            
            pe.mostrarPokemon(conec);

            String ruta="../imgPo/"+pe.getFotoPokemon();
            Image im=new Image(getClass().getResourceAsStream(ruta));
            imgPokemon.setImage(im);
            
            try{
                conec.close();
                System.out.println("Conexión cerrada");
            }catch(SQLException e3){
                e3.printStackTrace();
            }
 
        }catch(ClassNotFoundException e1){
            e1.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    @FXML
    public void lanzarPokeball(ActionEvent event){

        Connection conec;
        String url="jdbc:mysql://localhost:3306/pokemones";
        String login="root";
        String pass="";

        try{
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conec = DriverManager.getConnection(url, login, pass);
 
            System.out.println("Conexión establecida");

            pe.probabilidadCaptura(conec);

            if (pe.getValorCaptura() == 2 || pe.getValorCaptura() == 3){

                lblCaptura.setText("El pokemon ha sido capturado");
            }else{
                lblCaptura.setText("El pokemon no se ha capturado");
            }
            try{
                conec.close();
                System.out.println("Conexión cerrada");
            }catch(SQLException e3){
                e3.printStackTrace();
            }
 
        }catch(ClassNotFoundException e1){
            e1.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    @FXML
    public void capturado(ActionEvent event){
        
    }

    @FXML
    public void volverInicio(ActionEvent event) throws IOException{
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
        
    }
}
