
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
public class Figura extends Articulo{

    private String Descripcion, Instrucciones, Ingreso;
    private int Time;

    public Figura() {
        super();
    }

    public Figura(String Ingreso,String Descripcion, String Instrucciones, int Time, String Titulo, String Categoria, String Editorial, int Tamano, int Puntuacion, Color Colorr) {
        super(Titulo, Categoria, Editorial, Tamano, Puntuacion, Colorr);
        this.Ingreso = Ingreso;
        this.Descripcion = Descripcion;
        this.Instrucciones = Instrucciones;
        this.Time = Time;
    }

    public String getIngreso() {
        return Ingreso;
    }

    public void setIngreso(String Ingreso) {
        this.Ingreso = Ingreso;
    }
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getInstrucciones() {
        return Instrucciones;
    }

    public void setInstrucciones(String Instrucciones) {
        this.Instrucciones = Instrucciones;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }
    
    
}
