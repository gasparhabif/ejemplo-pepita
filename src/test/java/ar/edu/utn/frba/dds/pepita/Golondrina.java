package ar.edu.utn.frba.dds.pepita;

public class Golondrina {

    int energia;

    public Golondrina(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void comer(int cantidadComida) {
        this.energia += cantidadComida*3;
    }

    public void volar() {
        this.energia -= 10;
    }
}
