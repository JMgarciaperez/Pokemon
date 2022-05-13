package pokemon;

import java.sql.*;

public class ClaseMain {
    
    public static void main(String[] args) {
        
        Connection conec;
        String url="jdbc:mysql://localhost:3306/pokemones";
        String login="root";
        String pass="";

        
        try{
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conec = DriverManager.getConnection(url, login, pass);
 
            System.out.println("Conexión establecida");
 
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

        Combate c = new Combate();

        Turno t1 = new Turno(1,
        "ECharmander usa Ascuas",
        "Squirtel usa Burbujas");

        c.addTurnos(t1);
        c.escribirFichero();
    }
 

    ClasePokemon.generarPokemonAleatorio(nombre);









}
