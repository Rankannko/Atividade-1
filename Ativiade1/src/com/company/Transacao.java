package com.company;

import java.util.Random;

//Joao Pedro Azevedo RA:18.02277-4

public class Transacao {
    private Conta c1;
    private Conta c2;
    private int r;
    private double valor;
    private static String dados;

    public Transacao(double valor) {
        this.valor = valor;
    }


    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String dados (Conta c1, double valor){
        return String.format("%d;%s;%d;%d",c1.getIdConta(),c1.getUser().getNome(),valor,r);
    }

    public String getDados() {
        return dados;
    }

    public Transacao(Conta c1, Conta c2){
        String[] dadoes = dados.split(";");
        Double.parseDouble(dadoes[2]);
        if (this.c1.getSaldo()>=dadoes[2]) {
            c1.subSaldo(dadoes[2]);
            c1.addSaldo(dadoes[2]);
        }
    }
}




