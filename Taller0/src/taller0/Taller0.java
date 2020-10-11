package taller0;

import ucn.*;
import java.io.IOException;

public class Taller0 {
    public static void desplegarClientes(String[] vecRut,String[] vecNombre,String[] vecApellido,String[]vecClave,int contRut){
        for(int i=0; i <contRut;i++){
            StdOut.println(vecRut[i]+","+vecNombre[i]+","+vecApellido[i]+","+ vecClave[i]);
        
        }
             
    }   
    
    public static void desplegarCamiones(String[] vecPatente,String[] vecMarca,double[] vecKilometraje,int contPatente){
        for(int i=0; i <contPatente;i++){
            StdOut.println(vecPatente[i]+","+vecMarca[i]+","+vecKilometraje[i]);
        
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
    
    public static int leerCamiones(String[] vecPatente,String[] vecMarca, double[] vecKilometraje) throws IOException{
        int contPatente = 0;
        ArchivoEntrada arch1 = new ArchivoEntrada("Camiones.txt");
        while(!arch1.isEndFile()){
            Registro regEnt = arch1.getRegistro();
            
            vecPatente[contPatente] =regEnt.getString();
            vecMarca[contPatente] =regEnt.getString();
            vecKilometraje[contPatente] =regEnt.getDouble();
            contPatente++;
        
        }
        arch1.close();
        return contPatente;
    }
        
    // Subprograma para leer el archivo de texto cupones
    public static int leerEntregas(int[] vecCodigo,String[] vecMercancia,double[] vecKilos) throws IOException{
        int contCodigos = 0;
        ArchivoEntrada arch1 = new ArchivoEntrada("Entregas.txt");
        while(!arch1.isEndFile()){
            Registro regEnt = arch1.getRegistro();
            int codigo = regEnt.getInt();
            String mercancia = regEnt.getString();
            double kilos = regEnt.getDouble();            
            
            if (codigo >=0 && codigo <=99999 && kilos >= 0){
                vecCodigo[contCodigos] = codigo;
                vecMercancia[contCodigos]= mercancia;
                vecKilos[contCodigos]= kilos;
                contCodigos++;
            }
        }
        arch1.close();
        return contCodigos;
    }
    
    public static int leerCiudades(String[] vecCiudad, double[] vecDistancia) throws IOException{
        int contCiudades = 0;
        ArchivoEntrada arch1 = new ArchivoEntrada("Ciudades.txt");
        while(!arch1.isEndFile()){
            Registro regEnt = arch1.getRegistro();
            String ciudad = regEnt.getString();
            double distancia = regEnt.getDouble();            
            
            if (distancia >=0){
                vecCiudad[contCiudades] = ciudad;
                vecDistancia[contCiudades]= distancia;
                contCiudades++;
            }
        }
        arch1.close();
        return contCiudades;
    }
    
    public static void main(String[] args) throws IOException {
        //Leyendo  datos de los trabajadores
        String[] vecRut = new String[999];
        String[] vecNombre = new String[999];
        String[] vecApellido = new String[999];
        String[] vecClave = new String[999];
        
        //leyendo datos de los camiones
        String[] vecPatente = new String[999];
        String[] vecMarca = new String[999];
        double[] vecKilometraje = new double[999];
        
       //Leyendo datos de las entregas
        int[] vecCodigo = new int[999];
        String[] vecMercancia = new String[999];
        double[] vecKilos = new double[999];
       
       //Leyendo datos de las ciudades
       String[] vecCiudad =  new String[999];
       double[] vecDistancia = new double [999];
       
        
        int contRut= leerTrabajadores(vecRut,vecNombre,vecApellido,vecClave); 
        int contPatente= leerCamiones(vecPatente,vecMarca,vecKilometraje);
        int contCodigos= leerEntregas(vecCodigo,vecMercancia,vecKilos);
        int contCiudad= leerCiudades(vecCiudad,vecDistancia);
        
        //desplegarClientes(vecRut,vecNombre,vecApellido,vecClave,contRut);
        //desplegarCamiones(vecPatente,vecMarca,vecKilometraje,contPatente);
        //desplegarEntregas(vecCodigo,vecMercancia,vecKilos,contCodigos);
        //desplegarCiudades(vecCiudad,vecDistancia,contCiudad);
        StdOut.println("Chupala cristian");
    }

}