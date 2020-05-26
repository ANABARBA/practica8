/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PATITO
 */
public class EjemploTipoList {
    
    public EjemploTipoList(){
        principal();
    }
    
    public void principal(){
        List<Datos> lista = new ArrayList<>();
        Datos datos = new Datos();
        datos.setNombre(" ANA PATRICIA ");
        datos.setEdad( 21 );
        
       lista.add(datos);
       datos = new Datos();
       
       
       
       datos.setNombre(" MATEO ");
       datos.setEdad (  19 );
       
       lista.add(datos);
       
       datos = new Datos();
       datos.setNombre(" DANIELA ");
       datos.setEdad ( 19 );
       lista.add(datos);
       
       lista.forEach(elemento ->{
           System.out.println("Nombre" + elemento.getNombre());
           System.out.println("Edad" + elemento.getEdad());
       });
       
        System.out.println("\n\n OTRA FORMA DE RECORRER LOS DATOS \n\n");
        for (Datos contenido : lista){
            System.out.println("Nombre" + contenido.getNombre());
            System.out.println("edad" + contenido.getEdad());
        }
        datos = new Datos();
        datos.setNombre(" AGUSTIN ");
        lista.add(datos);
        System.out.println("\n\n TERCER FORMA DE VISUALIZAR EL CONTENIDO \n\n");
        lista.stream().forEach((valores) -> {
            System.out.println("Nombre" + valores.getNombre());
            System.out.println("edad" + valores.getEdad());
            if (valores.getNombre().equals("fernando")){
                System.out.println("\n\n SE ENCONTRO EL DATO \n\n");
            }
            
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemploTipoList();
    }
    
}
