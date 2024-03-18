import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        //voy a realizar una entrada de datos
Scanner digito= new Scanner (System.in);
// nombramos en Scanner para interactuar con el ususario
System.out.println("digite un numero entero");
int num= digito.nextInt();
// llamamos a la varianble "num" en la cual se almacenan los datos digitados por  el usuario
        if ( num>=100 && num <=999) {
            System.out.println("EL NUMERO TIENE TRES DIGITOS");
        }
        //agregamos una condiion para que el numero sea de tres digitos y cerramos la condicion
    else
    {
        System.out.println("EL NUMERO NO TIENE TRES DIGITOS");
    }
// sino se cumple la condicion imprimimos un mensaje y cerramos el else"
    }

    
}
