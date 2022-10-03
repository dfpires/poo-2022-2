/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.prova1;

import java.util.Date;

/**
 *
 * @author danielfacciolo
 */
public class Compra {
    private int id;
    private Date data;
    private Figurinha figura;
    private Album album;

    public Compra() {
    }
     
    public Compra(int id, Date data, Figurinha figura, Album album) {
        this.id = id;
        this.data = data;
        this.figura = figura;
        this.album = album;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Figurinha getFigura() {
        return figura;
    }

    public void setFigura(Figurinha figura) {
        this.figura = figura;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", data=" + data + ", figura=" + figura + ", album=" + album + '}';
    }
    
    
    
}
