/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

/**
 *
 * @author ALPHA OMEGA
 */
public class TesteConexao {
    public static void main(String args[]){
        DataSource ds = new DataSource();
        ds.getConnection();
        ds.closeConnection();
    }
    
}
