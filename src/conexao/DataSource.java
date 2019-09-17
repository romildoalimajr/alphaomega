/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class DataSource {
    private String  hostname;
    private int     porta;
    private String  database;
    private String  username;
    private String  password;
    
    public Connection connection;
    
    public DataSource(){
    
        hostname  =  "localhost";
        porta  = 3306;
        database = "alfa_omega";
        username = "root";
        password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+porta+"/"+database;
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.err.println( "Conectado com Sucesso!");
        } catch (SQLException ex) {
            System.err.println("Falhou Geral! "+ex);
        }
    }
    public Connection getConnection(){
        return this.connection;
    }
    public void closeConnection(){
        try {
            connection.close();
            System.out.println("Banco Fechado");
        } catch (SQLException ex) {
            System.err.println("Falha ao fechar o banco! " + ex);
        }
    }
    public PreparedStatement prepareStatement(String sql){
        return null;
        
    }
}
