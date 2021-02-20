package com.company;
/*Crea un array de Electrodomesticos de 10 posiciones.
        Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
        Ahora, recorre este array y ejecuta el método precioFinal().
        Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las
        lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que
        Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
 */
public class Main {

    public static void main(String[] args) {

     Electrodomestico[] arrayDeCosas = new Electrodomestico[6];
     arrayDeCosas[0] = new Television(100,"negro",
             'A',30,22,false);
     arrayDeCosas[1] = new Television(150,"azul",
                'A',30,22,false);
     arrayDeCosas[2] = new Lavadora(100,50,
                "blanco",'C',10);
     arrayDeCosas[3] = new Television(100,"negro",
                'A',30,22,false);
     arrayDeCosas[4] = new Electrodomestico(100,"negro",
                'A',30);
     arrayDeCosas[5] = new Electrodomestico(100,"negro",
                'A',30);

     int totalpreciolavadoras = 0;
     int totalpreciotele = 0;
     int totalprecioelectro = 0;

     for(int i = 0; i < arrayDeCosas.length;i++){
         if (arrayDeCosas[i] instanceof Electrodomestico){
             totalprecioelectro += arrayDeCosas[i].getPrecioBase();
         }
         if (arrayDeCosas[i] instanceof Lavadora){
             totalpreciolavadoras += arrayDeCosas[i].getPrecioBase();
         }
         if (arrayDeCosas[i] instanceof Television){
             totalpreciotele += arrayDeCosas[i].getPrecioBase();
         }
     }
     System.out.println(totalprecioelectro);
     System.out.println(totalpreciolavadoras);
     System.out.println(totalpreciotele);
    }
}
