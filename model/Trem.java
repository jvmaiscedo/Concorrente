package model;
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

  public Trem(int posX, int posY, int vel) {
    this.posicaoX = posX;
    this.posicaoY = posY;
    this.posicaoInicialX = posX;
    this.posicaoInicialY = posY;
    this.velocidade = vel;
  }

  public void movimento(int n) {

    switch (n) {
      case 1:
        if (posicaoY >= 506 && posicaoY < 552) {
          posicaoY -= velocidade;
          
        } else if (posicaoY < 506 && posicaoY >= 385) {
          posicaoY -= velocidade;
          if (posicaoX <= 373) {
            posicaoX += velocidade;
          }
          
        } else if (posicaoY < 385 && posicaoY >= 240) {
          posicaoY -= velocidade;
          if (posicaoX >= 335) {
            posicaoX -= velocidade;
          }
          
        } else if (posicaoY < 240 && posicaoY >= 128) {
          posicaoY -= velocidade;
          if (posicaoX <= 373) {
            posicaoX += velocidade;
          }

          
        } else if (posicaoY < 128 && posicaoY >= -86) {
          posicaoY -= velocidade;
          if (posicaoX >= 335) {
            posicaoX -= velocidade;
          }
          
        } else {
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
        
        break;
      case 2:
        if (posicaoY >= 506 && posicaoY < 552) {
          posicaoY -= velocidade;
         
        } else if (posicaoY < 506 && posicaoY >= 385) {
          posicaoY -= velocidade;
          if (posicaoX >= 390) {
            posicaoX -= velocidade;
          }
        
        } else if (posicaoY < 385 && posicaoY >= 240) {
          posicaoY -= velocidade;
          if (posicaoX < 419) {
            posicaoX += velocidade;
          }
         
        } else if (posicaoY < 240 && posicaoY >= 128) {
          posicaoY -= velocidade;
          if (posicaoX >= 390) {
            posicaoX -= velocidade;
          }
        } else if (posicaoY < 128 && posicaoY >= -86) {
          posicaoY -= velocidade;
          if (posicaoX < 419) {
            posicaoX += velocidade;
          }
          
        } else {
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
        
        break;
      case 3:
         if (posicaoY >= 30 && posicaoY < 89) {
          posicaoY += velocidade;
          
        } else if (posicaoY >= 89 && posicaoY < 210) {
          posicaoY += velocidade;
          if (posicaoX <= 373) {
            posicaoX += velocidade;
          }
          
        } else if (posicaoY >= 210 && posicaoY < 335) {
          posicaoY += velocidade;
          if (posicaoX >= 335) {
            posicaoX -= velocidade;
          }
         
        } else if (posicaoY >= 335 && posicaoY < 458) {
          posicaoY += velocidade;
          if (posicaoX <= 373) {
            posicaoX += velocidade;
          }

          
        } else if (posicaoY >= 458 && posicaoY < 580) {
          posicaoY += velocidade;
          if (posicaoX >= 335) {
            posicaoX -= velocidade;
          }
          
        } else {
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
        break;
        
      case 4:
         if (posicaoY >= 30 && posicaoY < 89) {
          posicaoY += velocidade;
          
        } else if (posicaoY >= 89 && posicaoY < 210) {
          posicaoY += velocidade;
          if (posicaoX >= 390) {
            posicaoX -= velocidade;
          }
          
        } else if (posicaoY >= 210 && posicaoY < 335) {
          posicaoY += velocidade;
          if (posicaoX <= 419) {
            posicaoX += velocidade;
          }
         
        } else if (posicaoY >= 335 && posicaoY < 458) {
          posicaoY += velocidade;
          if (posicaoX >= 390) {
            posicaoX -= velocidade;
          }

          
        } else if (posicaoY >= 458 && posicaoY < 580) {
          posicaoY += velocidade;
          if (posicaoX <= 419) {
            posicaoX += velocidade;
          }
          
        } else {
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
        break;
    }

  }

  public int getPosicaoX() {
    return posicaoX;
  }

  public int getPosicaoY() {
    return posicaoY;
  }

  public void setVelocidade(int vel) {
    this.velocidade = vel;
  }
  public void goToPosicaoInicial(){
    posicaoX = posicaoInicialX;
    posicaoY = posicaoInicialY;
  }
}
