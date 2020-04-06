package com.company;

//Joao Pedro Azevedo RA:18.02277-4

public class Conta {
    private static int totalDeContas;
    private int idConta;
    private double saldo;
    private Usuario user;

    public Conta (Usuario user) {
        this.idConta = totalDeContas;
        saldo = 0;
        this.user = user;
        Conta.totalDeContas+=1;
    }

    public void addSaldo(double valor){
        this.saldo += valor;
    }

    public void subSaldo(double valor){
        this.saldo = this.saldo - valor;
    }

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUser() {
        return user;
    }
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
}
