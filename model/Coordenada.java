package model;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jvmaiscedo
 */
public class Coordenada {
  private int coordenadaX;
  private int coordenadaY;
  
  public Coordenada(int x, int y){
    this.coordenadaX = x;
    this.coordenadaY = y;
  }

  public int getCoordenadaX() {
    return coordenadaX;
  }

  public int getCoordenadaY() {
    return coordenadaY;
  }

  public void setCoordenadaX(int coordenadaX) {
    this.coordenadaX = coordenadaX;
  }

  public void setCoordenadaY(int coordenadaY) {
    this.coordenadaY = coordenadaY;
  }
  
  
  
}
