package app.view;

import app.console.ConsoleApp;
import app.console.ControllerEstudiante;
import backend.models.CourseList;

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
                    System.out.println("Escriba el nombre del estudiante");
                    String estudiante=entradaprincipal.nextLine();
                    System.out.println("estudainte a revisar"+estudiante);
                }
                else {
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

                }
                else if(opcion == 3) {
                    //CourseList lista=Controller.coursesDone();
                    //System.out.println(lista);
                }else if(opcion == 4) {
                   // System.out.println(Controller.coursesNotdone());
                }else if(opcion == 5) {
                    //System.out.println(Controller.isDegreecandidate());
                }else if(opcion == 6) {
                    System.out.println("Si quiere añadir un curso aprima 1, si quiere eliminar un curso oprima 0");
                    int desition = entradaprincipal.nextInt();
                    System.out.println("Cual semestre quiere modificar ( expreselo con un numero Ej: 6)");
                    int changeSemester= entradaprincipal.nextInt();
                    System.out.println("Escriba el codigo del curso que quiere añadir/eliminar (exacto)");
                    String courseName= entradaprincipal.nextLine();
                    //puede que controller no este inicializado revisar
                    //falta inicializar controler por ende no se pone por ahora
                    //Controller.semesterPlanning(desition,changeSemester,entradaprincipal.nextInt()); ;
                }
                else {
                    break;
                }
            }

        }
    }
}
