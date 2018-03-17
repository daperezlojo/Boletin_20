/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_20;

/**
 *
 * @author Damian
 */
public class Libro {
    private String Titulo,Autor;
    private float NumeroU,Prezo;

    public Libro(String Titulo, String Autor, float NumeroU, float Prezo) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroU = NumeroU;
        this.Prezo = Prezo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public float getNumeroU() {
        return NumeroU;
    }

    public void setNumeroU(float NumeroU) {
        this.NumeroU = NumeroU;
    }

    public float getPrezo() {
        return Prezo;
    }

    public void setPrezo(float Prezo) {
        this.Prezo = Prezo;
    }
    
}

