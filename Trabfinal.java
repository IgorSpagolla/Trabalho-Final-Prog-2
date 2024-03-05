/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabfinal;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Trabfinal {

public static void main(String[] args) {
        
    Cliente cliente = new Cliente();

    try (Scanner scanner = new Scanner(System.in)) {

        Livro livro1 = new Livro("Inteligencia Emocional", 49.95);
        Livro livro2 = new Livro("Rapido e Devagar", 55.79);
        Livro livro3 = new Livro("Armas da Persuasao", 37.47);

    
        System.out.println("");
        System.out.println("");
        System.out.println("1. " + livro1.titulo + " - R$" + livro1.preco);
        System.out.println("2. " + livro2.titulo + " - R$" + livro2.preco);
        System.out.println("3. " + livro3.titulo + " - R$" + livro3.preco);
        System.out.println("Escolha um livro para comprar: ");
        
        int escolhaLivro = scanner.nextInt();
        
        Livro livroEscolhido;
        double valorCompra = 0;

        switch (escolhaLivro) {
            case 1 -> livroEscolhido = livro1;
            case 2 -> livroEscolhido = livro2;
            case 3 -> livroEscolhido = livro3;
            default -> {
                System.out.println("Opcao invalida, encerrando programa.");
                return;
            }
        }

        System.out.println("Informe a quantidade desejada:");
        int quantidade = scanner.nextInt();

        valorCompra = livroEscolhido.preco * quantidade;
        
        
        System.out.println("1. Cartao de Credito");
        System.out.println("2. Transferencia Bancaria");
        System.out.println("3. PIX");
        System.out.println("Escolha um metodo de pagamento: ");

        int escolhaPagamento = scanner.nextInt();

        MetodoPagamento metodoPagamento;

        switch (escolhaPagamento) {
            case 1 -> metodoPagamento = new CartaoCredito();
            case 2 -> metodoPagamento = new TransferenciaBancaria();
            case 3 -> metodoPagamento = new PIX();
            default -> {
                System.out.println("Opcao invalida, encerrando programa.");
                return;
            }
        }
        
                
                 
        System.out.println("");
        System.out.println("");
        System.out.println("Voce escolheu comprar " + quantidade + " copia(s) de " + livroEscolhido.titulo);
        System.out.println("Valor total da compra: R$" + valorCompra);

        cliente.efetuarCompra(metodoPagamento, valorCompra);
    }
    }
}

        /*cliente.efetuarCompra(cartaoCredito, valorCompra);
        cliente.efetuarCompra(transferenciaBancaria, valorCompra);
        cliente.efetuarCompra(pix, valorCompra);*/