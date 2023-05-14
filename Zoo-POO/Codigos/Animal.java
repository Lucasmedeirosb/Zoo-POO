package Codigos;

public abstract class Animal {
    private int id;
    private String nome;
    private int idade;
    private float peso;
    private String alimento;


    public Animal( int id, String nome, int idade, float peso ){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.alimento = "";

    }

    public void Comer() {
        this.peso +=1;

    }

    public void Atividade() {
        this.peso -=2;
        
    }

    public void Crescer(int cont) {
        if(cont == 10 ){
            this.idade +=1;
        }
        else{
            System.out.println("Faltam: "+cont +" dias para seu animal fazer aniversario");
        }
    }
    public void familia(String familia) {
        System.out.println("A familia do animal é: "+ familia );
    }
   

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }


  
    public String toString() {
      return "ID: " + getId() + "\n" +
          "Nome: " + getNome() + "\n" +
          "Idade: " + getIdade() + "\n" +
          "Peso: " + getPeso();
    }

    
  



    
}