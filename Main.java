package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Ninja> ninjas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== Menu de Gestão de Ninjas ===");
            System.out.println("1. Exibir informações de todos os ninjas");
            System.out.println("2. Adicionar novo ninja");
            System.out.println("3. Atualizar habilidade: ");
            System.out.println("4. Sair: ");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirNinjas();
                    break;
                case 2:
                    adicionarNinja(scanner);
                    break;
                case 3:
                    atualizarHabilidadeEspecial(scanner);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
    static void exibirNinjas(){
        if (ninjas.isEmpty()){
            System.out.println("Nenhum ninja encontrado.");
        }else {
            for (int i = 0; i < ninjas.size(); i++) {
                ninjas.get(i).mostraInformacoes();
            }
        }
    }

    public static void adicionarNinja(Scanner scanner){
        System.out.print("Digite o nome do ninja: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do ninja: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a missão do ninja: ");
        String missao = scanner.nextLine();

        System.out.print("Digite o nível de dificuldade: ");
        String nivelDificuldade = scanner.nextLine();

        System.out.print("Digite o status da missão: ");
        String statusMissao = scanner.nextLine();

        System.out.print("O ninja é um Uchiha? (sim/não): ");
        String ehUchiha = scanner.nextLine();
        if (ehUchiha.equals("sim")){
            System.out.println("Digite a habilidade especial: ");
            String habilidadeEspecial = scanner.nextLine();
            ninjas.add(new Uchiha(nome, idade, missao, nivelDificuldade, statusMissao, habilidadeEspecial));
        }else {
            ninjas.add(new Ninja(nome, idade, missao, nivelDificuldade, statusMissao));
        }

    }

    public static void listarUchihas() {
        int index = 0;
        for (Ninja ninja : ninjas) {
            if (ninja instanceof Uchiha) {
                System.out.println((index + 1) +  ". " + ninja.nome);
            }
            index++;
        }
    }

    public static void atualizarHabilidadeEspecial(Scanner scanner) {
        System.out.println("Lista de Uchihas");
        listarUchihas();

        System.out.println("Digite o numero do ninja: ");
        int indice = scanner.nextInt() -1;
        scanner.nextLine();

        if (indice >=0 && indice < ninjas.size() && ninjas.get(indice) instanceof Uchiha){
            System.out.println("Digite a nova habilidade especial: ");
            ((Uchiha) ninjas.get(indice)).habilidadeEspecial = scanner.nextLine();
            System.out.println("Habilidade atualizada com sucesso. ");
        }else {
            System.out.println("Indice invalido ou ninja não encontrado");
        }
    }
}





