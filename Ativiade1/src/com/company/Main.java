package com.company;

import java.util.Scanner;

//Joao Pedro Azevedo RA:18.02277-4

public class Main {

    public static void main(String[] args) {
	    String nome, senha, email, nome2, senha2,email2;
	    Transacao t1;
	    System.out.println();
	    nome="Midoriya";
	    senha="AllMightRulez";
	    email="GreenBunny@hotmail.com";

        Usuario u1 = new Usuario(nome,senha,email);
        Conta c1 = new Conta(u1);
        System.out.println("Usuario 1:"+ c1.getUser().getInfo());
        System.out.println("Conta ID:"+ c1.getIdConta());
        c1.addSaldo(30);
        System.out.println("Saldo agora:"+ c1.getSaldo());

        Transacao t1=new Transacao();
    }
}
