
package pruebasunitarias;


public class Ejercicio {

public int codEj;
public String expresion;
public int resultado;
public String nivelEj;
public int puntaje;



    public Ejercicio(int codEj, String expresion, int resultado, String nivelEj, int calificacion) {
        this.codEj = codEj;
        this.expresion = expresion;
        this.resultado = resultado;
        this.nivelEj = nivelEj;
        this.puntaje = calificacion;
    }

    public Ejercicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean crearEjercicio(int codigo, String expresion,int resultado, String nivel,  int puntaje){
        boolean res = false;
        if(resultado > 0){
            res = true;
        }
        
        return res;
    }


}
