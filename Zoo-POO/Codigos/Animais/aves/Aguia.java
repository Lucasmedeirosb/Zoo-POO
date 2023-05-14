package Codigos.Animais.aves;

import Codigos.Animais.Aves;

public class Aguia extends Aves {
  private boolean gerouFilhos;
  

  public Aguia(int id, String nome, int idade, float peso,int envergadura, boolean gerouFilhos) {
    super(id, nome, idade, peso, envergadura);

    this.gerouFilhos = gerouFilhos;

  }

  public boolean getgerouFilhos() {

    return gerouFilhos;

  }

  @Override
  public void Ehvoador(boolean voa) {
    voa = true;
    if (voa == true) {
      System.out.println("Sua ave voa");

    } else {
      System.out.println("Sua ave plana ");
    }
  }
  @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
            "Nome: " + getNome() + "\n" +
            "Idade: " + getIdade() + "\n" +
            "Peso: " + getPeso() + "\n" + 
            "Tamanho da envergadura: " +getEnvergadura() + "\n" +
            "Se gerou filhos: " + getgerouFilhos();
      }

}
