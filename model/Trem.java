/* ***************************************************************
* Autor............: Joao Victor Gomes Macedo
* Matricula........: 202210166
* Inicio...........: 25/08/2023
* Ultima alteracao.: 29/08/2023
* Nome.............: Tre
* Funcao...........: esta classe tem a funcao de criar o objeto
		     do tipo Trem que, estando associado a uma
		     imagem, alterara sua posicao e velocidade
		     com que se movimenta.
*************************************************************** */
package model;
public class Trem {

  private int posicaoX; //Posicao X
  private int posicaoY; //Posicao Y
  private int velocidade; //Velocidade do trem
  private int posicaoInicialX; //Posicao X inicial do trem
  private int posicaoInicialY; //Posicao Y inicial do trem

  public Trem(int posX, int posY, int vel) {
    this.posicaoX = posX; 
    this.posicaoY = posY;
    this.posicaoInicialX = posX;
    this.posicaoInicialY = posY;
    this.velocidade = vel;
  }
  
  /* ***************************************************************
* Metodo: movimento
* Funcao: esta funcao incrementa as coordenadas (X,Y) do trem para 
	  que ele se movimente sobre os trilhos corretamente.
* Parametros: tipo de movimento a ser realizado
* Retorno: sem retorno
*************************************************************** */

  public void movimento(int n) {

    switch (n) {
      case 1:
        if (posicaoY >= 506 && posicaoY < 580) {
          posicaoY -= velocidade;
          
        } else if (posicaoY < 506 && posicaoY >= 385) {
          posicaoY -= velocidade;
          if (posicaoX <= 385) {
            posicaoX += velocidade;
          }
          
        } else if (posicaoY < 385 && posicaoY >= 240) {
          posicaoY -= velocidade;
          if (posicaoX >= 351) {
            posicaoX -= velocidade;
          }
          
        } else if (posicaoY < 240 && posicaoY >= 128) {
          posicaoY -= velocidade;
          if (posicaoX <= 385) {
            posicaoX += velocidade;
          }

          
        } else if (posicaoY < 128 && posicaoY >= -20) {
          posicaoY -= velocidade;
          if (posicaoX >= 351) {
            posicaoX -= velocidade;
          }
          
        } else {
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
        
        break;
      case 2:
        if (posicaoY >= 506 && posicaoY < 580) {
          posicaoY -= velocidade;
         
        } else if (posicaoY < 506 && posicaoY >= 385) {
          posicaoY -= velocidade;
          if (posicaoX >= 385) {
            posicaoX -= velocidade;
          }
        
        } else if (posicaoY < 385 && posicaoY >= 240) {
          posicaoY -= velocidade;
          if (posicaoX < 412) {
            posicaoX += velocidade;
          }
         
        } else if (posicaoY < 240 && posicaoY >= 128) {
          posicaoY -= velocidade;
          if (posicaoX >= 385) {
            posicaoX -= velocidade;
          }
        } else if (posicaoY < 128 && posicaoY >= -20) {
          posicaoY -= velocidade;
          if (posicaoX < 412) {
            posicaoX += velocidade;
          }
          
        } else {
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
        
        break;
      case 3:
         if (posicaoY >= 9 && posicaoY < 89) {
          posicaoY += velocidade;
          
        } else if (posicaoY >= 89 && posicaoY < 210) {
          posicaoY += velocidade;
          if (posicaoX <= 385) {
            posicaoX += velocidade;
          }
          
        } else if (posicaoY >= 210 && posicaoY < 335) {
          posicaoY += velocidade;
          if (posicaoX >= 351) {
            posicaoX -= velocidade;
          }
         
        } else if (posicaoY >= 335 && posicaoY < 458) {
          posicaoY += velocidade;
          if (posicaoX <= 385) {
            posicaoX += velocidade;
          }

          
        } else if (posicaoY >= 458 && posicaoY < 580) {
          posicaoY += velocidade;
          if (posicaoX >= 351) {
            posicaoX -= velocidade;
          }
          
        } else {
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
        break;
        
      case 4:
         if (posicaoY >= 9 && posicaoY < 89) {
          posicaoY += velocidade;
          
        } else if (posicaoY >= 89 && posicaoY < 210) {
          posicaoY += velocidade;
          if (posicaoX >= 385) {
            posicaoX -= velocidade;
          }
          
        } else if (posicaoY >= 210 && posicaoY < 335) {
          posicaoY += velocidade;
          if (posicaoX <= 412) {
            posicaoX += velocidade;
          }
         
        } else if (posicaoY >= 335 && posicaoY < 458) {
          posicaoY += velocidade;
          if (posicaoX >= 385) {
            posicaoX -= velocidade;
          }

          
        } else if (posicaoY >= 458 && posicaoY < 580) {
          posicaoY += velocidade;
          if (posicaoX <= 412) {
            posicaoX += velocidade;
          }
          
        } else {
          posicaoX = posicaoInicialX;
          posicaoY = posicaoInicialY;
        }
        break;
    }

  }
/* ***************************************************************
* Metodo: getPosicaoX
* Funcao: esta funcao retorna a coordenada X atual do trem.
* Parametros: sem parametros
* Retorno: retorna a coordenada X atual do trem.
*************************************************************** */

  public int getPosicaoX() {
    return posicaoX;
  }
  
/* ***************************************************************
* Metodo: getPosicaoY
* Funcao: esta funcao retorna a coordenada Y atual do trem.
* Parametros: sem parametros
* Retorno: retorna a coordenada Y atual do trem.
*************************************************************** */
  public int getPosicaoY() {
    return posicaoY;
  }
/* ***************************************************************
* Metodo: setVelocidade
* Funcao: esta funcao atualiza a velocidade do trem.
* Parametros: Recebe o novo valor de velocidade.
* Retorno: sem retorno.
*************************************************************** */
  public void setVelocidade(int vel) {
    this.velocidade = vel;
  }
}
