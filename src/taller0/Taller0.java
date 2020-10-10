/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller0;

import ucn.*;
import java.io.IOException;

public class Taller0 {
    public static void desplegarClientes(String[] vecRut,String[] vecNombre,String[] vecApellido,String[]vecClave,int contRut){
        for(int i=0; i <contRut;i++){
            StdOut.println(vecRut[i]+","+vecNombre[i]+","+vecApellido[i]+","+ vecClave[i]);
        
        }
             
    }
    
        
    
    
    //Subprograma para leer el archivo de texto Trabajadores
    public static int leerTrabajadores(String[] vecRut,String[] vecNombre,String[] vecApellido,String[] vecClave) throws IOException{
       int contRut = 0;
       ArchivoEntrada arch1 = new ArchivoEntrada("Trabajadores.txt");
       while(!arch1.isEndFile()){
           Registro regEnt = arch1.getRegistro();
            
           vecRut[contRut] = regEnt.getString();
           vecNombre[contRut] = regEnt.getString();
           vecApellido[contRut] = regEnt.getString();
           vecClave[contRut] = regEnt.getString();
           contRut++;
        }
        arch1.close();
        return contRut;
    }
    
    
     
     
    
    public static int leerComputadores(int[] vecCodigo,String[] vecMarca,String[] vecModelo,int[] vecPrecios,int[] vecStock) throws IOException{
        int contComputadores = 0;
        ArchivoEntrada arch1 = new ArchivoEntrada("computadores.txt");
        while(!arch1.isEndFile()){
            Registro regEnt = arch1.getRegistro();
            int codigo = regEnt.getInt();
            String marca = regEnt.getString();
            String modelo = regEnt.getString();
            int precios = regEnt.getInt();
            int stock = regEnt.getInt();
            
            if (precios >=250000 && precios <=1000000){
                vecCodigo[contComputadores] = codigo;
                vecMarca[contComputadores]= marca;
                vecModelo[contComputadores]=modelo;
                vecPrecios[contComputadores]=precios;
                vecStock[contComputadores]=stock;
                contComputadores++;
            }
        
        }
        arch1.close();
        return contComputadores;
    }
        
    // Subprograma para leer el archivo de texto cupones
    public static int leerCupones(int[] vecCupones,int[] vecDescuentos) throws IOException{
        int contCupones = 0;
        ArchivoEntrada arch1 = new ArchivoEntrada("cupones.txt");
        while(!arch1.isEndFile()){
            Registro regEnt = arch1.getRegistro();
            int cupon = regEnt.getInt();
            int descuento = regEnt.getInt();
            
            if (descuento >=10000 && descuento <=50000){
                vecCupones[contCupones] = cupon;
                vecDescuentos[contCupones]= descuento;
                contCupones++;
            }
        }
        arch1.close();
        return contCupones;
    }
    
    public static void main(String[] args) throws IOException {
        
        String[] vecRut = new String[999];
        String[] vecNombre = new String[999];
        String[] vecApellido = new String[999];
        String[] vecClave = new String[999];
        //leyendo datos computador
        int[] vecCodigo = new int[999];
        String[] vecMarca = new String[999];
        String[] vecModelo = new String[999];
        double b = 3.5;
        int c = 2;
        double d = 0;
        d = d + b + c;
        StdOut.println("Suma es :" + d);
        
        int contRut= leerTrabajadores(vecRut,vecNombre,vecApellido,vecClave); 
        desplegarClientes(vecRut,vecNombre,vecApellido,vecClave,contRut);
    }
    
}
