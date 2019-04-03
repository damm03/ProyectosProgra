
/*
    Doneli Abraham Molineros Mijangos
    0901-17-2332
*/

package estructuralibros;


import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Libro libro;
        Lista lista2 = new Lista();
        Scanner sc = new Scanner(System.in);
        String titulo,autor,isbn; 
        int op2;
        int op = 0;
        
        System.out.print("Ingrese numero de libros a ingresar:   ");
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
          
       
             System.out.println("Ingrese El Nombre del Titulo: ");
             titulo = sc.next();
             System.out.println("Ingrese el nombre del Autor: ");
             autor = sc.next();
             System.out.println("Ingrese el Codigo: ");
             isbn = sc.next();
        
        libro = new Libro(titulo,autor,isbn);
        lista2.insertarPrincipio(libro);
        }
        
        do{  
            
        System.out.print("\n\t ¿Que desea realizar?: ");  
        System.out.print(" \n\t 1) Eliminar \n\t 2) Mostrar \n\t    Opcion: ");
        
        op = sc.nextInt();


        switch (op) {

            case 1:
                int eli;
                System.out.print("\n\t Eliminar: \n\t 1. Primero \n\t 2. Ultimo \n\t 3. Todo \n\t    Opcion: ");
                eli = sc.nextInt();
                if(eli == 1){
                    
                //Eliminar el principio
                lista2.borrarPrimero();
                
                }
                if(eli ==2){
                
                //Elimanar el ultimo 
                lista2.eliminarUltimo();
 
                }
                if(eli==3){
                    //Eliminar el libro
                    
                int n = 0;  
                lista2.eliminarLibro(n);

                }
                break;

            case 2:
                
                System.out.print("Libros Ingresados: ");
                System.out.println(lista2.Listar());
                
               

                break;

          

        }
        System.out.print("Desea hacer otra operacion \n\t 1. Si \n\t 0. No :  ");
        op2 = sc.nextInt();
        }while(op2!=0);
    }

    
}
