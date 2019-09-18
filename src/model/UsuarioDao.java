/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conexao.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class UsuarioDao {
    
    private DataSource dataSource;
    
    public UsuarioDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public boolean logarUsuario(String login, String senha){
        
        boolean autenticado = false;
        
        String sql = "SELECT * FROM usuario WHERE login=? AND senha=?";
        
        PreparedStatement pstm;
        
        try {
            pstm = dataSource.getConnection().prepareStatement(sql);
            pstm.setString(1,login);
            pstm.setString(2,senha);
            
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()){
            autenticado = true;
            pstm.close();
            
        }else{
                System.err.println("Usuario não encontrado! ");
                }
        } catch (SQLException ex) {
            System.err.println("Erro ao auntenticar! "+ex);
        }finally{
            dataSource.closeConnection();
        }
        return autenticado;
    }
    public boolean salvarUsuario(String nome, String login, String senha){
        boolean cadastrado = false;
        
        String sql = "INSERT INTO usuario (nome, login, senha) VALUES (?,?,?)";
        
        PreparedStatement pstm;
        
        try {
            pstm = dataSource.getConnection().prepareStatement(sql);
            pstm.setString(1,nome);
            pstm.setString(2,login);
            pstm.setString(3,senha);
            
            pstm.executeUpdate();
            pstm.close();
            
            cadastrado = true;
            
        } catch (SQLException ex) {
            System.err.println("Não executado! "+ex);
        }
        finally{
            dataSource.closeConnection();
        }
        return cadastrado;
    }
    public boolean deletarUsuario(String login){
        boolean deletado = false;
        
        String sql = "DELETE FROM usuario WHERE login=?";
        
        PreparedStatement pstm;
        
        try {
            pstm = dataSource.getConnection().prepareStatement(sql);
            pstm.setString(1,login);
            
            int rowsDelete = pstm.executeUpdate();
            
            if(rowsDelete>0){
                deletado = true;
                pstm.close();
            }else{
                deletado = false;
            }
        } catch (SQLException ex){
            System.err.println("Erro na execução..." +ex);
        }finally{
            dataSource.closeConnection();
        }
     return deletado;   
    }
}
