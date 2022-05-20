package pokemon;


import java.io.IOException;
import java.sql.*;
import javax.sql.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClaseMain extends Application{
    
    public static void main(String[] args) {
        launch(args);

        Combate c = new Combate();

        Turno t1 = new Turno(1,
        "ECharmander usa Ascuas",
        "Squirtel usa Burbujas");

        c.addTurnos(t1);
        c.escribirFichero();

    }

    @Override
        public void start(Stage primaryStage)  {
            
            try{
                Parent root = FXMLLoader.load(getClass().getResource("../vistas/menuPrincipal.fxml"));
                Scene scene =new Scene(root);

                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
}
