package negocio;

public class Carro {
    String nombre;
    public int potencia;
    public double velocidad;

    public void acelerar(){
        velocidad += potencia;
    }
    public void frenar(){
        velocidad /= potencia;
    }
}
