package VendaDeProduto_SD;

import java.util.Scanner;

/* @author SAMSUNG */
public class Registro {
    Scanner leitor;
    private String nome;
    private String descricao;
    private int quantidade;
    private double valor;

    public void fazerPagamento(double valor){
        System.out.printf("\tREGISTRO DE VENDA\n\n");
        leitor = new Scanner (System.in);
        System.out.printf("Digite o nome do produto: ");
        nome = leitor.nextLine();
        System.out.printf("Digite a descrição do produto: ");
        descricao = leitor.nextLine();
        System.out.printf("Digite a quantidade do produto: ");
        quantidade = leitor.nextInt();
        System.out.printf("\t-------------------------\n");
        System.out.printf("Nome: " + nome);
        System.out.printf("\tDescrição: " + descricao);
        System.out.printf("\tValor: " + valor * quantidade);
        this.valor = valor * quantidade;
        System.out.printf("\n\n");
    }    

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
