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
public class Persona extends Thread {
    
    private String nombre;
    private String user;
    private String url;
    private Generador gen;
    private Peticion peticion;
    
    public Persona( String nombre, String user, String url){
        this.nombre=nombre;
        this.user=user;
        this.url=url;
    }
    
    @Override
    public void run(){
        System.out.println("Llego al metodo run de persona");
        gen = new Generador(nombre, user, url);
        peticion= new Peticion();
        int i =0;
        while(true){            
            String resp = peticion.httpGetSimple(gen.generarURL());
            if(resp.equals("error")){
                //contaador de fallidas
                System.out.println("Error petición");
                Interfaz_Concurrencia.peticionesPerdidas+=1;
            }else{
                //contador de correctas
                Interfaz_Concurrencia.peticionesCorrectas+=1;
                System.out.println("Success petición");
            }
            if(Interfaz_Concurrencia.ejecutando == false){
                break;
            }
        }
        this.interrupt();
    }
}