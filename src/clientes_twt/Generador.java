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
public class Generador {
    
    private String nombre;
    private String user;
    private String url="";
    
    private final String Sujeto1[]= {"Estoy ","Voy "};
    private final String Sujeto2[]= {"Quiero ","Deseo ","Pienso ","Quisiera ","Desearia "};
    
    private final String Verbo1[]={"corriendo ","comiendo ","jugando ","cantando ","bailando ","gritando "};
    private final String Verbo2[]={"reirme ","llorar ","correr ","leer ","beber ","escribir "};
    
    private final String Predicado1[] = {"en el parque ","en la torre ","en la escuela ","en la camioneta ","en el mercado ","en la universidad "};
    private final String Predicado2[] = {"todos los dias ","de vez en cuando ","por la mañana ","por la noche ","al medio día ","cuando despierto ","estando solo ","cuando me case "};
    
    private final String categorias[] = {"*aviso", "*usac", "*everyday","*colegio","*metas","*deporte","*history","*wishes"};
    
    public Generador(String nombre, String user,String url){
        this.nombre=nombre;
        this.user=user;
        this.url=url;
    }
    
    public String generarURL(){
        String Url;
        Url = url;
        Url+="/create?";
        Url+= completar_url();
        return Url;
    }
    
    private String completar_url(){
        String res="";
        res+="usr="+user+"&";
        res+="nom="+nombre+"&";
        res+="txt="+generar_tuit();
        res+= categorias[(int) (Math.random()*categorias.length)];
        res=res.replace(" ","+");
        return res;
    }
    
    private String generar_tuit(){
        String res="";        
        int tipo = (int) (Math.random()*2)+1;
        if(tipo==1){
            res+=Sujeto1[(int) (Math.random()*Sujeto1.length)]+Verbo1[(int) (Math.random()*Verbo1.length)]+Predicado1[(int) (Math.random()*Predicado1.length)];
        }else{
            res+=Sujeto2[(int) (Math.random()*Sujeto2.length)]+Verbo2[(int) (Math.random()*Verbo2.length)]+Predicado2[(int) (Math.random()*Predicado2.length)];
        }
        return res;
    }
}
