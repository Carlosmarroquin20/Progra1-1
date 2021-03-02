  
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int fi;
        Scanner so = new Scanner((System.in));

        //instrucciones y bienvenida
        do{
            Scanner obj = new Scanner((System.in)); 

            //switch
            int No;
            System.out.println("");
            System.out.println("BIENVENIDO!!!");
            System.out.println("1.- Tamaño (te dira el numero de letras de tu cadena!!)"); 
            System.out.println("2.- Subcadena (permite seleccionar una parte especifica de la cadena!) ");
            System.out.println("3.- Comparación de palabras (Son las mismas???)");
            System.out.println("4.- Comparación de tamaño");
            System.out.println("5.- Salir! ");

            No = obj.nextInt(); 

            switch (No) {
                //Tamaño 1
                case 1: 
                    String Principal = "";
                    int NoIG = 0;

                    Scanner in = new Scanner(System.in);

                    System.out.println("-----Tamaño-----");
                    System.out.println("                 ");
                    System.out.print("Ingrese la cadena para medir su tamaño ");
                    Principal = in.nextLine();
                    NoIG = Principal.length();
                    System.out.println("");
                    System.out.println("El tamaño total de '" + Principal + "' es igual a: " + NoIG);
                    break;

                //Subcadena
                case 2: 
                    System.out.println("");
                    System.out.println("--Subcadena--");

                    String cadena1 = "", SUB = "";
                    int Oring = 0, Fin = 0, num1 = 0;

                    Scanner in1 = new Scanner(System.in);
                    System.out.println("--------------");
                    //Subcadena Instrucciones
                    System.out.print("Ingrese la cadena que desee: ");
                    cadena1 = in1.nextLine();
                    num1 = cadena1.length();
                    System.out.println("");
                    System.out.print("¿Desde que letra quiere saber para tener la nueva cadena?");
                    Oring = in1.nextInt();
                    System.out.println("");
                    System.out.print("¿Hasta que numero de letra desea llegar?");
                    Fin = in1.nextInt();

                    if (Fin > num1){
                        System.out.println("");
                        System.out.print("La cantidad que ingreso es mayor a la cadena original");

                    } else {
                        SUB = cadena1.substring(Oring, Fin);
                        System.out.println("");
                        System.out.println("La nueva cadena es: " + SUB);
                    }
                    break;

                //Comparación de palabras
                case 3:
                    int Va; 
                    String var1 = "", var2 = "";

                    Scanner in2 = new Scanner(System.in);

                    System.out.println("");
                    System.out.println("Comparación de palabras");
                    System.out.println("");
                    System.out.println("Primera Palabra: ");
                    var1 = in2.nextLine();
                    String lower = var1.toLowerCase();

                    System.out.println("Segunda palabra: ");
                    var2 = in2.nextLine();
                    String eM = var2.toLowerCase();

                    System.out.println("");
                    System.out.println("1. Ignorar mayúsculas");
                    System.out.println("2. No ignorar mayúsculas");

                    Va = in2.nextInt(); 

                    switch (Va) {
                        case 1:
                            if (lower.equals(eM)){
                                System.out.println("");
                                System.out.println("Las palabras son iguales");

                            } else {
                                System.out.println("");
                                System.out.println("Las palabras no son iguales");
                            }
                            break;

                        case 2:
                            if (var1.equals(var2)){
                                System.out.println("");
                                System.out.println("Las palabras son iguales");

                            } else {
                                System.out.println("");
                                System.out.println("Las palabras no son iguales");
                            }
                            break;
                    }
                    break;

                //Comparación de tamaño
                case 4: 
                    int vv;
                    String varv = "", varv1 = "";

                    Scanner ca = new Scanner(System.in);

                    System.out.println("");
                    System.out.println("Comparación de tamaño");
                    System.out.println("");
                    System.out.println("Ingrese la primera cadena: ");
                    varv = ca.nextLine();
                    int lo = varv.length();
                    String re = varv.replace(" ", "");
                    int la = re.length();
                    System.out.println("");
                    System.out.println("Ingrese la segunda cadena: ");
                    varv1 = ca.nextLine();
                    int lo1 = varv1.length();
                    String re1 = varv1.replace(" ", "");
                    int la1 = re1.length();

                    System.out.println("");
                    System.out.println("1. Ignorar espacios en blanco");
                    System.out.println("2. No ignorar espacios en blanco");

                    vv = ca.nextInt(); 

                    switch (vv) {
                        case 1:
                            if (la == la1){
                                System.out.println("");
                                System.out.println("Las cadenas son iguales");

                            } else {
                                System.out.println("");
                                System.out.println("Las cadenas no son iguales");
                            }
                            break;

                        case 2:
                            if (lo == lo1){
                                System.out.println("");
                                System.out.println("Las cadenas son iguales");

                            } else {
                                System.out.println("");
                                System.out.println("Las cadenas no son iguales");
                            }
                            break;
                    }
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("Salir");
                    break;
            }
            System.out.println("");
            System.out.println("¿Desea continuar?");
            System.out.println("1. Si ------ 2. No");
            System.out.println("");
            fi = so.nextInt();
        }
        while(fi == 1);
    }
}