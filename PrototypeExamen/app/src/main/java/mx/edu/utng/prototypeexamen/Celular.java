package mx.edu.utng.prototypeexamen;

import java.util.Objects;

/**
 * Created by jony on 7/9/2016.
 */
public class Celular implements Clonable {
    private String modelo;
    private String marca;
    private String compañia;

    public  Celular(){
        this.modelo="";
        this.compañia="";
        this.marca="";
    }



    public Celular(String modelo, String compañia,String marca){
        this.compañia = compañia;
        this.modelo = modelo;
        this.marca= marca;
     }

    @Override
    public Clonable clonar() {
        Celular clon = new Celular();
        clon.setCompañia(compañia);
        clon.setMarca(marca);
        clon.setModelo(modelo);
        return clon;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

}
