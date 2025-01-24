package oop;
public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String nivelDeDificuldade, String statusDaMissao, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDeDificuldade, statusDaMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }
    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }

    @Override
    public void mostraInformacoes() {
        super.mostraInformacoes();
        mostrarHabilidadeEspecial();
    }
}