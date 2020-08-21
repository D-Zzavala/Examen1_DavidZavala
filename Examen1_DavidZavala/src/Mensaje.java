/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50431
 */
public class Mensaje {

    private String Texto;
    private Persona Emisor, Receptor;

    public Mensaje() {
    }

    public Mensaje(String Texto, Persona Emisor, Persona Receptor) {
        this.Texto = Texto;
        this.Emisor = Emisor;
        this.Receptor = Receptor;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public Persona getEmisor() {
        return Emisor;
    }

    public void setEmisor(Persona Emisor) {
        this.Emisor = Emisor;
    }

    public Persona getReceptor() {
        return Receptor;
    }

    public void setReceptor(Persona Receptor) {
        this.Receptor = Receptor;
    }

}
