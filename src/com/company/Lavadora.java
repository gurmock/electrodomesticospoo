package com.company;
/*Su atributo es carga, ademas de los atributos heredados.
        Por defecto, la carga es de 5 kg. Usa una constante para ello.
        Los constructores que se implementaran serán:
        Un constructor por defecto.
        Un constructor con el precio y peso. El resto por defecto.
        Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
        Los métodos que se implementara serán:
        Método get de carga.
        precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
         Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.*/


public class Lavadora extends Electrodomestico{
    //Declaro la constante de carga
    private final double CARGA = 5;
    //Declaro el atributo carga
    private double carga;

    public Lavadora() {
        super();
        precioFinal();

    }
    public Lavadora(double precioBase, double peso){
        super();
        this.carga = CARGA;
        precioFinal();


    }
    public Lavadora(double carga,double precioBase, String color, char consumoEnergetico, double peso){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
        precioFinal();

    }
    public void precioFinal(){
        super.precioFinal();
        if(this.carga > 30){
            this.precioBase +=50;
        }

    }

    public double getCarga() {
        return carga;
    }
}
