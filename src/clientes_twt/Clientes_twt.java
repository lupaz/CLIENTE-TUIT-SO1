/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes_twt;

/**
 *
 * @author lupaz
 */
public class Clientes_twt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Peticion peticiones = new Peticion();
        System.out.println(peticiones.httpGetSimple("http://localhost:3000/create?usr=Lupaz&nom=Luis+Paz&txt=Quisiera+leer+todos+los+dias+*colegio"));
        
        Generador gen = new Generador("Luis Paz","Lupaz","http://localhost:3000");
        
        System.out.println(gen.generarURL());
        System.out.println(gen.generarURL());
        System.out.println(gen.generarURL());
        System.out.println(gen.generarURL());
        
        
    }
    
}
