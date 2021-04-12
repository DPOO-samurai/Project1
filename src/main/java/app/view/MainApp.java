package app.view;

import app.console.ConsoleApp;
import app.console.ControllerEstudiante;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        ConsoleApp.Pesumform();
        ControllerEstudiante Controller;
        while (true) {
            boolean alreadylogin=false;
            boolean maestro=false;
            if (!(alreadylogin)){
                System.out.println("login");
                System.out.println("Si es estudiante oprima 0 si es maestro oprima 1, si no se oprime ninguna se inicilizara como estudiante");

                Scanner login = new Scanner(System.in);

                var number_login = login.nextInt();

                if(number_login == 0){
                    System.out.println("Nombre del estudiante:");
                    var nombre_estudiante = login.nextLine();
                    maestro=false;
                    Controller =new ControllerEstudiante();
                    alreadylogin=true;
                }
                else if (number_login == 1) {
                    System.out.println("Nombre del estudiante:");
                    var nombre_estudiante = login.nextLine();
                    maestro=true;
                    alreadylogin=true;
                } else {
                    break;
                }
            }
            if (maestro) {
                imprimir.imprimir1();
                System.out.println("seleccione una opcion para continuar");
                Scanner entradaprincipal = new Scanner(System.in);
                int opcion = Integer.parseInt(entradaprincipal.nextLine());
                if (opcion == 1) {
                    System.out.println("seleccione una opcion para continuar");
                }
                else if(opcion == 2) {
                    System.out.println("seleccione una opcion para continuar");
                }
                else if(opcion == 3) {
                    System.out.println("seleccione una opcion para continuar");
                }else if(opcion == 4) {
                    System.out.println("seleccione una opcion para continuar");
                }else if(opcion == 5) {
                    System.out.println("seleccione una opcion para continuar");
                }else if(opcion == 7) {
                    System.out.println("seleccione una opcion para continuar");
                }else {
                    break;
                }
            }
            else{
                imprimir.imprimir2();
                System.out.println("seleccione una opcion para continuar");
                Scanner entradaprincipal = new Scanner(System.in);
                int opcion = Integer.parseInt(entradaprincipal.nextLine());
                if (opcion == 1) {

                    //requisitos_ya_cumplidos.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
                }
                else if(opcion == 2) {
                    System.out.println("seleccione una opcion para continuar");
                }
                else if(opcion == 3) {
                    System.out.println("seleccione una opcion para continuar");
                }else if(opcion == 4) {
                    System.out.println("seleccione una opcion para continuar");
                }else if(opcion == 5) {
                    System.out.println("seleccione una opcion para continuar");
                }else if(opcion == 7) {
                    System.out.println("seleccione una opcion para continuar");
                }
                else {
                    break;
                }
            }

        }
    }
}
