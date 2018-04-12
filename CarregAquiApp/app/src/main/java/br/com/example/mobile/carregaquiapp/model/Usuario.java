package br.com.example.mobile.carregaquiapp.model;

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String uf;
    private String cidade;
    private String cep;
    private String cpf;
    private boolean deb;
    private boolean cred;
    private String ncard;
    private String codSeg;

    public Usuario(){}

    public Usuario(String nome, String email, String senha, String uf, String cidade, String cep, String cpf, boolean deb, boolean cred, String ncard, String codSeg) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.cpf = cpf;
        this.deb = deb;
        this.cred = cred;
        this.ncard = ncard;
        this.codSeg = codSeg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isDeb() {
        return deb;
    }

    public void setDeb(boolean deb) {
        this.deb = deb;
    }

    public boolean isCred() {
        return cred;
    }

    public void setCred(boolean cred) {
        this.cred = cred;
    }

    public String getNcard() {
        return ncard;
    }

    public void setNcard(String ncard) {
        this.ncard = ncard;
    }

    public String getCodSeg() {
        return codSeg;
    }

    public void setCodSeg(String codSeg) {
        this.codSeg = codSeg;
    }
}
