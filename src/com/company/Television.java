package com.company;
/*Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano),
 ademas de los atributos heredados.
        Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
        Los constructores que se implementaran serán:
        Un constructor por defecto.
        Un constructor con el precio y peso. El resto por defecto.
        Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
        Recuerda que debes llamar al constructor de la clase padre.
        Los métodos que se implementara serán:
        Método get de resolución y sintonizador TDT.
        precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado,
        aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
 */
public class Television extends Electrodomestico{
    //Declaro las constantes.
    private final double RESOLUCION = 20;
    private final boolean SINTONIZADOR = false;

    //Declaro los atributos.
    private double resolucion;
    private boolean sintonizador;

    public Television(){
        super();
        this.resolucion = RESOLUCION;
        this.sintonizador = SINTONIZADOR;
        precioFinal();

    }

    public Television(double precio,double peso){
        super();
        this.precioBase = precio;
        this.peso = peso;
        precioFinal();
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        precioFinal();
    }
    //Compruebo si hay que sumar algo mas al precio final por la resolucion o el sintonizador.
    public void precioFinal(){
        super.precioFinal();
        if(resolucion > 40){
            this.precioBase += precioBase*0.30;
        }
        if(sintonizador){
            this.precioBase += 50;
        }
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
}
