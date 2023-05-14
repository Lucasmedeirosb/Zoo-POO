package Codigos.Animais;

import Codigos.Animal;

public abstract class Mamiferos extends Animal {
    private int contpelos;

    public Mamiferos(int id, String nome, int idade, float peso, int contpelos) {
        super(id, nome, idade, peso);
        this.contpelos = contpelos;

    }

    @Override
    public void setAlimento(String ultimacomida) {

        super.setAlimento(ultimacomida);

    }

    @Override
    public String getAlimento() {

        return super.getAlimento();
    }

    public void setContpelos(int contpelos) {
        this.contpelos = contpelos;
    }

    public int getContpelos() {
        return contpelos;
    }

}
