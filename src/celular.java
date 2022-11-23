/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class celular {
    String marca;
    String modelo;
    float precio;
    
    public celular(String marca,String modelo, float precio){
    
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    
    }
    
    public float getprecio(){
    return precio;
    }
    
    
    
   public String mostrardato(){
   return "marca: "+marca+"\nmodelo: "+modelo+"\nprecio: $"+precio+"\n";
   }
    
}


