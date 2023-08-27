/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jvmaiscedo
 */
public class Trem {
  
  private String Nome;
  private int posicaoX;
  private int posicaoY;
  private int velocidade;
  private int posicaoInicialX;
  private int posicaoInicialY;
  
  public Trem(int posX, int posY, int vel){
    this.posicaoX = posX;
    this.posicaoY = posY;
    this.posicaoInicialX = posX;
    this.posicaoInicialY= posY;
    this.velocidade = vel;
  }
  
  public void movimento(int n){
        System.out.println("inicio"+posicaoX+ " "+ posicaoY+" velocidade:"+velocidade);
   
        if(posicaoY>=506 && posicaoY<552){
          posicaoY-=velocidade;
          System.out.println("if1"+ posicaoX+ " "+ posicaoY);
        }
        else if(posicaoY<506 && posicaoY>=385){
          posicaoY-=velocidade;
          if(posicaoX>=390){
            posicaoX-=velocidade;
          }
          System.out.println("if2"+posicaoX+ " "+ posicaoY);
        }
        
        else if(posicaoY<385 && posicaoY>=240){
          posicaoY-=velocidade;
          if(posicaoX<419){
            posicaoX+=velocidade;
          }
          System.out.println("if3"+posicaoX+ " "+ posicaoY);
        }
        else if(posicaoY<240 && posicaoY>=128){
          posicaoY -= velocidade;
          if(posicaoX>=390){
            posicaoX-=velocidade;
          }
          
          System.out.println("if4"+posicaoX+ " "+ posicaoY);
        }
        else if(posicaoY<128 && posicaoY>=-86){
          posicaoY-=velocidade;
          if(posicaoX<419){
            posicaoX+=velocidade;
          }
          System.out.println("if3"+posicaoX+ " "+ posicaoY);
        }
        else{
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
     
  }
  public int getPosicaoX(){
    return posicaoX;
  }
  public int getPosicaoY(){
    return posicaoY;
  }
  public void setVelocidade(int vel){
    this.velocidade = vel;
  }
}
