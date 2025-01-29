package oop;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public void Ninja(){
    }

    public Ninja(String nome, int idade, String missao, String nivelDeDificuldade, String statusDaMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
    }

    public void mostraInformacoes(){
        System.out.println("======================================");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de Dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusDaMissao);
    }
}
