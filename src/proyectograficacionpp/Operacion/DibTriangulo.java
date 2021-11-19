/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectograficacionpp.Operacion;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Juan Pablo
 */
public class DibTriangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private boolean control;
    private int grosor;
    private int dx;
    public DibTriangulo(Punto p1,Punto p2,Punto p3){
        this.p1= p1;
        this.p2 = p2;
        this.p3 = p3;
        this.control = control;
        this.grosor = grosor;
        this.dx = dx;
    }
    public void dibujarTriangulo(Graphics g,Color c){
        DibLinea linea = new DibLinea(p1.getX1(),p2.getX1(),p1.getY1(),p2.getY1(),false,0);
        DibLinea linea1 = new DibLinea(p1.getX1(),p3.getX1(),p1.getY1(),p3.getY1(),false,0);
        DibLinea linea2 = new DibLinea(p2.getX1(),p3.getX1(),p2.getY1(),p3.getY1(),false,0);
        linea.dibujarLinea(g,c);
        linea1.dibujarLinea(g,c);
        linea2.dibujarLinea(g,c);
        
    }
}
