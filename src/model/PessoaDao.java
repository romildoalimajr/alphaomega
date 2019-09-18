/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conexao.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class PessoaDao {
    
    private DataSource dataSource;
    
    public PessoaDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public boolean PessoaDao(String cpf, String telefone, String nascimento, String nome,
            String endereco, int numero, String comp, String bairro, String cidade,
            String estado, String cnpj, String empresa, String risco, String observacao){
        
        boolean cadastrarPessoa = false;
        
        String sql = "INSERT INTO devedor(codigo, cpf, nome, telefone, nascimento,"
                + "endereco, numero, complemento, bairro, cidade, estado, cnpj,"
                + "empresa, risco, descricao) VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = dataSource.getConnection().prepareStatement(sql);
            
            ps.setString(1,cpf);
            ps.setString(2,nome);
            ps.setString(3,telefone);
            ps.setString(4,nascimento);
            ps.setString(5,endereco);
            ps.setInt(6,numero);
            ps.setString(7,comp);
            ps.setString(8,bairro);
            ps.setString(9,cidade);
            ps.setString(10,estado);
            ps.setString(11,cnpj);
            ps.setString(12,empresa);
            ps.setString(13,risco);
            ps.setString(14,observacao);
            
            ps.executeUpdate();
            ps.close();
            
            cadastrarPessoa = true;
            
        } catch (SQLException ex) {
            System.err.println("Pessoa não cadastrada... "+ex);
        }
        finally{
            dataSource.closeConnection();
        }
        
        return cadastrarPessoa;
    }
}
