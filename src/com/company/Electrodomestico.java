package com.company;
/*Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indica que se podrán heredar.
        Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg.
        Usa constantes para ello.
        Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.
        Los constructores que se implementaran serán
        Un constructor por defecto.
        Un constructor con el precio y peso. El resto por defecto.
        Un constructor con todos los atributos.
        Los métodos que implementara serán:
        Métodos get de todos los atributos.
        comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto.
         Se invocara al crear el objeto y no sera visible.
        comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto.
        Se invocara al crear el objeto y no sera visible.
        precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:*/

public class Electrodomestico {
    // declaracion de constantes.
    protected final String COLOR = "Blanco";
    protected final char CONSUMOENERGETICO = 'F';
    protected final double PRECIOBASE = 100;
    protected final double PESO = 5;
    protected final String [] COLORESDISPONIBLES = new String[]{"blanco","negro","rojo","azul","gris"};
    protected final char[] LETRASPOSIBLES = new char []{'A','B','C','D','F'};

    //Declaracion de atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {

        this.color = COLOR;
        this.precioBase = PRECIOBASE;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.peso = PESO;

    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);

        this.peso = peso;
    }
    //compruebo que el valor del consumo energetico es correcto comparandolo con la constante letras posibles.
        //Si no es correcto devuelve el valor por defecto.
        private char comprobarConsumoEnergetico(char letra){
            boolean letraValida = true;
            for (int i = 0; i < LETRASPOSIBLES.length;i++){
                if (letra != LETRASPOSIBLES[i]){
                    letraValida = false;
                }else {
                    letraValida = true;
                    break;
                }
            }

        if(letraValida == true){
            return this.consumoEnergetico = letra;
        }else {

            return this.consumoEnergetico = CONSUMOENERGETICO;
        }
    }
    //Igual que con el consumo compruebo si es un color valido. y si no lo es asigno el color por defecto.
    private String comprobarColor(String color){
        boolean colorValido = true;
        for (int i=0;i < COLORESDISPONIBLES.length;i++){
            if(color == COLORESDISPONIBLES[i]){

                colorValido = true;
                break;
            }else{
                colorValido = false;
            }
        }
        if (colorValido){
            return this.color = color;
        }
        else {
            return this.color = COLOR;
        }

    }
    public void precioFinal(){
        //Calculo el precio final teniendo en cuenta el consumo energetico.

        switch (consumoEnergetico){
            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case  'C':
                this.precioBase += 60;
                break;
            case  'D':
                this.precioBase += 50;
                break;
            case  'E':
                this.precioBase += 30;
                break;
            case  'F':
                this.precioBase += 10;
                break;
        }
        //ahora sumamos al precio final el importe que depende del peso.
        if (peso <= 19){
            this.precioBase += 10;
        }else if(peso>19 && peso <= 49){
            this.precioBase += 50;
        }else if(peso > 49 && peso <= 79){
            this.precioBase += 80;
        }else{
            this.precioBase += 100;
        }



    }

    public double getPRECIOBASE() {
        return PRECIOBASE;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
