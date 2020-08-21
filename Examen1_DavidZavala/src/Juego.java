
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50431
 */
public class Juego extends Articulo {

    private int Edicion;
    private String Casa, Pais;

    public Juego() {
        super();
    }

    public Juego(int Edicion, String Casa, String Pais, String Titulo, String Categoria, String Editorial, int Tamano, int Puntuacion, Color Colorr) {
        super(Titulo, Categoria, Editorial, Tamano, Puntuacion, Colorr);
        this.Edicion = Edicion;
        this.Casa = Casa;
        this.Pais = Pais;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }

    public String getCasa() {
        return Casa;
    }

    public void setCasa(String Casa) {
        this.Casa = Casa;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
    
}
