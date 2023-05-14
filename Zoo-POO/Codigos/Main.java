package Codigos;

import java.util.ArrayList;
import java.util.Scanner;

import Codigos.Animais.aves.Aguia;
import Codigos.Animais.aves.Pato;
import Codigos.Animais.mamiferos.Leao;
import Codigos.Animais.mamiferos.Lobo;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        final Scanner sc = new Scanner(System.in);
        menu(sc, listaAnimais);

    }

    public static void inserir(ArrayList<Animal> listaAnimais, Scanner sc) {

        System.out.println(
                "=-=-=Bem Vindo ao Zoo!=-=-= \n\nPara inserir um animal\nutilize o menu abaixo! \n\n1-Dejesa inserir uma Aguia.\n \n2-Dejesa inserir uma Pato.\n \n3-Dejesa inserir uma Leão.\n \n4-Dejesa inserir uma Lobo.");
        String escolha = sc.next();

        System.out.println("Digite o id do animal ");
        int id = sc.nextInt();
        System.out.println("Digite o nome: ");
        String nome = sc.next();
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite o peso: ");
        Float peso = sc.nextFloat();

        switch (escolha) {
            case "1":

                System.out.println("Digite o tamano da envergadura da sua ave ");
                int envergadura = sc.nextInt();
                System.out.println("Sua aguia gerou filhos [true/false]");
                Boolean filho = sc.nextBoolean();

                listaAnimais.add(new Aguia(id, nome, idade, peso, envergadura, filho));
                menu(sc, listaAnimais);
                break;

            case "2":

                System.out.println("Digite o tamano da envergadura da sua ave");
                int envergadura1 = sc.nextInt();
                System.out.println("Qual a cor das penas de seu Pato");
                String cor = sc.next();

                listaAnimais.add(new Pato(id, nome, idade, peso, envergadura1, cor));
                menu(sc, listaAnimais);
                break;

            case "3":

                System.out.println("Qual a quantidade de pelos do seu mamifero");
                int pelos = sc.nextInt();
                System.out.println("Quantas vacinas seu Leão ja tomou");
                int vacinas = sc.nextInt();

                listaAnimais.add(new Leao(id, nome, idade, peso, pelos, vacinas));
                menu(sc, listaAnimais);
                break;

            case "4":

                System.out.println("Qual a quantidade de pelos do mamifero");
                int pelos1 = sc.nextInt();
                System.out.println("Seu lobo é alpha [true/false] ");
                boolean alpha = sc.nextBoolean();

                listaAnimais.add(new Lobo(id, nome, idade, peso, pelos1, alpha));
                menu(sc, listaAnimais);
                break;

            default:
                System.out.println("!!ERROR!!");
                break;

        }

    }

    public static void excluir(ArrayList<Animal> listaAnimais, Scanner sc) {
        System.out.println("Digite o id do animal que deseja remover?");
        int id = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < listaAnimais.size(); i++) {
            if (listaAnimais.get(i).getId() == id) {
                encontrado = true;
                System.out.println("Aqui estão as informações do animal que será removido:");
                System.out.println(listaAnimais.get(i).toString());
                listaAnimais.remove(i);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Animal não encontrado na lista!");
        }

        menu(sc, listaAnimais);
    }

    public static void menu(Scanner sc, ArrayList<Animal> listaAnimais) {

        System.out.println("Escolha entre \n1-Inserir \n2-Excluir \n3-Sair");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                inserir(listaAnimais, sc);
                break;
            case 2:
                excluir(listaAnimais, sc);
                break;
            case 3:
                System.exit(0);
                break;

        }
    }

}
