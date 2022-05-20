public  void mostrarPokemon(Connection conec) throws SQLException {
        Random rnd = new Random();

        int resultado = (rnd.nextInt(34) + 1);

        String consulta = "SELECT * FROM POKEDEX WHERE NUM_POKEDEX = " + resultado;
        Statement statement = conec.createStatement();
        ResultSet rs = statement.executeQuery(consulta);

        while (rs.next()) {
            this.setNumPokedex(rs.getInt("NUM_POKEDEX"));
            this.setNombre(rs.getString("NOMBRE"));
            this.setTipo1(EnumeradoTipos.valueOf(rs.getString("TIPO_1")));
            if (rs.getObject("TIPO_2") != null){

                this.setTipo2(EnumeradoTipos.valueOf(rs.getString("TIPO_2")));
                   } else{
                   this.setTipo2(EnumeradoTipos.NULL);
                   }
            this.setFotoPokemon(rs.getString("IMAGEN"));
            this.setNivel(1);
            this.setVitalidad(rnd.nextInt(30)+20);
            this.setAtaque(rnd.nextInt(30)+20);
            this.setDefensa(rnd.nextInt(30)+20);
            this.setAtaqueEspecial(rnd.nextInt(30)+20);
            this.setDefensaEspecial(rnd.nextInt(30)+20);
            this.setVelocidad(rnd.nextInt(30)+20);
            this.setEstamina(rnd.nextInt(30)+20);
            System.out.println(this.toString());
        }
        statement.close();
    }
	
	
public void cogerMayorIdPokemon(Connection conec) throws SQLException {	
    String consulta = "SELECT MAX(ID_POKEMON) FROM POKEMON_ENTRENADOR AS ID_POKEMON";
    Statement statement = conec.createStatement();
    ResultSet rs = statement.executeQuery(consulta);

    while (rs.next()) {
        
        this.setIdPokemon(rs.getInt(1)+ 1);
    }
    statement.close();
}
	

public void insertarPokemon(Connection conec) throws SQLException {
		String sentencia ="INSERT INTO POKEMON_ENTRENADOR(ID_POKEMON,ID_ENTRENADOR, NUM_POKEDEX, MOTE,
						   VITALIDAD, ATAQUE, DEFENSA, ATAQUE_ESP, DEFENSA_ESP, ESTAMINA, VELOCIDAD, 
						   NIVEL, FERTILIDAD,EXPERIENCIA, EQUIPO) VALUES("
                            + this.getIdPokemon()
                            +",1"
                            +","+this.getNumPokedex()
                            +",NULL"
                            +","+this.getVitalidad()
                            +","+this.getAtaque()
                            +","+this.getDefensa()
                            +","+this.getAtaqueEspecial()
                            +","+this.getDefensaEspecial()
                            +","+this.getEstamina()
                            +","+this.getVelocidad()
                            +",DEFAULT"
                            +",DEFAULT"
                            +",DEFAULT"
                            +",2"
                            +")";
	Statement stmt = null;
	try {
		stmt = conec.createStatement();
		stmt.executeUpdate(sentencia);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		stmt.close(); // Puede lanzar SQLExceptions, por eso he puesto el
		// throws en la cabecera del metodo
	}											   
}
	
	
