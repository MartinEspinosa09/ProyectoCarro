package negocio;

public class MainCarro {

    static void main() {
        Carro c1= new Carro();
        Carro c2= new Carro();
        Carro c3 = new Carro();
        c1.potencia=2;
        c1.velocidad=60;

        c2.potencia=5;
        c2.velocidad=100;

        c3.potencia=2;
        c3.velocidad=30;

        System.out.println("la potencia del carro es "+ c1.potencia+" y la velocidad es "+ c1.velocidad);
        System.out.println("la potencia del carro es "+ c2.potencia+" y la velocidad es "+ c2.velocidad);
        System.out.println("la potencia del carro es "+ c3.potencia+" y la velocidad es "+ c3.velocidad);

        c1.nombre="rayo mcqueen";
        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        c1.nombre="sixseven";
        c2.acelerar();
        c2.acelerar();
        c2.frenar();

        c1.nombre="correcaminos";
        c3.frenar();
        c3.frenar();
        c3.frenar();


        System.out.println("el carro es "+c1.nombre+ "es"+ c1.potencia+" y la velocidad es "+ c1.velocidad);
        System.out.println("el carro es "+c2.nombre+ "es"+ c2.potencia+" y la velocidad es "+ c2.velocidad);
        System.out.println("el carro es "+c3.nombre+ "es"+ c3.potencia+" y la velocidad es "+ c3.velocidad);
    }
}
