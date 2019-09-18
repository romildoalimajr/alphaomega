/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class PessoaFisica {
    
    private String cpf;
    private String telefone;
    private String nascimento;
    private String nome;
    private String endereco;
    private int numero;
    private String comp;
    private String bairro;
    private String cidade;
    private String estado;
    private String cnpj;
    private String empresa;
    private String risco;
    private String observacao;
    
    public PessoaFisica(){
        
    }
    public PessoaFisica(String cpf, String telefone, String nascimento, String nome,
            String endereco, int numero, String comp, String bairro, String cidade,
            String estado, String cnpj, String empresa, String risco, String observacao){
        this.cpf = cpf;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.comp = comp;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cnpj = cnpj;
        this.empresa = empresa;
        this.risco = risco;
        this.observacao = observacao;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    public String getNascimento(){
        return nascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public void setComp(String comp){
        this.comp = comp;
    }
    public String getComp(){
        return comp;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getBairro(){
        return bairro;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    public String getEmpresa(){
        return empresa;
    }
    public void setRisco(String risco){
        this.risco=risco;
    }
    public String getRisco(){
        return risco;
    }
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    public String getObservacao(){
        return observacao;
    }
}
