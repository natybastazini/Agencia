package br.senai.sp.jandira.model;

public class Conta {

    boolean validaSaldo;

    private int numeroConta = 1234;

    private double saldo = 9652;

    private String agencia = "000-35-XX";

    public void realizarDeposito(Double valor){
        this.saldo += valor;
        System.out.println("O saldo da conta é: " + this.saldo);
    }

    public void relizarSaque(Double valor){

        //if (valor > this.saldo) {
        //    System.out.println("Não há saldo suficiente!!");
        //} else {
        //    this.saldo -= valor;
        //    System.out.println("Saque realizado!! O saldo é: "   + this.saldo);
        //}

        if(validaSaldo){
            this.saldo -= valor;
            System.out.println("O saldo da conta é: " + this.saldo);
        } else {
            System.out.println("Você não tem saldo para essa transação");
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + this.saldo);
    }

    public void avaliaSaldo(double valor){
        if(valor > this.saldo){
            validaSaldo = false;
        }else{
            validaSaldo = true;
        }
    }





}
