/* ***************************************************************
* Autor............: Joao Victor Gomes Macedo
* Matricula........: 202210166
* Inicio...........: 25/08/2023
* Ultima alteracao.: 29/08/2023
* Nome.............: Coordenada
* Funcao...........: Esta classe tem a funcao de criar objetos 
		     para representar as coordenadas iniciais 
		     do trem.
*************************************************************** */
package model;

public class Coordenada {
  private int coordenadaX;//Coordenada X.
  private int coordenadaY;//Coordenada Y.
  
  public Coordenada(int x, int y){
    this.coordenadaX = x;
    this.coordenadaY = y;
  }
  
/* ***************************************************************
* Metodo: getCoordenadaX
* Funcao: Esta funcao retorna a coordenada X do conjunto (x,y) que 
	  compoe o objeto coordenada.
* Parametros: sem parametros
* Retorno: retorna a coordenada x de tipo inteiro.
*************************************************************** */
  public int getCoordenadaX() {
    return coordenadaX;
  }
  
/* ***************************************************************
* Metodo: getCoordenadaY
* Funcao: Esta funcao retorna a coordenada Y do conjunto (x,y) que 
	  compoe o objeto coordenada.
* Parametros: sem parametros
* Retorno: retorna a coordenada y de tipo inteiro.
*************************************************************** */
  public int getCoordenadaY() {
    return coordenadaY;
  }
}
