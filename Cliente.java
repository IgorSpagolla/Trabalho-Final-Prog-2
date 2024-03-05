/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabfinal;

/**
 *
 * @author mathe
 */
public class Cliente extends Pessoa {
    private double saldo = 1000.0;
    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    void efetuarCompra(MetodoPagamento metodoPagamento, double valorCompra) {
        if (saldo < valorCompra) {
            System.out.println("Saldo insuficiente, venda cancelada.");
            return;
        }

        System.out.println("Saldo disponível: R$" + saldo);
        System.out.println("Realizando compra de R$" + valorCompra);

        metodoPagamento.realizarPagamento(valorCompra);
        metodoPagamento.confirmarPagamento();

        saldo -= valorCompra;

        System.out.println("Saldo restante: R$" + saldo);
    }
}
