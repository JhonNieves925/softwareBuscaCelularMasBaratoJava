
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Main {
    
    public static int celularbarato(celular celularm[]){
    float precio;
    int indice = 0;
    
    precio = celularm[0].getprecio();
    for(int i=1;i<celularm.length;i++){
    if(celularm[i].getprecio()<precio){
    precio = celularm[i].getprecio();
    indice = i;
        }
      }
       return indice;
    }
    
    
    public static void main(String [] args){
    
    String marca,modelo;
    float precio;
    int numcel,barato;
    
   numcel = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de celulares que va a llevar: "));
    
    
    celular celularm[] = new celular[numcel];
    
    for (int i=0;i<celularm.length;i++){
    
    marca = JOptionPane.showInputDialog("digite la marca del celular");
    modelo = JOptionPane.showInputDialog("digite el modelo del celular");
    precio = Float.parseFloat(JOptionPane.showInputDialog("digite el precio del celular"));
    
    celularm[i] = new celular(marca,modelo,precio);
  
    }
    
    barato = celularbarato(celularm);
    JOptionPane.showMessageDialog(null,"EL celular mas barato es: \n"+celularm[barato].mostrardato());
    
    }
}

