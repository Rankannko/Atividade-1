package com.company;

//Joao Pedro Azevedo RA:18.02277-4

public class Usuario {
    private String nome;
    private String senha;
    private String email;

    public Usuario(String nome, String senha, String email){
        this.nome=nome;
        this.senha=senha;
        this.email=email;
    }
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    //Parte inspirada pelo codigo da aula de
    public String getInfo(){
        return String.format("{Nome do usuario:%s, senha do usuario:%s, email do usuario:%s}", this.nome, this.senha, this.email);
    }

}
