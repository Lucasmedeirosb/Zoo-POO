package Codigos.Animais.aves;

import Codigos.Animais.Aves;

public class Pato extends Aves{
  private String corPenas;
  public Pato(int id, String nome, int idade, float peso,int envergadura,String corPenas ){
    super(id, nome, idade, peso, envergadura);
    this.corPenas = corPenas;
    
}
  public String getCorPenas() {
      return corPenas;
  }

    @Override
    public void Ehvoador(boolean voa) {
        voa = false;
        if(voa == true){
            System.out.println("Sua ave voa");
    
          }
          else{
            System.out.println("Sua ave plana ");
          }
    }
    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
            "Nome: " + getNome() + "\n" +
            "Idade: " + getIdade() + "\n" +
            "Peso: " + getPeso() + "\n" + 
            "Tamanho a envergadura: " +getEnvergadura() + "\n" +
            "Cor das penas: " + getCorPenas();
      }
    
    
}
