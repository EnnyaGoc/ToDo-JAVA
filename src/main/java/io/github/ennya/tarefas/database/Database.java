package io.github.ennya.tarefas.database;

import java.sql.*;

public class Database {
    // String de conexão (irá criar o arquivo "meubanco.db" na pasta do projeto)
    private static String URL = "jdbc:sqlite:tarefas.db";

    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL);
    }

    public static void iniciar(){
        String sql = """
            CREATE TABLE IF NOT EXISTS tarefas(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                titulo TEXT NOT NULL,
                descricao TEXT,
                status TEXT NOT NULL,
                prioridade TEXT NOT NULL,
                data_criacao TEXT NOT NULL,
                prazo TEXT 
            )
        """;
        try (Connection c = conectar(); Statement st = c.createStatement()){
            st.execute(sql);
        } catch (SQLException  e) {
            throw new RuntimeException("Erro ao iniciar o banco", e);
        }
    }

}
