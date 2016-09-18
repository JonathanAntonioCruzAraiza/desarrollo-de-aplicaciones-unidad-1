package mx.edu.utng.singleton;

/**
 * Created by TICLAB1 on 29/08/2016.
 */
public class Universidad {
    private String nombre;

    private static Universidad unicaInstancia;/*intancia de la misma clase*/

    private Universidad(){

        this.nombre="";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }



  /*metodo get unica instacia*/
    public static Universidad getUnicaInstancia() {
       if (unicaInstancia==null) {
    unicaInstancia = new Universidad();

       }
        return unicaInstancia;
    }

}
