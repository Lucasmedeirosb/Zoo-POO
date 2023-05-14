package Codigos.Animais.mamiferos;

import Codigos.Animais.Mamiferos;

public class Leao extends Mamiferos {
    private int vacinas;

    public Leao(int id, String nome, int idade, float peso, int contpelos, int vacinas){
        super(id, nome, idade, peso, contpelos);
        this.vacinas = vacinas;
    }
    
    public int getVacinas() {
        return vacinas;
    }
    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
            "Nome: " + getNome() + "\n" +
            "Idade: " + getIdade() + "\n" +
            "Peso: " + getPeso() + "\n" + 
            "Quantidade de pelos: " +getContpelos() + "\n" +
            "Vacinas tomadas pelo Leão: " + getVacinas();
      }

    
}
