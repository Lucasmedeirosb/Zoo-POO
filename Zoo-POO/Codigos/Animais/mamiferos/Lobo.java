package Codigos.Animais.mamiferos;

import Codigos.Animais.Mamiferos;

public class Lobo extends Mamiferos{
    private boolean ehAlpha;

     public Lobo(int id, String nome, int idade, float peso, int contpelos, boolean ehAlpha){
        super(id, nome, idade, peso, contpelos);
        this.ehAlpha = ehAlpha;

       
    }
    
    public boolean getehAlpha() {
        
        return ehAlpha;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
            "Nome: " + getNome() + "\n" +
            "Idade: " + getIdade() + "\n" +
            "Peso: " + getPeso() + "\n" + 
            "Quantidade de pelos: " + getContpelos() + "\n" +
            "Se é alpha: " + getehAlpha();
      }

 

}
