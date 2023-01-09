import java.util.Scanner;

//Ejercicios tema 3 introduccion a la programacion OpenBootcamp Arturo Ferrero Garcia
public class Main {
    public static void main(String[] args) {

        //Metodo que hace la suma de 3 variables
       // System.out.println(sumaTres(1,1,1));
        //Creaccion de objeto COche, suma de puerta y impresion por pantalla del num puertas
       // Coche miCoche= new Coche();
       // miCoche.addPuerta();
       // miCoche.mostrarPuertas();

        //IMPRIMIENDO EJERCICIOS EN PSEUDOCODIGO AHORA EN JAVA
        //ejercicioUno();
        //ejercicioDos();
        //ejercicioTres();
        //ejercicioCuatro();
        //ejercicioCinco();
        //ejercicioSeis();
        //EL EJERCICIO SIETE NO SE HA HECHO
        //ejercicioOcho();

    }
    //El metodo debe incluir static al estar incluido en el metodo static main
    public static int sumaTres(int a, int b, int c) {
        return a + b + c;

    }

    /*
    * EJERCICIOS RESUELTOS DE PSEUDOCODIGO DEL 1 AL 10
    *
    * */

    //Pseudocodigo que imprima numeros del 1 al 100 de forma decreciente
    public static void ejercicioUno(){

        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
    }

    //Pseudocodigo que imprima numeros del 1 al 100 de forma creciente
    public static void ejercicioDos(){

        for(int i=100; i>=0; i--){
            System.out.println(i);
        }
    }
    //Imprimir los num pares de los 100 primeros numeros

    public static void ejercicioTres(){
        for(int i=1; i<=100 ; i++){
            if (i % 2==0){
                System.out.println(i);
            }
        }
    }
    //Imprimir suma de los 100 primeros numeros  // este se puede mejorar imp valor de forma individual
    public static void ejercicioCuatro(){
    int suma =0;
    for(int i=1; i<=100 ; i++){
        suma=suma+i;
    }
        System.out.println(suma);
    }
    //Imprimir num impares hasta el 100 y que imprima cuantos impares hay

    public static void ejercicioCinco(){
        int contador=0;
        for(int i=1; i<=100; i++){
        if(i%2!=0){
            System.out.println("El num "+i+" es impar");
            contador++;
        }
        }
        System.out.println("El numero total de impares en total es "+contador);
    }

    //Hacer un pseudocodigo que imprima todos los numeros naturales que hay
    //desde la unidad hasta un numero que introducimos por teclado.
    public static void ejercicioSeis(){
    Scanner leer = new Scanner(System.in);
    int numNat=0;
    boolean salvoconducto=false;
    while(salvoconducto==false) {
        System.out.println("Introduzca un numero natural entre 1 y 100:");
        numNat= leer.nextInt();
        if(numNat>0 & numNat<=100) {
            salvoconducto=true;
        }
    }
        System.out.println("El numero introducido es "+numNat);
        System.out.println("Ahora empezaremos a imprimir en orden ascendente el total");
    for(int i=1;i<=numNat;i++ ){
        System.out.println(i);
    }
        System.out.println("Programa finalizado hasta luego lucas");
    }

    /*
    *Programa que imprime tantas frases como queramos y luego las cuente
    * */
    public static void ejercicioSiete(){}

    //8.-Hacer un pseudocodigo que solo nos permita introducir S o N. SIN TERMINAR
    public static void ejercicioOcho(){
        Scanner leer = new Scanner(System.in);
        String opcion= new String();
        boolean salvoconducto=false;
        while(salvoconducto==false) {
            System.out.println("Introduzca un S o N:");
            opcion= leer.next();
            if(opcion=="S" | opcion=="N") {
                salvoconducto=true;
            }
        }
        System.out.println("Has elegido la opcion "+opcion);
    }



}
class Coche {
    //Atributos
    //Contador num puertas objeto coche
    private int numPuertas;
    //constructor

    //Metodos
    //Incrementa atributo numPuertas en 1
    public void addPuerta() {
        this.numPuertas++;
    }

    //Muestra num puertas
    public void mostrarPuertas()

    {
        System.out.println(this.numPuertas);
    }
}