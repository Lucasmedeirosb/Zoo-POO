package Codigos.Animais;

import Codigos.Animal;

public abstract class Aves extends Animal {
    private int envergadura;
    private boolean voa;

    public Aves(int id, String nome, int idade, float peso, int envergadura){
        super(id, nome, idade, peso);
        this.envergadura = envergadura;
        
    }
    public void Ehvoador(boolean voa) {
        if(this.voa == true){
            System.out.println("Sua ave voa ");
    
          }
          else{
            System.out.println("Sua ave plana ");
          }
        
    }
    public int getEnvergadura() {
        return envergadura;
    }
    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }
    public boolean getvoa(){
        return voa;
    }
  

}
