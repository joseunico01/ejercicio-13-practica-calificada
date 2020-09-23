
package ejer13;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejer13 {

    public static void main(String[] args) {Scanner entrada=new Scanner (System.in);
        int n_filas,n_col;
        float arreglo[][]=new float[3][3];
        float matriz1[][]=new float[3][3];
        float matriz2[][]=new float[3][3];
        
        JOptionPane.showMessageDialog(null, "Digite la 1er matriz: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz1[i][j]=entrada.nextFloat();
            }
        }
        System.out.println("");
        
           JOptionPane.showMessageDialog(null, "Digite la 2er matriz: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz2[i][j]=entrada.nextFloat();
            }
        }     
        System.out.println("");
        System.out.println("Suma de las 2 matrices: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arreglo[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
           //mostramos la suma de matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arreglo[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("El promedio de marices: ");
     //hacemos el promedio
     for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arreglo[i][j]=(matriz1[i][j]+matriz2[i][j])/2;
            }
        }
     for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arreglo[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        

    }
}
